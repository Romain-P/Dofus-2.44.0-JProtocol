// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5653;
  // i8
  public byte jobId;
  // vi64
  public long playerId;

  public JobCrafterDirectoryRemoveMessage() {}

  public JobCrafterDirectoryRemoveMessage(byte jobId, long playerId) {
    this.jobId = jobId;
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId() {
    return 5653;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.jobId);
    writer.write_vi64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.jobId = reader.read_i8();
    this.playerId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "JobCrafterDirectoryRemoveMessage("
        + "jobId="
        + this.jobId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
