// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayNpcQuestFlag extends NetworkType {
  public static final int PROTOCOL_ID = 384;
  // array,vi16
  public short[] questsToValidId;
  // array,vi16
  public short[] questsToStartId;

  public GameRolePlayNpcQuestFlag()
  {}

  public GameRolePlayNpcQuestFlag(short[] questsToValidId, short[] questsToStartId)
  {
    this.questsToValidId = questsToValidId;
    this.questsToStartId = questsToStartId;
  }

  @Override
  public int getProtocolId()
  {
    return 384;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(questsToValidId.length);
    writer.write_array_vi16(this.questsToValidId);
    writer.write_ui16(questsToStartId.length);
    writer.write_array_vi16(this.questsToStartId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int questsToValidId_length = reader.read_ui16();
    this.questsToValidId = reader.read_array_vi16(questsToValidId_length);

    int questsToStartId_length = reader.read_ui16();
    this.questsToStartId = reader.read_array_vi16(questsToStartId_length);
  }

  @Override
  public String toString()
  {

    return "GameRolePlayNpcQuestFlag("
        + "questsToValidId="
        + java.util.Arrays.toString(this.questsToValidId)
        + ", questsToStartId="
        + java.util.Arrays.toString(this.questsToStartId)
        + ')';
  }
}
