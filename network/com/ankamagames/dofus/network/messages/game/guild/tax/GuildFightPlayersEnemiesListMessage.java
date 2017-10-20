// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightPlayersEnemiesListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5928;
  // f64
  public double fightId;
  // array,com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
      playerInfo;

  public GuildFightPlayersEnemiesListMessage() {}

  public GuildFightPlayersEnemiesListMessage(
      double fightId,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations[]
          playerInfo) {
    this.fightId = fightId;
    this.playerInfo = playerInfo;
  }

  public GuildFightPlayersEnemiesListMessage(
      double fightId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.character
                  .CharacterMinimalPlusLookInformations>
          playerInfo) {
    this.fightId = fightId;
    this.playerInfo =
        playerInfo.toArray(
            com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5928;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.fightId);
    writer.write_ui16(playerInfo.length);

    for (int i = 0; i < playerInfo.length; i++) {

      playerInfo[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_f64();

    int playerInfo_length = reader.read_ui16();
    this.playerInfo =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
            [playerInfo_length];

    for (int i = 0; i < playerInfo_length; i++) {

      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
          playerInfo_it =
              new com.ankamagames.dofus.network.types.game.character
                  .CharacterMinimalPlusLookInformations();

      playerInfo_it.deserialize(reader);
      this.playerInfo[i] = playerInfo_it;
    }
  }

  @Override
  public String toString() {

    return "GuildFightPlayersEnemiesListMessage("
        + "fightId="
        + this.fightId
        + ", playerInfo="
        + java.util.Arrays.toString(this.playerInfo)
        + ')';
  }
}
