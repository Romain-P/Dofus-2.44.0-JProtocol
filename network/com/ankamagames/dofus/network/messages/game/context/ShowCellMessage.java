// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShowCellMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5612;
  // f64
  public double sourceId;
  // vi16
  public short cellId;

  public ShowCellMessage()
  {}

  public ShowCellMessage(double sourceId, short cellId)
  {
    this.sourceId = sourceId;
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId()
  {
    return 5612;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.sourceId);
    writer.write_vi16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.sourceId = reader.read_f64();
    this.cellId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ShowCellMessage(" + "sourceId=" + this.sourceId + ", cellId=" + this.cellId + ')';
  }
}
