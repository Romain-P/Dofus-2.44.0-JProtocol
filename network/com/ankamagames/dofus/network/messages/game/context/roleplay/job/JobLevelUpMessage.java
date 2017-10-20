// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobLevelUpMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5656;
  // ui8
  public short newLevel;
  // com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
      jobsDescription;

  public JobLevelUpMessage() {}

  public JobLevelUpMessage(
      short newLevel,
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
          jobsDescription) {
    this.newLevel = newLevel;
    this.jobsDescription = jobsDescription;
  }

  @Override
  public int getProtocolId() {
    return 5656;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui8(this.newLevel);
    this.jobsDescription.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.newLevel = reader.read_ui8();
    this.jobsDescription =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription();
    this.jobsDescription.deserialize(reader);
  }

  @Override
  public String toString() {

    return "JobLevelUpMessage("
        + "newLevel="
        + this.newLevel
        + ", jobsDescription="
        + this.jobsDescription
        + ')';
  }
}
