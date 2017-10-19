// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaSwitchToFightServerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6575;
  // str
  public java.lang.String address;
  // array,ui16
  public int[] ports;
  // array,i8
  public byte[] ticket;

  public GameRolePlayArenaSwitchToFightServerMessage()
  {}

  public GameRolePlayArenaSwitchToFightServerMessage(
      java.lang.String address, int[] ports, byte[] ticket)
  {
    this.address = address;
    this.ports = ports;
    this.ticket = ticket;
  }

  @Override
  public int getProtocolId()
  {
    return 6575;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.address);
    writer.write_ui16(ports.length);
    writer.write_array_ui16(this.ports);
    writer.write_ui16(ticket.length);
    writer.write_array_i8(this.ticket);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.address = reader.read_str();

    int ports_length = reader.read_ui16();
    this.ports = reader.read_array_ui16(ports_length);

    int ticket_length = reader.read_ui16();
    this.ticket = reader.read_array_i8(ticket_length);
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaSwitchToFightServerMessage("
        + "address="
        + this.address
        + ", ports="
        + java.util.Arrays.toString(this.ports)
        + ", ticket="
        + +this.ticket.length
        + "b"
        + ')';
  }
}
