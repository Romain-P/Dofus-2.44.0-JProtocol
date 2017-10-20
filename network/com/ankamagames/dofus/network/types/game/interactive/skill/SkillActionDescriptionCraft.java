// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SkillActionDescriptionCraft
    extends com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription {
  public static final int PROTOCOL_ID = 100;
  // i8
  public byte probability;

  public SkillActionDescriptionCraft() {}

  public SkillActionDescriptionCraft(short skillId, byte probability) {

    super(skillId);
    this.probability = probability;
  }

  @Override
  public int getProtocolId() {
    return 100;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.probability);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.probability = reader.read_i8();
  }

  @Override
  public String toString() {

    return "SkillActionDescriptionCraft("
        + "skillId="
        + this.skillId
        + ", probability="
        + this.probability
        + ')';
  }
}
