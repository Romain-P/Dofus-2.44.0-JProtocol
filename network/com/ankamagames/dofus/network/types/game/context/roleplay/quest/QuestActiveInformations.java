// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestActiveInformations extends NetworkType {
  public static final int PROTOCOL_ID = 381;
  // vi16
  public short questId;

  public QuestActiveInformations()
  {}

  public QuestActiveInformations(short questId)
  {
    this.questId = questId;
  }

  @Override
  public int getProtocolId()
  {
    return 381;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.questId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.questId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "QuestActiveInformations(" + "questId=" + this.questId + ')';
  }
}
