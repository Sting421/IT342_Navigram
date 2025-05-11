package com.example.navigram;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\u0005R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/navigram/NavigramApplication;", "Landroid/app/Application;", "<init>", "()V", "value", "Lcom/example/navigram/data/api/ApiService;", "apiService", "getApiService", "()Lcom/example/navigram/data/api/ApiService;", "onCreate", "", "provideApiService", "app_release"})
public final class NavigramApplication extends android.app.Application {
    private com.example.navigram.data.api.ApiService apiService;
    
    public NavigramApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigram.data.api.ApiService getApiService() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.navigram.data.api.ApiService provideApiService() {
        return null;
    }
}