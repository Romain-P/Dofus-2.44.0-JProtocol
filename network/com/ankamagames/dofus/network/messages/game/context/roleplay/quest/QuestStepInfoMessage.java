// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestStepInfoMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5625;
  // com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations
      infos;

  public QuestStepInfoMessage()
  {}

  public QuestStepInfoMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations
          infos)
  {
    this.infos = infos;
  }

  @Override
  public int getProtocolId()
  {
    return 5625;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.infos.getProtocolId());
    this.infos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int infos_typeId = reader.read_ui16();
    this.infos =
        (com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveInformations)
            InternalProtocolTypeManager.get(infos_typeId);
    this.infos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "QuestStepInfoMessage(" + "infos=" + this.infos + ')';
  }
}
