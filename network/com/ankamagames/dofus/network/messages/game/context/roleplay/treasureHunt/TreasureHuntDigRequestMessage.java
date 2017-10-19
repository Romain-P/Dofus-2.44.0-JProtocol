// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntDigRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6485;
  // i8
  public byte questType;

  public TreasureHuntDigRequestMessage()
  {}

  public TreasureHuntDigRequestMessage(byte questType)
  {
    this.questType = questType;
  }

  @Override
  public int getProtocolId()
  {
    return 6485;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.questType);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.questType = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "TreasureHuntDigRequestMessage(" + "questType=" + this.questType + ')';
  }
}
