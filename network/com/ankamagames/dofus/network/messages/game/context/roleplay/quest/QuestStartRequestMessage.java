// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestStartRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5643;
  // vi16
  public short questId;

  public QuestStartRequestMessage()
  {}

  public QuestStartRequestMessage(short questId)
  {
    this.questId = questId;
  }

  @Override
  public int getProtocolId()
  {
    return 5643;
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

    return "QuestStartRequestMessage(" + "questId=" + this.questId + ')';
  }
}
