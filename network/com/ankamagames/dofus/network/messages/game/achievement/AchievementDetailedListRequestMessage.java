// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementDetailedListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6357;
  // vi16
  public short categoryId;

  public AchievementDetailedListRequestMessage()
  {}

  public AchievementDetailedListRequestMessage(short categoryId)
  {
    this.categoryId = categoryId;
  }

  @Override
  public int getProtocolId()
  {
    return 6357;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.categoryId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.categoryId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "AchievementDetailedListRequestMessage(" + "categoryId=" + this.categoryId + ')';
  }
}
