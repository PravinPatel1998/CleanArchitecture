package com.app.pravin_unit_testing.ui.post;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/app/pravin_unit_testing/ui/post/PostViewModel;", "Landroidx/lifecycle/ViewModel;", "postRepo", "Lcom/app/pravin_unit_testing/repository/PostRepo;", "(Lcom/app/pravin_unit_testing/repository/PostRepo;)V", "_postList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/app/pravin_unit_testing/network/NetworkState;", "", "Lcom/app/pravin_unit_testing/ui/post/PostModel;", "postListResponse", "Lkotlinx/coroutines/flow/StateFlow;", "getPostListResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "getPost", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PostViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.app.pravin_unit_testing.repository.PostRepo postRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.app.pravin_unit_testing.network.NetworkState<java.util.List<com.app.pravin_unit_testing.ui.post.PostModel>>> _postList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.app.pravin_unit_testing.network.NetworkState<java.util.List<com.app.pravin_unit_testing.ui.post.PostModel>>> postListResponse = null;
    
    @javax.inject.Inject()
    public PostViewModel(@org.jetbrains.annotations.NotNull()
    com.app.pravin_unit_testing.repository.PostRepo postRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.app.pravin_unit_testing.network.NetworkState<java.util.List<com.app.pravin_unit_testing.ui.post.PostModel>>> getPostListResponse() {
        return null;
    }
    
    public final void getPost() {
    }
}