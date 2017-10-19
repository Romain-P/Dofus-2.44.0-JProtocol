// Created by Heat the 2017-10-19 04:03:13+02:00
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
  // ui64
  public java.math.BigInteger playerId;

  public JobCrafterDirectoryRemoveMessage()
  {}

  public JobCrafterDirectoryRemoveMessage(byte jobId, java.math.BigInteger playerId)
  {
    this.jobId = jobId;
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 5653;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.jobId);
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.jobId = reader.read_i8();
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "JobCrafterDirectoryRemoveMessage("
        + "jobId="
        + this.jobId
        + ", playerId="
        + this.playerId
        + ')';
  }
}
