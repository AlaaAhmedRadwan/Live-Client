package com.codesroots.live.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/codesroots/live/presentation/Permissions;", "", "()V", "PERMISSION_ID", "", "getPERMISSION_ID", "()I", "CheckPermission", "", "context", "Landroid/content/Context;", "RequestPermission", "", "checkForInternet", "app_debug"})
public final class Permissions {
    private final int PERMISSION_ID = 1010;
    
    public Permissions() {
        super();
    }
    
    public final int getPERMISSION_ID() {
        return 0;
    }
    
    public final boolean CheckPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void RequestPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean checkForInternet(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}