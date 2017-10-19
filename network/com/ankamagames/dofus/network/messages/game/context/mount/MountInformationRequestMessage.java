// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountInformationRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5972;
  // f64
  public double id;
  // f64
  public double time;

  public MountInformationRequestMessage()
  {}

  public MountInformationRequestMessage(double id, double time)
  {
    this.id = id;
    this.time = time;
  }

  @Override
  public int getProtocolId()
  {
    return 5972;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.id);
    writer.write_f64(this.time);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_f64();
    this.time = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "MountInformationRequestMessage(" + "id=" + this.id + ", time=" + this.time + ')';
  }
}
