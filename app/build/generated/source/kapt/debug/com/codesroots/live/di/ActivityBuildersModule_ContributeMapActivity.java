package com.codesroots.live.di;

import com.codesroots.dagger.di.scopes.ActivityScope;
import com.codesroots.live.helper.FragmentFactoryModule;
import com.codesroots.live.presentation.map_activity.MapActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuildersModule_ContributeMapActivity.MapActivitySubcomponent.class)
public abstract class ActivityBuildersModule_ContributeMapActivity {
  private ActivityBuildersModule_ContributeMapActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MapActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MapActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {MainModule.class, FragmentFactoryModule.class})
  @ActivityScope
  public interface MapActivitySubcomponent extends AndroidInjector<MapActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MapActivity> {}
  }
}
