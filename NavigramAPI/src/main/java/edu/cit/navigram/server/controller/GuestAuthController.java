package edu.cit.navigram.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.cit.navigram.server.dto.AuthRequest;
import edu.cit.navigram.server.dto.AuthResponse;
import edu.cit.navigram.server.model.User;
import edu.cit.navigram.server.repository.UserRepository;
import edu.cit.navigram.server.security.JwtTokenProvider;
import edu.cit.navigram.server.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/guest/auth")
@CrossOrigin(origins = "*")
public class GuestAuthController {
    private static final Logger log = LoggerFactory.getLogger(GuestAuthController.class);

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider tokenProvider;
    private final UserService userService;

    public GuestAuthController(AuthenticationManager authenticationManager, JwtTokenProvider tokenProvider, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.tokenProvider = tokenProvider;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginRequest.getUsername(),
                loginRequest.getPassword()
            )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = tokenProvider.generateToken(authentication);
        User user = (User) authentication.getPrincipal();

        return ResponseEntity.ok(new AuthResponse(jwt, user.getId(), user.getUsername(), user.getEmail(), user.getRole()));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> createAndAuthenticateGuest() {
        log.info("Starting guest user creation and authentication");

        // Create guest user with raw password
        UserService.GuestAuthResult result = userService.createGuestUser();
        User user = result.getUser();
        String rawPassword = result.getPassword();

        try {
            // Authenticate with raw password
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    user.getUsername(),
                    rawPassword
                )
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = tokenProvider.generateToken(authentication);

            log.info("Guest user authenticated successfully: {}", user.getUsername());
            return ResponseEntity.ok(new AuthResponse(jwt, user.getId(), user.getUsername(), user.getEmail(), user.getRole(), rawPassword));
        } catch (Exception e) {
            log.error("Failed to authenticate guest user: {}", e.getMessage());
            throw e;
        }
    }
}

