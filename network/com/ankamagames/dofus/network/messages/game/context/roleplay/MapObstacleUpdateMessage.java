// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapObstacleUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6051;
  // array,com.ankamagames.dofus.network.types.game.interactive.MapObstacle
  public com.ankamagames.dofus.network.types.game.interactive.MapObstacle[] obstacles;

  public MapObstacleUpdateMessage()
  {}

  public MapObstacleUpdateMessage(
      com.ankamagames.dofus.network.types.game.interactive.MapObstacle[] obstacles)
  {
    this.obstacles = obstacles;
  }

  public MapObstacleUpdateMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.interactive.MapObstacle>
          obstacles)
  {
    this.obstacles =
        obstacles.toArray(com.ankamagames.dofus.network.types.game.interactive.MapObstacle[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6051;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(obstacles.length);

    for (int i = 0; i < obstacles.length; i++)
  {

      obstacles[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int obstacles_length = reader.read_ui16();
    this.obstacles =
        new com.ankamagames.dofus.network.types.game.interactive.MapObstacle[obstacles_length];

    for (int i = 0; i < obstacles_length; i++)
  {

      com.ankamagames.dofus.network.types.game.interactive.MapObstacle obstacles_it =
          new com.ankamagames.dofus.network.types.game.interactive.MapObstacle();

      obstacles_it.deserialize(reader);
      this.obstacles[i] = obstacles_it;
    }
  }

  @Override
  public String toString()
  {

    return "MapObstacleUpdateMessage("
        + "obstacles="
        + java.util.Arrays.toString(this.obstacles)
        + ')';
  }
}
