// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaSwitchToGameServerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6574;
  // bool
  public boolean validToken;
  // array,i8
  public byte[] ticket;
  // i16
  public short homeServerId;

  public GameRolePlayArenaSwitchToGameServerMessage()
  {}

  public GameRolePlayArenaSwitchToGameServerMessage(
      boolean validToken, byte[] ticket, short homeServerId)
  {
    this.validToken = validToken;
    this.ticket = ticket;
    this.homeServerId = homeServerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6574;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.validToken);
    writer.write_ui16(ticket.length);
    writer.write_array_i8(this.ticket);
    writer.write_i16(this.homeServerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.validToken = reader.read_bool();

    int ticket_length = reader.read_ui16();
    this.ticket = reader.read_array_i8(ticket_length);
    this.homeServerId = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayArenaSwitchToGameServerMessage("
        + "validToken="
        + this.validToken
        + ", ticket="
        + +this.ticket.length
        + "b"
        + ", homeServerId="
        + this.homeServerId
        + ')';
  }
}
