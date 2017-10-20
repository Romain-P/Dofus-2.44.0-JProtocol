// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ReloginTokenStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6539;
  // bool
  public boolean validToken;
  // array,i8
  public byte[] ticket;

  public ReloginTokenStatusMessage() {}

  public ReloginTokenStatusMessage(boolean validToken, byte[] ticket) {
    this.validToken = validToken;
    this.ticket = ticket;
  }

  @Override
  public int getProtocolId() {
    return 6539;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.validToken);
    writer.write_vi32(ticket.length);
    writer.write_array_i8(this.ticket);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.validToken = reader.read_bool();

    int ticket_length = reader.read_vi32();
    this.ticket = reader.read_array_i8(ticket_length);
  }

  @Override
  public String toString() {

    return "ReloginTokenStatusMessage("
        + "validToken="
        + this.validToken
        + ", ticket="
        + +this.ticket.length
        + "b"
        + ')';
  }
}
