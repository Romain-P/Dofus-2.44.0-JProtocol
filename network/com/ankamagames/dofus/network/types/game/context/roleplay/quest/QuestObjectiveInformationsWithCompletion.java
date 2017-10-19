// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestObjectiveInformationsWithCompletion
    extends com.ankamagames.dofus.network.types.game.context.roleplay.quest
        .QuestObjectiveInformations {
  public static final int PROTOCOL_ID = 386;
  // vi16
  public short curCompletion;
  // vi16
  public short maxCompletion;

  public QuestObjectiveInformationsWithCompletion()
  {}

  public QuestObjectiveInformationsWithCompletion(
      short objectiveId,
      boolean objectiveStatus,
      java.lang.String[] dialogParams,
      short curCompletion,
      short maxCompletion)
  {

    super(objectiveId, objectiveStatus, dialogParams);
    this.curCompletion = curCompletion;
    this.maxCompletion = maxCompletion;
  }

  @Override
  public int getProtocolId()
  {
    return 386;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.curCompletion);
    writer.write_vi16(this.maxCompletion);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.curCompletion = reader.read_vi16();
    this.maxCompletion = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "QuestObjectiveInformationsWithCompletion("
        + "objectiveId="
        + this.objectiveId
        + ", objectiveStatus="
        + this.objectiveStatus
        + ", dialogParams="
        + java.util.Arrays.toString(this.dialogParams)
        + ", curCompletion="
        + this.curCompletion
        + ", maxCompletion="
        + this.maxCompletion
        + ')';
  }
}
