package com.example.navigram.ui;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001e\u0010\"\u001a\u00020\u00182\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00180$H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0018\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J-\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\r2\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f022\u0006\u00103\u001a\u000204H\u0016\u00a2\u0006\u0002\u00105R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/example/navigram/ui/CameraCapture;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "camera", "Landroidx/camera/core/Camera;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "previewView", "Landroidx/camera/view/PreviewView;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "flashMode", "", "btnFlash", "Landroid/widget/ImageButton;", "focusIndicatorView", "Landroid/view/View;", "REQUEST_CODE_LOCATION", "REQUEST_CODE_CAMERA", "REQUEST_CODE_STORAGE", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startCamera", "switchCamera", "takePhoto", "convertToDegreeMinuteSecond", "", "decimal", "", "fetchLocation", "callback", "Lkotlin/Function1;", "Landroid/location/Location;", "setupTouchFocus", "handleFocus", "touchX", "", "touchY", "showFocusIndicator", "x", "y", "toggleFlash", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_release"})
public final class CameraCapture extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private androidx.camera.core.Camera camera;
    private androidx.camera.core.ImageCapture imageCapture;
    private androidx.camera.view.PreviewView previewView;
    @org.jetbrains.annotations.NotNull()
    private androidx.camera.core.CameraSelector cameraSelector;
    private int flashMode = androidx.camera.core.ImageCapture.FLASH_MODE_OFF;
    private android.widget.ImageButton btnFlash;
    private android.view.View focusIndicatorView;
    private final int REQUEST_CODE_LOCATION = 100;
    private final int REQUEST_CODE_CAMERA = 101;
    private final int REQUEST_CODE_STORAGE = 102;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    
    public CameraCapture() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startCamera() {
    }
    
    private final void switchCamera() {
    }
    
    private final void takePhoto() {
    }
    
    private final java.lang.String convertToDegreeMinuteSecond(double decimal) {
        return null;
    }
    
    private final void fetchLocation(kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> callback) {
    }
    
    private final void setupTouchFocus() {
    }
    
    private final void handleFocus(float touchX, float touchY) {
    }
    
    private final void showFocusIndicator(float x, float y) {
    }
    
    private final void toggleFlash() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}