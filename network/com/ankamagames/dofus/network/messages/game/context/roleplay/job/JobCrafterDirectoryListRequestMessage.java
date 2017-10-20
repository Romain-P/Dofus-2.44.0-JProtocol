// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6047;
  // i8
  public byte jobId;

  public JobCrafterDirectoryListRequestMessage() {}

  public JobCrafterDirectoryListRequestMessage(byte jobId) {
    this.jobId = jobId;
  }

  @Override
  public int getProtocolId() {
    return 6047;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryListRequestMessage(" + "jobId=" + this.jobId + ')';
  }
}
