package com.example.navigram.ui.login;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020\u00102\b\b\u0001\u0010\'\u001a\u00020\nH\u0002J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010)R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/navigram/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "_text", "Landroidx/lifecycle/MutableLiveData;", "", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "RC_SIGN_IN", "", "loginViewModel", "Lcom/example/navigram/ui/login/LoginViewModel;", "binding", "Lcom/example/navigram/databinding/ActivityLoginBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "isConnectedToWiFi", "", "context", "Landroid/content/Context;", "loginToNetwork", "username", "password", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginToNetworkAsGuest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "signInWithGoogle", "updateUiWithUser", "model", "Lcom/example/navigram/ui/login/LoggedInUserView;", "showLoginFailed", "errorString", "registerToNetworkAsGuest", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _text = null;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    private final int RC_SIGN_IN = 9001;
    private com.example.navigram.ui.login.LoginViewModel loginViewModel;
    private com.example.navigram.databinding.ActivityLoginBinding binding;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean isConnectedToWiFi(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final java.lang.Object loginToNetwork(android.content.Context context, java.lang.String username, java.lang.String password, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final java.lang.Object loginToNetworkAsGuest(java.lang.String username, java.lang.String password, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void signInWithGoogle() {
    }
    
    private final void updateUiWithUser(com.example.navigram.ui.login.LoggedInUserView model) {
    }
    
    private final void showLoginFailed(@androidx.annotation.StringRes()
    int errorString) {
    }
    
    private final java.lang.Object registerToNetworkAsGuest(android.content.Context context, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
}