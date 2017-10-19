// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareWonListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6682;
  // array,f64
  public double[] dareId;

  public DareWonListMessage()
  {}

  public DareWonListMessage(double[] dareId)
  {
    this.dareId = dareId;
  }

  @Override
  public int getProtocolId()
  {
    return 6682;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(dareId.length);
    writer.write_array_f64(this.dareId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int dareId_length = reader.read_ui16();
    this.dareId = reader.read_array_f64(dareId_length);
  }

  @Override
  public String toString()
  {

    return "DareWonListMessage(" + "dareId=" + java.util.Arrays.toString(this.dareId) + ')';
  }
}
