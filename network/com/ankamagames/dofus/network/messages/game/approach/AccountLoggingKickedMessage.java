// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.approach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountLoggingKickedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6029;
  // vi16
  public short days;
  // i8
  public byte hours;
  // i8
  public byte minutes;

  public AccountLoggingKickedMessage()
  {}

  public AccountLoggingKickedMessage(short days, byte hours, byte minutes)
  {
    this.days = days;
    this.hours = hours;
    this.minutes = minutes;
  }

  @Override
  public int getProtocolId()
  {
    return 6029;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.days);
    writer.write_i8(this.hours);
    writer.write_i8(this.minutes);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.days = reader.read_vi16();
    this.hours = reader.read_i8();
    this.minutes = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AccountLoggingKickedMessage("
        + "days="
        + this.days
        + ", hours="
        + this.hours
        + ", minutes="
        + this.minutes
        + ')';
  }
}
