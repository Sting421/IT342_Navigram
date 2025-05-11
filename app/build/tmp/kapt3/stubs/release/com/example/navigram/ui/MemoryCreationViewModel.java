package com.example.navigram.ui;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/example/navigram/ui/MemoryCreationViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/example/navigram/data/api/ApiService;", "<init>", "(Lcom/example/navigram/data/api/ApiService;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/navigram/ui/MemoryCreationState;", "kotlin.jvm.PlatformType", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "setMediaUri", "", "uri", "Landroid/net/Uri;", "setMediaUrl", "url", "", "setVisibility", "visibility", "setLocation", "latitude", "", "longitude", "uploadMemory", "description", "app_release"})
public final class MemoryCreationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.navigram.data.api.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.navigram.ui.MemoryCreationState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.navigram.ui.MemoryCreationState> state = null;
    
    public MemoryCreationViewModel(@org.jetbrains.annotations.NotNull()
    com.example.navigram.data.api.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.navigram.ui.MemoryCreationState> getState() {
        return null;
    }
    
    public final void setMediaUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    public final void setMediaUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setVisibility(@org.jetbrains.annotations.NotNull()
    java.lang.String visibility) {
    }
    
    public final void setLocation(double latitude, double longitude) {
    }
    
    public final void uploadMemory(@org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
}