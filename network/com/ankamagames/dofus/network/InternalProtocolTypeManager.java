// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network;

public final class InternalProtocolTypeManager {
  private InternalProtocolTypeManager() {}

  private static final ProtocolTypeManager INSTANCE = ProtocolTypeManager.createNewManager();

  @Deprecated
  public static Object get(int id) {
    return INSTANCE.create(id).get();
  }
}
