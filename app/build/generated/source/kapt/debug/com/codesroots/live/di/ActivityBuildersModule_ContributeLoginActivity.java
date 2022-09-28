package com.codesroots.live.di;

import com.codesroots.dagger.di.scopes.ActivityScope;
import com.codesroots.live.helper.FragmentFactoryModule;
import com.codesroots.live.presentation.auth.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeLoginActivity {
  private ActivityBuildersModule_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {MainModule.class, FragmentFactoryModule.class})
  @ActivityScope
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginActivity> {}
  }
}
