// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderRoomContentUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6250;
  // vi16
  public short dungeonId;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer[]
      addedPlayers;
  // array,ui64
  public java.math.BigInteger[] removedPlayersIds;

  public DungeonPartyFinderRoomContentUpdateMessage()
  {}

  public DungeonPartyFinderRoomContentUpdateMessage(
      short dungeonId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer[]
          addedPlayers,
      java.math.BigInteger[] removedPlayersIds)
  {
    this.dungeonId = dungeonId;
    this.addedPlayers = addedPlayers;
    this.removedPlayersIds = removedPlayersIds;
  }

  public DungeonPartyFinderRoomContentUpdateMessage(
      short dungeonId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .DungeonPartyFinderPlayer>
          addedPlayers,
      java.math.BigInteger[] removedPlayersIds)
  {
    this.dungeonId = dungeonId;
    this.addedPlayers =
        addedPlayers.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
                    []
                ::new);
    this.removedPlayersIds = removedPlayersIds;
  }

  @Override
  public int getProtocolId()
  {
    return 6250;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.dungeonId);
    writer.write_ui16(addedPlayers.length);

    for (int i = 0; i < addedPlayers.length; i++)
  {

      addedPlayers[i].serialize(writer);
    }
    writer.write_ui16(removedPlayersIds.length);
    writer.write_array_ui64(this.removedPlayersIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dungeonId = reader.read_vi16();

    int addedPlayers_length = reader.read_ui16();
    this.addedPlayers =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
            [addedPlayers_length];

    for (int i = 0; i < addedPlayers_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
          addedPlayers_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .DungeonPartyFinderPlayer();

      addedPlayers_it.deserialize(reader);
      this.addedPlayers[i] = addedPlayers_it;
    }

    int removedPlayersIds_length = reader.read_ui16();
    this.removedPlayersIds = reader.read_array_ui64(removedPlayersIds_length);
  }

  @Override
  public String toString()
  {

    return "DungeonPartyFinderRoomContentUpdateMessage("
        + "dungeonId="
        + this.dungeonId
        + ", addedPlayers="
        + java.util.Arrays.toString(this.addedPlayers)
        + ", removedPlayersIds="
        + java.util.Arrays.toString(this.removedPlayersIds)
        + ')';
  }
}
