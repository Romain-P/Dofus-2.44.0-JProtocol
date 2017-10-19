// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementObjective extends NetworkType {
  public static final int PROTOCOL_ID = 404;
  // vi32
  public int id;
  // vi16
  public short maxValue;

  public AchievementObjective()
  {}

  public AchievementObjective(int id, short maxValue)
  {
    this.id = id;
    this.maxValue = maxValue;
  }

  @Override
  public int getProtocolId()
  {
    return 404;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.id);
    writer.write_vi16(this.maxValue);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi32();
    this.maxValue = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "AchievementObjective(" + "id=" + this.id + ", maxValue=" + this.maxValue + ')';
  }
}
