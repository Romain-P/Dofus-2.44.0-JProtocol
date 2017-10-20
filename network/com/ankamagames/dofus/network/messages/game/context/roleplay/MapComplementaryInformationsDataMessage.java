// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapComplementaryInformationsDataMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 226;
  // vi16
  public short subAreaId;
  // f64
  public double mapId;
  // array,com.ankamagames.dofus.network.types.game.house.HouseInformations
  public com.ankamagames.dofus.network.types.game.house.HouseInformations[] houses;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations[]
      actors;
  // array,com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
  public com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[]
      interactiveElements;
  // array,com.ankamagames.dofus.network.types.game.interactive.StatedElement
  public com.ankamagames.dofus.network.types.game.interactive.StatedElement[] statedElements;
  // array,com.ankamagames.dofus.network.types.game.interactive.MapObstacle
  public com.ankamagames.dofus.network.types.game.interactive.MapObstacle[] obstacles;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations[] fights;
  // bool
  public boolean hasAggressiveMonsters;
  // com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
  public com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
      fightStartPositions;

  public MapComplementaryInformationsDataMessage() {}

  public MapComplementaryInformationsDataMessage(
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
          fightStartPositions) {
    this.subAreaId = subAreaId;
    this.mapId = mapId;
    this.houses = houses;
    this.actors = actors;
    this.interactiveElements = interactiveElements;
    this.statedElements = statedElements;
    this.obstacles = obstacles;
    this.fights = fights;
    this.hasAggressiveMonsters = hasAggressiveMonsters;
    this.fightStartPositions = fightStartPositions;
  }

  public MapComplementaryInformationsDataMessage(
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
          fightStartPositions) {
    this.subAreaId = subAreaId;
    this.mapId = mapId;
    this.houses =
        houses.toArray(com.ankamagames.dofus.network.types.game.house.HouseInformations[]::new);
    this.actors =
        actors.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
                    []
                ::new);
    this.interactiveElements =
        interactiveElements.toArray(
            com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[]::new);
    this.statedElements =
        statedElements.toArray(
            com.ankamagames.dofus.network.types.game.interactive.StatedElement[]::new);
    this.obstacles =
        obstacles.toArray(com.ankamagames.dofus.network.types.game.interactive.MapObstacle[]::new);
    this.fights =
        fights.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations[]::new);
    this.hasAggressiveMonsters = hasAggressiveMonsters;
    this.fightStartPositions = fightStartPositions;
  }

  @Override
  public int getProtocolId() {
    return 226;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.subAreaId);
    writer.write_f64(this.mapId);
    writer.write_ui16(houses.length);

    for (int i = 0; i < houses.length; i++) {

      writer.write_ui16(houses[i].getProtocolId());

      houses[i].serialize(writer);
    }
    writer.write_ui16(actors.length);

    for (int i = 0; i < actors.length; i++) {

      writer.write_ui16(actors[i].getProtocolId());

      actors[i].serialize(writer);
    }
    writer.write_ui16(interactiveElements.length);

    for (int i = 0; i < interactiveElements.length; i++) {

      writer.write_ui16(interactiveElements[i].getProtocolId());

      interactiveElements[i].serialize(writer);
    }
    writer.write_ui16(statedElements.length);

    for (int i = 0; i < statedElements.length; i++) {

      statedElements[i].serialize(writer);
    }
    writer.write_ui16(obstacles.length);

    for (int i = 0; i < obstacles.length; i++) {

      obstacles[i].serialize(writer);
    }
    writer.write_ui16(fights.length);

    for (int i = 0; i < fights.length; i++) {

      fights[i].serialize(writer);
    }
    writer.write_bool(this.hasAggressiveMonsters);
    this.fightStartPositions.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.subAreaId = reader.read_vi16();
    this.mapId = reader.read_f64();

    int houses_length = reader.read_ui16();
    this.houses =
        new com.ankamagames.dofus.network.types.game.house.HouseInformations[houses_length];

    for (int i = 0; i < houses_length; i++) {

      int houses_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.house.HouseInformations houses_it =
          (com.ankamagames.dofus.network.types.game.house.HouseInformations)
              InternalProtocolTypeManager.get(houses_it_typeId);

      houses_it.deserialize(reader);
      this.houses[i] = houses_it;
    }

    int actors_length = reader.read_ui16();
    this.actors =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
            [actors_length];

    for (int i = 0; i < actors_length; i++) {

      int actors_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
          actors_it =
              (com.ankamagames.dofus.network.types.game.context.roleplay
                      .GameRolePlayActorInformations)
                  InternalProtocolTypeManager.get(actors_it_typeId);

      actors_it.deserialize(reader);
      this.actors[i] = actors_it;
    }

    int interactiveElements_length = reader.read_ui16();
    this.interactiveElements =
        new com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
            [interactiveElements_length];

    for (int i = 0; i < interactiveElements_length; i++) {

      int interactiveElements_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
          interactiveElements_it =
              (com.ankamagames.dofus.network.types.game.interactive.InteractiveElement)
                  InternalProtocolTypeManager.get(interactiveElements_it_typeId);

      interactiveElements_it.deserialize(reader);
      this.interactiveElements[i] = interactiveElements_it;
    }

    int statedElements_length = reader.read_ui16();
    this.statedElements =
        new com.ankamagames.dofus.network.types.game.interactive.StatedElement
            [statedElements_length];

    for (int i = 0; i < statedElements_length; i++) {

      com.ankamagames.dofus.network.types.game.interactive.StatedElement statedElements_it =
          new com.ankamagames.dofus.network.types.game.interactive.StatedElement();

      statedElements_it.deserialize(reader);
      this.statedElements[i] = statedElements_it;
    }

    int obstacles_length = reader.read_ui16();
    this.obstacles =
        new com.ankamagames.dofus.network.types.game.interactive.MapObstacle[obstacles_length];

    for (int i = 0; i < obstacles_length; i++) {

      com.ankamagames.dofus.network.types.game.interactive.MapObstacle obstacles_it =
          new com.ankamagames.dofus.network.types.game.interactive.MapObstacle();

      obstacles_it.deserialize(reader);
      this.obstacles[i] = obstacles_it;
    }

    int fights_length = reader.read_ui16();
    this.fights =
        new com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations
            [fights_length];

    for (int i = 0; i < fights_length; i++) {

      com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations fights_it =
          new com.ankamagames.dofus.network.types.game.context.fight.FightCommonInformations();

      fights_it.deserialize(reader);
      this.fights[i] = fights_it;
    }
    this.hasAggressiveMonsters = reader.read_bool();
    this.fightStartPositions =
        new com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions();
    this.fightStartPositions.deserialize(reader);
  }

  @Override
  public String toString() {

    return "MapComplementaryInformationsDataMessage("
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
        + ')';
  }
}
