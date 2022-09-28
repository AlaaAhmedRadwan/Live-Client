// Generated by Dagger (https://dagger.dev).
package com.codesroots.live.di;

import com.github.nkzawa.socketio.client.Socket;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SocketModule_ProvideSocketFactory implements Factory<Socket> {
  private final SocketModule module;

  public SocketModule_ProvideSocketFactory(SocketModule module) {
    this.module = module;
  }

  @Override
  public Socket get() {
    return provideSocket(module);
  }

  public static SocketModule_ProvideSocketFactory create(SocketModule module) {
    return new SocketModule_ProvideSocketFactory(module);
  }

  public static Socket provideSocket(SocketModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSocket());
  }
}
