// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountRenamedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5983;
  // vi32
  public int mountId;
  // str
  public java.lang.String name;

  public MountRenamedMessage() {}

  public MountRenamedMessage(int mountId, java.lang.String name) {
    this.mountId = mountId;
    this.name = name;
  }

  @Override
  public int getProtocolId() {
    return 5983;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.mountId);
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mountId = reader.read_vi32();
    this.name = reader.read_str();
  }

  @Override
  public String toString() {

    return "MountRenamedMessage(" + "mountId=" + this.mountId + ", name=" + this.name + ')';
  }
}
