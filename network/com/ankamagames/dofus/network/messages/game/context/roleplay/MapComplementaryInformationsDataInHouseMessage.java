// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapComplementaryInformationsDataInHouseMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay
        .MapComplementaryInformationsDataMessage {
  public static final int PROTOCOL_ID = 6130;
  // com.ankamagames.dofus.network.types.game.house.HouseInformationsInside
  public com.ankamagames.dofus.network.types.game.house.HouseInformationsInside currentHouse;

  public MapComplementaryInformationsDataInHouseMessage() {}

  public MapComplementaryInformationsDataInHouseMessage(
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
      com.ankamagames.dofus.network.types.game.house.HouseInformationsInside currentHouse) {

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
    this.currentHouse = currentHouse;
  }

  public MapComplementaryInformationsDataInHouseMessage(
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
      com.ankamagames.dofus.network.types.game.house.HouseInformationsInside currentHouse) {

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
    this.currentHouse = currentHouse;
  }

  @Override
  public int getProtocolId() {
    return 6130;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.currentHouse.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.currentHouse =
        new com.ankamagames.dofus.network.types.game.house.HouseInformationsInside();
    this.currentHouse.deserialize(reader);
  }

  @Override
  public String toString() {

    return "MapComplementaryInformationsDataInHouseMessage("
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
        + ", currentHouse="
        + this.currentHouse
        + ')';
  }
}
