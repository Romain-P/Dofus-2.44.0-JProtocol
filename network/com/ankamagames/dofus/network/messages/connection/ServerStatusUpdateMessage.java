// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServerStatusUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 50;
  // com.ankamagames.dofus.network.types.connection.GameServerInformations
  public com.ankamagames.dofus.network.types.connection.GameServerInformations server;

  public ServerStatusUpdateMessage() {}

  public ServerStatusUpdateMessage(
      com.ankamagames.dofus.network.types.connection.GameServerInformations server) {
    this.server = server;
  }

  @Override
  public int getProtocolId() {
    return 50;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.server.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.server = new com.ankamagames.dofus.network.types.connection.GameServerInformations();
    this.server.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ServerStatusUpdateMessage(" + "server=" + this.server + ')';
  }
}
