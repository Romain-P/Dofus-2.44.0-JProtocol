// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.job;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobCrafterDirectoryEntryRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6043;
  // ui64
  public java.math.BigInteger playerId;

  public JobCrafterDirectoryEntryRequestMessage()
  {}

  public JobCrafterDirectoryEntryRequestMessage(java.math.BigInteger playerId)
  {
    this.playerId = playerId;
  }

  @Override
  public int getProtocolId()
  {
    return 6043;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.playerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.playerId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "JobCrafterDirectoryEntryRequestMessage(" + "playerId=" + this.playerId + ')';
  }
}
