// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementRewardable extends NetworkType {
  public static final int PROTOCOL_ID = 412;
  // vi16
  public short id;
  // ui8
  public short finishedlevel;

  public AchievementRewardable()
  {}

  public AchievementRewardable(short id, short finishedlevel)
  {
    this.id = id;
    this.finishedlevel = finishedlevel;
  }

  @Override
  public int getProtocolId()
  {
    return 412;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.id);
    writer.write_ui8(this.finishedlevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_vi16();
    this.finishedlevel = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "AchievementRewardable("
        + "id="
        + this.id
        + ", finishedlevel="
        + this.finishedlevel
        + ')';
  }
}
