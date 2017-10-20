// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapComplementaryInformationsDataInHavenBagMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay
        .MapComplementaryInformationsDataMessage {
  public static final int PROTOCOL_ID = 6622;
  // com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
      ownerInformations;
  // i8
  public byte theme;
  // i8
  public byte roomId;
  // i8
  public byte maxRoomId;

  public MapComplementaryInformationsDataInHavenBagMessage() {}

  public MapComplementaryInformationsDataInHavenBagMessage(
      short subAreaId,
      double mapId,
      com.ankamagames.dofus.network.types.game.house.HouseInformations[] houses,
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations[]
          actors,
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[] interactiveElements,
      com.ankamagames.dofus.network.types.game.interactive.StatedElement[] statedElements,
      com.ankamagames.dofus.network.types.game.interactive.MapObstacle[] obstacles,
      com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations[] fights,
      boolean hasAggressiveMonsters,
      com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
          fightStartPositions,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
          ownerInformations,
      byte theme,
      byte roomId,
      byte maxRoomId) {

    super(
        subAreaId,
        mapId,
        houses,
        actors,
        interactiveElements,
        statedElements,
        obstacles,
        fights,
        hasAggressiveMonsters,
        fightStartPositions);
    this.ownerInformations = ownerInformations;
    this.theme = theme;
    this.roomId = roomId;
    this.maxRoomId = maxRoomId;
  }

  public MapComplementaryInformationsDataInHavenBagMessage(
      short subAreaId,
      double mapId,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.house.HouseInformations>
          houses,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay
                  .GameRolePlayActorInformations>
          actors,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElement>
          interactiveElements,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.interactive.StatedElement>
          statedElements,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.interactive.MapObstacle>
          obstacles,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations>
          fights,
      boolean hasAggressiveMonsters,
      com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
          fightStartPositions,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations
          ownerInformations,
      byte theme,
      byte roomId,
      byte maxRoomId) {

    super(
        subAreaId,
        mapId,
        houses,
        actors,
        interactiveElements,
        statedElements,
        obstacles,
        fights,
        hasAggressiveMonsters,
        fightStartPositions);
    this.ownerInformations = ownerInformations;
    this.theme = theme;
    this.roomId = roomId;
    this.maxRoomId = maxRoomId;
  }

  @Override
  public int getProtocolId() {
    return 6622;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.ownerInformations.serialize(writer);
    writer.write_i8(this.theme);
    writer.write_i8(this.roomId);
    writer.write_i8(this.maxRoomId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.ownerInformations =
        new com.ankamagames.dofus.network.types.game.character.CharacterMinimalInformations();
    this.ownerInformations.deserialize(reader);
    this.theme = reader.read_i8();
    this.roomId = reader.read_i8();
    this.maxRoomId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "MapComplementaryInformationsDataInHavenBagMessage("
        + "subAreaId="
        + this.subAreaId
        + ", mapId="
        + this.mapId
        + ", houses="
        + java.util.Arrays.toString(this.houses)
        + ", actors="
        + java.util.Arrays.toString(this.actors)
        + ", interactiveElements="
        + java.util.Arrays.toString(this.interactiveElements)
        + ", statedElements="
        + java.util.Arrays.toString(this.statedElements)
        + ", obstacles="
        + java.util.Arrays.toString(this.obstacles)
        + ", fights="
        + java.util.Arrays.toString(this.fights)
        + ", hasAggressiveMonsters="
        + this.hasAggressiveMonsters
        + ", fightStartPositions="
        + this.fightStartPositions
        + ", ownerInformations="
        + this.ownerInformations
        + ", theme="
        + this.theme
        + ", roomId="
        + this.roomId
        + ", maxRoomId="
        + this.maxRoomId
        + ')';
  }
}
