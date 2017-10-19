// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementStartedObjective
    extends com.ankamagames.dofus.network.types.game.achievement.AchievementObjective {
  public static final int PROTOCOL_ID = 402;
  // vi16
  public short value;

  public AchievementStartedObjective()
  {}

  public AchievementStartedObjective(int id, short maxValue, short value)
  {

    super(id, maxValue);
    this.value = value;
  }

  @Override
  public int getProtocolId()
  {
    return 402;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.value);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.value = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "AchievementStartedObjective("
        + "id="
        + this.id
        + ", maxValue="
        + this.maxValue
        + ", value="
        + this.value
        + ')';
  }
}
