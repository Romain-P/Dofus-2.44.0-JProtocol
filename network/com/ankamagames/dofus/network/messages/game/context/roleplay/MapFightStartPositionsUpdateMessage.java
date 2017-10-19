// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapFightStartPositionsUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6716;
  // f64
  public double mapId;
  // com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
  public com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
      fightStartPositions;

  public MapFightStartPositionsUpdateMessage()
  {}

  public MapFightStartPositionsUpdateMessage(
      double mapId,
      com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions
          fightStartPositions)
  {
    this.mapId = mapId;
    this.fightStartPositions = fightStartPositions;
  }

  @Override
  public int getProtocolId()
  {
    return 6716;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.mapId);
    this.fightStartPositions.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.mapId = reader.read_f64();
    this.fightStartPositions =
        new com.ankamagames.dofus.network.types.game.context.fight.FightStartingPositions();
    this.fightStartPositions.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "MapFightStartPositionsUpdateMessage("
        + "mapId="
        + this.mapId
        + ", fightStartPositions="
        + this.fightStartPositions
        + ')';
  }
}
