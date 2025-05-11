package com.example.navigram.ui;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/navigram/ui/MemoryCreationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/example/navigram/ui/MemoryCreationViewModel;", "mediaTypeSpinner", "Landroid/widget/Spinner;", "descriptionInput", "Lcom/google/android/material/textfield/TextInputEditText;", "uploadButton", "Landroid/widget/Button;", "submitButton", "previewImage", "Landroid/widget/ImageView;", "mapView", "Lorg/osmdroid/views/MapView;", "currentMarker", "Lorg/osmdroid/views/overlay/Marker;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "getContent", "initializeMap", "", "onResume", "onPause", "checkLocationPermission", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showImagePicker", "validateForm", "", "getStoredToken", "uploadMemory", "description", "app_release"})
public final class MemoryCreationActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.navigram.ui.MemoryCreationViewModel viewModel;
    private android.widget.Spinner mediaTypeSpinner;
    private com.google.android.material.textfield.TextInputEditText descriptionInput;
    private android.widget.Button uploadButton;
    private android.widget.Button submitButton;
    private android.widget.ImageView previewImage;
    private org.osmdroid.views.MapView mapView;
    @org.jetbrains.annotations.Nullable()
    private org.osmdroid.views.overlay.Marker currentMarker;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> getContent = null;
    
    public MemoryCreationActivity() {
        super();
    }
    
    private final void initializeMap() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void checkLocationPermission() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
}