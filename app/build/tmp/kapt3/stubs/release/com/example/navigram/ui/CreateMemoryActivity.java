package com.example.navigram.ui;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\'H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u001cH\u0014J\b\u0010,\u001a\u00020\u001cH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/navigram/ui/CreateMemoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/example/navigram/ui/MemoryCreationViewModel;", "mediaTypeSpinner", "Landroid/widget/Spinner;", "visibilitySpinner", "descriptionInput", "Lcom/google/android/material/textfield/TextInputEditText;", "uploadButton", "Landroid/widget/Button;", "createButton", "previewImage", "Landroid/widget/ImageView;", "mapView", "Lorg/osmdroid/views/MapView;", "progressBar", "Landroid/widget/ProgressBar;", "currentMarker", "Lorg/osmdroid/views/overlay/Marker;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "getContent", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViewModel", "setupListeners", "observeViewModel", "initializeMap", "checkLocationPermission", "requestPermissions", "showImagePicker", "validateForm", "", "getStoredToken", "uploadMemory", "description", "onResume", "onPause", "app_release"})
public final class CreateMemoryActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.navigram.ui.MemoryCreationViewModel viewModel;
    private android.widget.Spinner mediaTypeSpinner;
    private android.widget.Spinner visibilitySpinner;
    private com.google.android.material.textfield.TextInputEditText descriptionInput;
    private android.widget.Button uploadButton;
    private android.widget.Button createButton;
    private android.widget.ImageView previewImage;
    private org.osmdroid.views.MapView mapView;
    private android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.Nullable()
    private org.osmdroid.views.overlay.Marker currentMarker;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> getContent = null;
    
    public CreateMemoryActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupListeners() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void initializeMap() {
    }
    
    private final void checkLocationPermission() {
    }
    
    private final void requestPermissions() {
    }
    
    private final void showImagePicker() {
    }
    
    private final boolean validateForm() {
        return false;
    }
    
    private final java.lang.String getStoredToken() {
        return null;
    }
    
    private final void uploadMemory(java.lang.String description) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
}