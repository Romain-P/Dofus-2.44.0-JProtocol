// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.common.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicStatMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6530;
  // f64
  public double timeSpent;
  // vi16
  public short statId;

  public BasicStatMessage()
  {}

  public BasicStatMessage(double timeSpent, short statId)
  {
    this.timeSpent = timeSpent;
    this.statId = statId;
  }

  @Override
  public int getProtocolId()
  {
    return 6530;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.timeSpent);
    writer.write_vi16(this.statId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.timeSpent = reader.read_f64();
    this.statId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "BasicStatMessage(" + "timeSpent=" + this.timeSpent + ", statId=" + this.statId + ')';
  }
}
