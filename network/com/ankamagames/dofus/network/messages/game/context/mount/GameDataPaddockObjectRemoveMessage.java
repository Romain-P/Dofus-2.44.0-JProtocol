// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameDataPaddockObjectRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5993;
  // vi16
  public short cellId;

  public GameDataPaddockObjectRemoveMessage()
  {}

  public GameDataPaddockObjectRemoveMessage(short cellId)
  {
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId()
  {
    return 5993;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.cellId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GameDataPaddockObjectRemoveMessage(" + "cellId=" + this.cellId + ')';
  }
}
