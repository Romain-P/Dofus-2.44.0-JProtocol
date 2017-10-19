// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapNoMovementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 954;
  // i16
  public short cellX;
  // i16
  public short cellY;

  public GameMapNoMovementMessage()
  {}

  public GameMapNoMovementMessage(short cellX, short cellY)
  {
    this.cellX = cellX;
    this.cellY = cellY;
  }

  @Override
  public int getProtocolId()
  {
    return 954;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i16(this.cellX);
    writer.write_i16(this.cellY);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.cellX = reader.read_i16();
    this.cellY = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "GameMapNoMovementMessage(" + "cellX=" + this.cellX + ", cellY=" + this.cellY + ')';
  }
}
