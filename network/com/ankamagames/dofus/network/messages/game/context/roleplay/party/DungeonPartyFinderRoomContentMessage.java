// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderRoomContentMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6247;
  // vi16
  public short dungeonId;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer[]
      players;

  public DungeonPartyFinderRoomContentMessage() {}

  public DungeonPartyFinderRoomContentMessage(
      short dungeonId,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer[]
          players) {
    this.dungeonId = dungeonId;
    this.players = players;
  }

  public DungeonPartyFinderRoomContentMessage(
      short dungeonId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .DungeonPartyFinderPlayer>
          players) {
    this.dungeonId = dungeonId;
    this.players =
        players.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6247;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.dungeonId);
    writer.write_ui16(players.length);

    for (int i = 0; i < players.length; i++) {

      players[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dungeonId = reader.read_vi16();

    int players_length = reader.read_ui16();
    this.players =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
            [players_length];

    for (int i = 0; i < players_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.DungeonPartyFinderPlayer
          players_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .DungeonPartyFinderPlayer();

      players_it.deserialize(reader);
      this.players[i] = players_it;
    }
  }

  @Override
  public String toString() {

    return "DungeonPartyFinderRoomContentMessage("
        + "dungeonId="
        + this.dungeonId
        + ", players="
        + java.util.Arrays.toString(this.players)
        + ')';
  }
}
