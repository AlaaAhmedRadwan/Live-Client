package com.codesroots.live.di;

import com.codesroots.dagger.di.scopes.ActivityScope;
import com.codesroots.live.helper.FragmentFactoryModule;
import com.codesroots.live.presentation.splashScreen.SplashScreen;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeSplashScreen.SplashScreenSubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeSplashScreen {
  private ActivityBuildersModule_ContributeSplashScreen() {}

  @Binds
  @IntoMap
  @ClassKey(SplashScreen.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashScreenSubcomponent.Factory builder);

  @Subcomponent(modules = {MainModule.class, FragmentFactoryModule.class})
  @ActivityScope
  public interface SplashScreenSubcomponent extends AndroidInjector<SplashScreen> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashScreen> {}
  }
}
