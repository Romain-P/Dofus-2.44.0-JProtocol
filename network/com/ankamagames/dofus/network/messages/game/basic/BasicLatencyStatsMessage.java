// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicLatencyStatsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5663;
  // ui16
  public int latency;
  // vi16
  public short sampleCount;
  // vi16
  public short max;

  public BasicLatencyStatsMessage()
  {}

  public BasicLatencyStatsMessage(int latency, short sampleCount, short max)
  {
    this.latency = latency;
    this.sampleCount = sampleCount;
    this.max = max;
  }

  @Override
  public int getProtocolId()
  {
    return 5663;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.latency);
    writer.write_vi16(this.sampleCount);
    writer.write_vi16(this.max);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.latency = reader.read_ui16();
    this.sampleCount = reader.read_vi16();
    this.max = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "BasicLatencyStatsMessage("
        + "latency="
        + this.latency
        + ", sampleCount="
        + this.sampleCount
        + ", max="
        + this.max
        + ')';
  }
}
