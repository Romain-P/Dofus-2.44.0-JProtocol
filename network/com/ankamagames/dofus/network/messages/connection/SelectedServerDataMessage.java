// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SelectedServerDataMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 42;
  // vi16
  public short serverId;
  // str
  public java.lang.String address;
  // ui16
  public int port;
  // bool
  public boolean canCreateNewCharacter;
  // array,i8
  public byte[] ticket;

  public SelectedServerDataMessage() {}

  public SelectedServerDataMessage(
      short serverId,
      java.lang.String address,
      int port,
      boolean canCreateNewCharacter,
      byte[] ticket) {
    this.serverId = serverId;
    this.address = address;
    this.port = port;
    this.canCreateNewCharacter = canCreateNewCharacter;
    this.ticket = ticket;
  }

  @Override
  public int getProtocolId() {
    return 42;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.serverId);
    writer.write_str(this.address);
    writer.write_ui16(this.port);
    writer.write_bool(this.canCreateNewCharacter);
    writer.write_vi32(ticket.length);
    writer.write_array_i8(this.ticket);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.serverId = reader.read_vi16();
    this.address = reader.read_str();
    this.port = reader.read_ui16();
    this.canCreateNewCharacter = reader.read_bool();

    int ticket_length = reader.read_vi32();
    this.ticket = reader.read_array_i8(ticket_length);
  }

  @Override
  public String toString() {

    return "SelectedServerDataMessage("
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
        + ')';
  }
}
