package com.codesroots.live.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/codesroots/live/di/CoroutinesDispatcherProvider;", "", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO$delegate", "Lkotlin/Lazy;", "Main", "getMain", "Main$delegate", "app_debug"})
public class CoroutinesDispatcherProvider {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy Main$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy IO$delegate = null;
    
    @javax.inject.Inject()
    public CoroutinesDispatcherProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.CoroutineDispatcher getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.CoroutineDispatcher getIO() {
        return null;
    }
}