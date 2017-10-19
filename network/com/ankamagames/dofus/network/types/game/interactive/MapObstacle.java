// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapObstacle extends NetworkType {
  public static final int PROTOCOL_ID = 200;
  // vi16
  public short obstacleCellId;
  // i8
  public byte state;

  public MapObstacle()
  {}

  public MapObstacle(short obstacleCellId, byte state)
  {
    this.obstacleCellId = obstacleCellId;
    this.state = state;
  }

  @Override
  public int getProtocolId()
  {
    return 200;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.obstacleCellId);
    writer.write_i8(this.state);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.obstacleCellId = reader.read_vi16();
    this.state = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "MapObstacle(" + "obstacleCellId=" + this.obstacleCellId + ", state=" + this.state + ')';
  }
}
