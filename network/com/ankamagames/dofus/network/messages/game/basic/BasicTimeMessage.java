// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicTimeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 175;
  // f64
  public double timestamp;
  // i16
  public short timezoneOffset;

  public BasicTimeMessage()
  {}

  public BasicTimeMessage(double timestamp, short timezoneOffset)
  {
    this.timestamp = timestamp;
    this.timezoneOffset = timezoneOffset;
  }

  @Override
  public int getProtocolId()
  {
    return 175;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.timestamp);
    writer.write_i16(this.timezoneOffset);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.timestamp = reader.read_f64();
    this.timezoneOffset = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "BasicTimeMessage("
        + "timestamp="
        + this.timestamp
        + ", timezoneOffset="
        + this.timezoneOffset
        + ')';
  }
}
