// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerSelectionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 40;
  // vi16
  public short serverId;

  public ServerSelectionMessage() {}

  public ServerSelectionMessage(short serverId) {
    this.serverId = serverId;
  }

  @Override
  public int getProtocolId() {
    return 40;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.serverId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.serverId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ServerSelectionMessage(" + "serverId=" + this.serverId + ')';
  }
}
