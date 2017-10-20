// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapComplementaryInformationsWithCoordsMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay
        .MapComplementaryInformationsDataMessage {
  public static final int PROTOCOL_ID = 6268;
  // i16
  public short worldX;
  // i16
  public short worldY;

  public MapComplementaryInformationsWithCoordsMessage() {}

  public MapComplementaryInformationsWithCoordsMessage(
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
      short worldX,
      short worldY) {

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
    this.worldX = worldX;
    this.worldY = worldY;
  }

  public MapComplementaryInformationsWithCoordsMessage(
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
      short worldX,
      short worldY) {

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
    this.worldX = worldX;
    this.worldY = worldY;
  }

  @Override
  public int getProtocolId() {
    return 6268;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
  }

  @Override
  public String toString() {

    return "MapComplementaryInformationsWithCoordsMessage("
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
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ')';
  }
}
