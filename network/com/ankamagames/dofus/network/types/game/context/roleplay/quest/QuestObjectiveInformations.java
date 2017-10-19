// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class QuestObjectiveInformations extends NetworkType {
  public static final int PROTOCOL_ID = 385;
  // vi16
  public short objectiveId;
  // bool
  public boolean objectiveStatus;
  // array,str
  public java.lang.String[] dialogParams;

  public QuestObjectiveInformations()
  {}

  public QuestObjectiveInformations(
      short objectiveId, boolean objectiveStatus, java.lang.String[] dialogParams)
  {
    this.objectiveId = objectiveId;
    this.objectiveStatus = objectiveStatus;
    this.dialogParams = dialogParams;
  }

  @Override
  public int getProtocolId()
  {
    return 385;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.objectiveId);
    writer.write_bool(this.objectiveStatus);
    writer.write_ui16(dialogParams.length);
    writer.write_array_str(this.dialogParams);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.objectiveId = reader.read_vi16();
    this.objectiveStatus = reader.read_bool();

    int dialogParams_length = reader.read_ui16();
    this.dialogParams = reader.read_array_str(dialogParams_length);
  }

  @Override
  public String toString()
  {

    return "QuestObjectiveInformations("
        + "objectiveId="
        + this.objectiveId
        + ", objectiveStatus="
        + this.objectiveStatus
        + ", dialogParams="
        + java.util.Arrays.toString(this.dialogParams)
        + ')';
  }
}
