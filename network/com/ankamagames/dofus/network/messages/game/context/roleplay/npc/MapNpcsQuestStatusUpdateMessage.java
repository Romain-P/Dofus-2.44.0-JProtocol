// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapNpcsQuestStatusUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5642;
  // f64
  public double mapId;
  // array,i32
  public int[] npcsIdsWithQuest;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
  public com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag[]
      questFlags;
  // array,i32
  public int[] npcsIdsWithoutQuest;

  public MapNpcsQuestStatusUpdateMessage()
  {}

  public MapNpcsQuestStatusUpdateMessage(
      double mapId,
      int[] npcsIdsWithQuest,
      com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag[]
          questFlags,
      int[] npcsIdsWithoutQuest)
  {
    this.mapId = mapId;
    this.npcsIdsWithQuest = npcsIdsWithQuest;
    this.questFlags = questFlags;
    this.npcsIdsWithoutQuest = npcsIdsWithoutQuest;
  }

  public MapNpcsQuestStatusUpdateMessage(
      double mapId,
      int[] npcsIdsWithQuest,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .GameRolePlayNpcQuestFlag>
          questFlags,
      int[] npcsIdsWithoutQuest)
  {
    this.mapId = mapId;
    this.npcsIdsWithQuest = npcsIdsWithQuest;
    this.questFlags =
        questFlags.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
                    []
                ::new);
    this.npcsIdsWithoutQuest = npcsIdsWithoutQuest;
  }

  @Override
  public int getProtocolId()
  {
    return 5642;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.mapId);
    writer.write_ui16(npcsIdsWithQuest.length);
    writer.write_array_i32(this.npcsIdsWithQuest);
    writer.write_ui16(questFlags.length);

    for (int i = 0; i < questFlags.length; i++)
  {

      questFlags[i].serialize(writer);
    }
    writer.write_ui16(npcsIdsWithoutQuest.length);
    writer.write_array_i32(this.npcsIdsWithoutQuest);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.mapId = reader.read_f64();

    int npcsIdsWithQuest_length = reader.read_ui16();
    this.npcsIdsWithQuest = reader.read_array_i32(npcsIdsWithQuest_length);

    int questFlags_length = reader.read_ui16();
    this.questFlags =
        new com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
            [questFlags_length];

    for (int i = 0; i < questFlags_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.quest.GameRolePlayNpcQuestFlag
          questFlags_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .GameRolePlayNpcQuestFlag();

      questFlags_it.deserialize(reader);
      this.questFlags[i] = questFlags_it;
    }

    int npcsIdsWithoutQuest_length = reader.read_ui16();
    this.npcsIdsWithoutQuest = reader.read_array_i32(npcsIdsWithoutQuest_length);
  }

  @Override
  public String toString()
  {

    return "MapNpcsQuestStatusUpdateMessage("
        + "mapId="
        + this.mapId
        + ", npcsIdsWithQuest="
        + java.util.Arrays.toString(this.npcsIdsWithQuest)
        + ", questFlags="
        + java.util.Arrays.toString(this.questFlags)
        + ", npcsIdsWithoutQuest="
        + java.util.Arrays.toString(this.npcsIdsWithoutQuest)
        + ')';
  }
}
