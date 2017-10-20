// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountDataMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5973;
  // com.ankamagames.dofus.network.types.game.mount.MountClientData
  public com.ankamagames.dofus.network.types.game.mount.MountClientData mountData;

  public MountDataMessage() {}

  public MountDataMessage(
      com.ankamagames.dofus.network.types.game.mount.MountClientData mountData) {
    this.mountData = mountData;
  }

  @Override
  public int getProtocolId() {
    return 5973;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.mountData.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mountData = new com.ankamagames.dofus.network.types.game.mount.MountClientData();
    this.mountData.deserialize(reader);
  }

  @Override
  public String toString() {

    return "MountDataMessage(" + "mountData=" + this.mountData + ')';
  }
}
