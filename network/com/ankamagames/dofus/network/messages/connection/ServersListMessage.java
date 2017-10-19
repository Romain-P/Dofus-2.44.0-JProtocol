// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ServersListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 30;
  // array,com.ankamagames.dofus.network.types.connection.GameServerInformations
  public com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers;
  // vi16
  public short alreadyConnectedToServerId;
  // bool
  public boolean canCreateNewCharacter;

  public ServersListMessage()
  {}

  public ServersListMessage(
      com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers,
      short alreadyConnectedToServerId,
      boolean canCreateNewCharacter)
  {
    this.servers = servers;
    this.alreadyConnectedToServerId = alreadyConnectedToServerId;
    this.canCreateNewCharacter = canCreateNewCharacter;
  }

  public ServersListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.connection.GameServerInformations>
          servers,
      short alreadyConnectedToServerId,
      boolean canCreateNewCharacter)
  {
    this.servers =
        servers.toArray(
            com.ankamagames.dofus.network.types.connection.GameServerInformations[]::new);
    this.alreadyConnectedToServerId = alreadyConnectedToServerId;
    this.canCreateNewCharacter = canCreateNewCharacter;
  }

  @Override
  public int getProtocolId()
  {
    return 30;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(servers.length);

    for (int i = 0; i < servers.length; i++)
  {

      servers[i].serialize(writer);
    }
    writer.write_vi16(this.alreadyConnectedToServerId);
    writer.write_bool(this.canCreateNewCharacter);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int servers_length = reader.read_ui16();
    this.servers =
        new com.ankamagames.dofus.network.types.connection.GameServerInformations[servers_length];

    for (int i = 0; i < servers_length; i++)
  {

      com.ankamagames.dofus.network.types.connection.GameServerInformations servers_it =
          new com.ankamagames.dofus.network.types.connection.GameServerInformations();

      servers_it.deserialize(reader);
      this.servers[i] = servers_it;
    }
    this.alreadyConnectedToServerId = reader.read_vi16();
    this.canCreateNewCharacter = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "ServersListMessage("
        + "servers="
        + java.util.Arrays.toString(this.servers)
        + ", alreadyConnectedToServerId="
        + this.alreadyConnectedToServerId
        + ", canCreateNewCharacter="
        + this.canCreateNewCharacter
        + ')';
  }
}
