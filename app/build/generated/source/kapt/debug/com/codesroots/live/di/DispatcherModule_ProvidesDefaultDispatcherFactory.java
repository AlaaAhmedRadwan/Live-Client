// Generated by Dagger (https://dagger.dev).
package com.codesroots.live.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatcherModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesDefaultDispatcher();
  }

  public static DispatcherModule_ProvidesDefaultDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesDefaultDispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatcherModule.INSTANCE.providesDefaultDispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatcherModule_ProvidesDefaultDispatcherFactory INSTANCE = new DispatcherModule_ProvidesDefaultDispatcherFactory();
  }
}
