// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SelectedServerDataExtendedMessage
    extends com.ankamagames.dofus.network.messages.connection.SelectedServerDataMessage {
  public static final int PROTOCOL_ID = 6469;
  // array,com.ankamagames.dofus.network.types.connection.GameServerInformations
  public com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers;

  public SelectedServerDataExtendedMessage() {}

  public SelectedServerDataExtendedMessage(
      short serverId,
      java.lang.String address,
      int port,
      boolean canCreateNewCharacter,
      byte[] ticket,
      com.ankamagames.dofus.network.types.connection.GameServerInformations[] servers) {

    super(serverId, address, port, canCreateNewCharacter, ticket);
    this.servers = servers;
  }

  public SelectedServerDataExtendedMessage(
      short serverId,
      java.lang.String address,
      int port,
      boolean canCreateNewCharacter,
      byte[] ticket,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.connection.GameServerInformations>
          servers) {

    super(serverId, address, port, canCreateNewCharacter, ticket);
    this.servers =
        servers.toArray(
            com.ankamagames.dofus.network.types.connection.GameServerInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6469;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(servers.length);

    for (int i = 0; i < servers.length; i++) {

      servers[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int servers_length = reader.read_ui16();
    this.servers =
        new com.ankamagames.dofus.network.types.connection.GameServerInformations[servers_length];

    for (int i = 0; i < servers_length; i++) {

      com.ankamagames.dofus.network.types.connection.GameServerInformations servers_it =
          new com.ankamagames.dofus.network.types.connection.GameServerInformations();

      servers_it.deserialize(reader);
      this.servers[i] = servers_it;
    }
  }

  @Override
  public String toString() {

    return "SelectedServerDataExtendedMessage("
        + "serverId="
        + this.serverId
        + ", address="
        + this.address
        + ", port="
        + this.port
        + ", canCreateNewCharacter="
        + this.canCreateNewCharacter
        + ", ticket="
        + +this.ticket.length
        + "b"
        + ", servers="
        + java.util.Arrays.toString(this.servers)
        + ')';
  }
}
