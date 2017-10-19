// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestActiveDetailedInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.quest
        .QuestActiveInformations {
  public static final int PROTOCOL_ID = 382;
  // vi16
  public short stepId;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestObjectiveInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestObjectiveInformations
          []
      objectives;

  public QuestActiveDetailedInformations()
  {}

  public QuestActiveDetailedInformations(
      short questId,
      short stepId,
      com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestObjectiveInformations[]
          objectives)
  {

    super(questId);
    this.stepId = stepId;
    this.objectives = objectives;
  }

  public QuestActiveDetailedInformations(
      short questId,
      short stepId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .QuestObjectiveInformations>
          objectives)
  {

    super(questId);
    this.stepId = stepId;
    this.objectives =
        objectives.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.quest
                        .QuestObjectiveInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 382;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.stepId);
    writer.write_ui16(objectives.length);

    for (int i = 0; i < objectives.length; i++)
  {

      writer.write_ui16(objectives[i].getProtocolId());

      objectives[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.stepId = reader.read_vi16();

    int objectives_length = reader.read_ui16();
    this.objectives =
        new com.ankamagames.dofus.network.types.game.context.roleplay.quest
                .QuestObjectiveInformations[objectives_length];

    for (int i = 0; i < objectives_length; i++)
  {

      int objectives_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestObjectiveInformations
          objectives_it =
              (com.ankamagames.dofus.network.types.game.context.roleplay.quest
                      .QuestObjectiveInformations)
                  InternalProtocolTypeManager.get(objectives_it_typeId);

      objectives_it.deserialize(reader);
      this.objectives[i] = objectives_it;
    }
  }

  @Override
  public String toString()
  {

    return "QuestActiveDetailedInformations("
        + "questId="
        + this.questId
        + ", stepId="
        + this.stepId
        + ", objectives="
        + java.util.Arrays.toString(this.objectives)
        + ')';
  }
}
