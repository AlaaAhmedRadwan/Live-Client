package com.codesroots.live.presentation.profile_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0012\u00101\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0016J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u00a8\u0006>"}, d2 = {"Lcom/codesroots/live/presentation/profile_fragment/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CAMERA_PIC_REQUEST", "", "LOAD_IMG_REQUEST_CODE", "REQUEST_PICK_PHOTO", "REQUEST_TAKE_PHOTO", "fileUri", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "setFileUri", "(Landroid/net/Uri;)V", "mImageFileLocation", "", "mediaPath", "postPath", "pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "startForProfileImageResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "view", "Lcom/codesroots/live/databinding/ProfileFragmentBinding;", "getView", "()Lcom/codesroots/live/databinding/ProfileFragmentBinding;", "setView", "(Lcom/codesroots/live/databinding/ProfileFragmentBinding;)V", "viewModel", "Lcom/codesroots/live/presentation/profile_fragment/viewmodel/ProfileViewmodel;", "getViewModel", "()Lcom/codesroots/live/presentation/profile_fragment/viewmodel/ProfileViewmodel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "addimage", "", "editRequest", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "prepareFilePart", "Lokhttp3/MultipartBody$Part;", "name", "Companion", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.profile_fragment.ProfileFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TownBottomSheetDialogFragment";
    private final int LOAD_IMG_REQUEST_CODE = 123;
    private final int REQUEST_PICK_PHOTO = 2;
    private final int REQUEST_TAKE_PHOTO = 0;
    private java.lang.String mediaPath;
    private java.lang.String postPath;
    private final int CAMERA_PIC_REQUEST = 1111;
    private final java.lang.String mImageFileLocation = "";
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri fileUri;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper pref;
    public com.codesroots.live.databinding.ProfileFragmentBinding view;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForProfileImageResult = null;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Inject()
    public ProfileFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getFileUri() {
        return null;
    }
    
    public final void setFileUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.profile_fragment.viewmodel.ProfileViewmodel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.databinding.ProfileFragmentBinding getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.databinding.ProfileFragmentBinding p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void addimage() {
    }
    
    private final okhttp3.MultipartBody.Part prepareFilePart(java.lang.String name, android.net.Uri fileUri) {
        return null;
    }
    
    public final void editRequest() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codesroots/live/presentation/profile_fragment/ProfileFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}