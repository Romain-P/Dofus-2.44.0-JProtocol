// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapCoordinates extends NetworkType {
  public static final int PROTOCOL_ID = 174;
  // i16
  public short worldX;
  // i16
  public short worldY;

  public MapCoordinates()
  {}

  public MapCoordinates(short worldX, short worldY)
  {
    this.worldX = worldX;
    this.worldY = worldY;
  }

  @Override
  public int getProtocolId()
  {
    return 174;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "MapCoordinates(" + "worldX=" + this.worldX + ", worldY=" + this.worldY + ')';
  }
}
