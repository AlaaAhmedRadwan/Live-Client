// Generated by Dagger (https://dagger.dev).
package com.codesroots.live.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.converter.gson.GsonConverterFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIModule_ProvideConverterFactoryFactory implements Factory<GsonConverterFactory> {
  private final APIModule module;

  public APIModule_ProvideConverterFactoryFactory(APIModule module) {
    this.module = module;
  }

  @Override
  public GsonConverterFactory get() {
    return provideConverterFactory(module);
  }

  public static APIModule_ProvideConverterFactoryFactory create(APIModule module) {
    return new APIModule_ProvideConverterFactoryFactory(module);
  }

  public static GsonConverterFactory provideConverterFactory(APIModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideConverterFactory());
  }
}
