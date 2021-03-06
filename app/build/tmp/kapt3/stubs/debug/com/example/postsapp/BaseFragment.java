package com.example.postsapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00100\u001a\u00020#H\u0002J\u0006\u00101\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00062"}, d2 = {"Lcom/example/postsapp/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "contentContainer", "Landroid/widget/FrameLayout;", "getContentContainer", "()Landroid/widget/FrameLayout;", "setContentContainer", "(Landroid/widget/FrameLayout;)V", "isOnline", "", "()Z", "setOnline", "(Z)V", "llNoInternet", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLlNoInternet", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setLlNoInternet", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "tvTryAgain", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvTryAgain", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTvTryAgain", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "internetCheckProcess", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "registerBroadcasts", "unregisterBroadcasts", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public android.widget.FrameLayout contentContainer;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.LinearLayoutCompat llNoInternet;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.AppCompatTextView tvTryAgain;
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    private boolean isOnline;
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getContentContainer() {
        return null;
    }
    
    public final void setContentContainer(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.LinearLayoutCompat getLlNoInternet() {
        return null;
    }
    
    public final void setLlNoInternet(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.LinearLayoutCompat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getTvTryAgain() {
        return null;
    }
    
    public final void setTvTryAgain(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public void internetCheckProcess() {
    }
    
    private final void registerBroadcasts() {
    }
    
    public final void unregisterBroadcasts() {
    }
    
    public BaseFragment() {
        super();
    }
}