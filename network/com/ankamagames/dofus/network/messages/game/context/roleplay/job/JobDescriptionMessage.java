// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobDescriptionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5655;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
  public com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription[]
      jobsDescription;

  public JobDescriptionMessage() {}

  public JobDescriptionMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription[]
          jobsDescription) {
    this.jobsDescription = jobsDescription;
  }

  public JobDescriptionMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription>
          jobsDescription) {
    this.jobsDescription =
        jobsDescription.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5655;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(jobsDescription.length);

    for (int i = 0; i < jobsDescription.length; i++) {

      jobsDescription[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int jobsDescription_length = reader.read_ui16();
    this.jobsDescription =
        new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
            [jobsDescription_length];

    for (int i = 0; i < jobsDescription_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription
          jobsDescription_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.job.JobDescription();

      jobsDescription_it.deserialize(reader);
      this.jobsDescription[i] = jobsDescription_it;
    }
  }

  @Override
  public String toString() {

    return "JobDescriptionMessage("
        + "jobsDescription="
        + java.util.Arrays.toString(this.jobsDescription)
        + ')';
  }
}
