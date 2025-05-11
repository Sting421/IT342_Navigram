package com.example.navigram.data.api;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u0003H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u0003H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/navigram/data/api/ApiService;", "", "createMemory", "Lretrofit2/Response;", "Lcom/example/navigram/data/api/CreateMemoryResponse;", "request", "Lcom/example/navigram/data/api/CreateMemoryRequest;", "(Lcom/example/navigram/data/api/CreateMemoryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lcom/example/navigram/data/api/UserResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserProfile", "userId", "", "Lcom/example/navigram/data/api/UpdateUserRequest;", "(Ljava/lang/String;Lcom/example/navigram/data/api/UpdateUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMemories", "", "getAllUsers", "getPublicUserProfile", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface ApiService {
    
    @retrofit2.http.POST(value = "api/memories")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createMemory(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.navigram.data.api.CreateMemoryRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.navigram.data.api.CreateMemoryResponse>> $completion);
    
    @retrofit2.http.GET(value = "api/auth/me")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.navigram.data.api.UserResponse>> $completion);
    
    @retrofit2.http.PUT(value = "api/users/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserProfile(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.navigram.data.api.UpdateUserRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.navigram.data.api.UserResponse>> $completion);
    
    @retrofit2.http.GET(value = "api/memories")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMemories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.navigram.data.api.CreateMemoryResponse>>> $completion);
    
    @retrofit2.http.GET(value = "api/users/all")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.navigram.data.api.UserResponse>>> $completion);
    
    @retrofit2.http.GET(value = "api/users/{userId}/profile")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPublicUserProfile(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.navigram.data.api.UserResponse>> $completion);
}