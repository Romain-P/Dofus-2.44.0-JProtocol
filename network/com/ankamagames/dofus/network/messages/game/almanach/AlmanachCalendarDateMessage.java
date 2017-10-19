// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.almanach;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlmanachCalendarDateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6341;
  // i32
  public int date;

  public AlmanachCalendarDateMessage()
  {}

  public AlmanachCalendarDateMessage(int date)
  {
    this.date = date;
  }

  @Override
  public int getProtocolId()
  {
    return 6341;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.date);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.date = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "AlmanachCalendarDateMessage(" + "date=" + this.date + ')';
  }
}
