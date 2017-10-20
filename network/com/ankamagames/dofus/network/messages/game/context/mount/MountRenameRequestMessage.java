// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountRenameRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5987;
  // str
  public java.lang.String name;
  // vi32
  public int mountId;

  public MountRenameRequestMessage() {}

  public MountRenameRequestMessage(java.lang.String name, int mountId) {
    this.name = name;
    this.mountId = mountId;
  }

  @Override
  public int getProtocolId() {
    return 5987;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.name);
    writer.write_vi32(this.mountId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.name = reader.read_str();
    this.mountId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "MountRenameRequestMessage(" + "name=" + this.name + ", mountId=" + this.mountId + ')';
  }
}
