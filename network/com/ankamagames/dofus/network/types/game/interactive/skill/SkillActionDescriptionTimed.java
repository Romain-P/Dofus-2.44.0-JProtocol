// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SkillActionDescriptionTimed
    extends com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription {
  public static final int PROTOCOL_ID = 103;
  // ui8
  public short time;

  public SkillActionDescriptionTimed() {}

  public SkillActionDescriptionTimed(short skillId, short time) {

    super(skillId);
    this.time = time;
  }

  @Override
  public int getProtocolId() {
    return 103;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui8(this.time);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.time = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "SkillActionDescriptionTimed(" + "skillId=" + this.skillId + ", time=" + this.time + ')';
  }
}
