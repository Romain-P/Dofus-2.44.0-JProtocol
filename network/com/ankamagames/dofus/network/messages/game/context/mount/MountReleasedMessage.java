// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountReleasedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6308;
  // vi32
  public int mountId;

  public MountReleasedMessage() {}

  public MountReleasedMessage(int mountId) {
    this.mountId = mountId;
  }

  @Override
  public int getProtocolId() {
    return 6308;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.mountId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mountId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "MountReleasedMessage(" + "mountId=" + this.mountId + ')';
  }
}
