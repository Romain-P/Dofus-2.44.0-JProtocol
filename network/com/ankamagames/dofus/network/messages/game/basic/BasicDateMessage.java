// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicDateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 177;
  // i8
  public byte day;
  // i8
  public byte month;
  // i16
  public short year;

  public BasicDateMessage()
  {}

  public BasicDateMessage(byte day, byte month, short year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public int getProtocolId()
  {
    return 177;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.day);
    writer.write_i8(this.month);
    writer.write_i16(this.year);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.day = reader.read_i8();
    this.month = reader.read_i8();
    this.year = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "BasicDateMessage("
        + "day="
        + this.day
        + ", month="
        + this.month
        + ", year="
        + this.year
        + ')';
  }
}
