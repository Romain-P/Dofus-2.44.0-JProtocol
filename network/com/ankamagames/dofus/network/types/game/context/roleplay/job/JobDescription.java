// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobDescription extends NetworkType {
  public static final int PROTOCOL_ID = 101;
  // i8
  public byte jobId;
  // array,com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription
  public com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription[] skills;

  public JobDescription() {}

  public JobDescription(
      byte jobId,
      com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription[] skills) {
    this.jobId = jobId;
    this.skills = skills;
  }

  public JobDescription(
      byte jobId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription>
          skills) {
    this.jobId = jobId;
    this.skills =
        skills.toArray(
            com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 101;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_ui16(skills.length);

    for (int i = 0; i < skills.length; i++) {

      writer.write_ui16(skills[i].getProtocolId());

      skills[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();

    int skills_length = reader.read_ui16();
    this.skills =
        new com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription
            [skills_length];

    for (int i = 0; i < skills_length; i++) {

      int skills_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription skills_it =
          (com.ankamagames.dofus.network.types.game.interactive.skill.SkillActionDescription)
              InternalProtocolTypeManager.get(skills_it_typeId);

      skills_it.deserialize(reader);
      this.skills[i] = skills_it;
    }
  }

  @Override
  public String toString() {

    return "JobDescription("
        + "jobId="
        + this.jobId
        + ", skills="
        + java.util.Arrays.toString(this.skills)
        + ')';
  }
}
