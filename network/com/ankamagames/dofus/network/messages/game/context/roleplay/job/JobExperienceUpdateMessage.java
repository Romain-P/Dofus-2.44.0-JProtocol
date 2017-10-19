// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobExperienceUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5654;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
      experiencesUpdate;

  public JobExperienceUpdateMessage()
  {}

  public JobExperienceUpdateMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience
          experiencesUpdate)
  {
    this.experiencesUpdate = experiencesUpdate;
  }

  @Override
  public int getProtocolId()
  {
    return 5654;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.experiencesUpdate.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.experiencesUpdate =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobExperience();
    this.experiencesUpdate.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "JobExperienceUpdateMessage(" + "experiencesUpdate=" + this.experiencesUpdate + ')';
  }
}
