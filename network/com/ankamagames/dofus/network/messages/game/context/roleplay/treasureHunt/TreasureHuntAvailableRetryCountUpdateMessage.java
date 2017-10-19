// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntAvailableRetryCountUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6491;
  // i8
  public byte questType;
  // i32
  public int availableRetryCount;

  public TreasureHuntAvailableRetryCountUpdateMessage()
  {}

  public TreasureHuntAvailableRetryCountUpdateMessage(byte questType, int availableRetryCount)
  {
    this.questType = questType;
    this.availableRetryCount = availableRetryCount;
  }

  @Override
  public int getProtocolId()
  {
    return 6491;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.questType);
    writer.write_i32(this.availableRetryCount);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.questType = reader.read_i8();
    this.availableRetryCount = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "TreasureHuntAvailableRetryCountUpdateMessage("
        + "questType="
        + this.questType
        + ", availableRetryCount="
        + this.availableRetryCount
        + ')';
  }
}
