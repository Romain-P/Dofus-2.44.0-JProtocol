// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobExperienceMultiUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5809;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience[]
      experiencesUpdate;

  public JobExperienceMultiUpdateMessage()
  {}

  public JobExperienceMultiUpdateMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience[]
          experiencesUpdate)
  {
    this.experiencesUpdate = experiencesUpdate;
  }

  public JobExperienceMultiUpdateMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience>
          experiencesUpdate)
  {
    this.experiencesUpdate =
        experiencesUpdate.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5809;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(experiencesUpdate.length);

    for (int i = 0; i < experiencesUpdate.length; i++)
  {

      experiencesUpdate[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int experiencesUpdate_length = reader.read_ui16();
    this.experiencesUpdate =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
            [experiencesUpdate_length];

    for (int i = 0; i < experiencesUpdate_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
          experiencesUpdate_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience();

      experiencesUpdate_it.deserialize(reader);
      this.experiencesUpdate[i] = experiencesUpdate_it;
    }
  }

  @Override
  public String toString()
  {

    return "JobExperienceMultiUpdateMessage("
        + "experiencesUpdate="
        + java.util.Arrays.toString(this.experiencesUpdate)
        + ')';
  }
}
