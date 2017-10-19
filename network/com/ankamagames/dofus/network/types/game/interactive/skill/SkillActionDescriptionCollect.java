// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SkillActionDescriptionCollect
    extends com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescriptionTimed {
  public static final int PROTOCOL_ID = 99;
  // vi16
  public short min;
  // vi16
  public short max;

  public SkillActionDescriptionCollect()
  {}

  public SkillActionDescriptionCollect(short skillId, short time, short min, short max)
  {

    super(skillId, time);
    this.min = min;
    this.max = max;
  }

  @Override
  public int getProtocolId()
  {
    return 99;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.min);
    writer.write_vi16(this.max);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.min = reader.read_vi16();
    this.max = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "SkillActionDescriptionCollect("
        + "skillId="
        + this.skillId
        + ", time="
        + this.time
        + ", min="
        + this.min
        + ", max="
        + this.max
        + ')';
  }
}
