// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight
        .GameFightPlacementPositionRequestMessage {
  public static final int PROTOCOL_ID = 6541;
  // f64
  public double requestedId;

  public GameFightPlacementSwapPositionsRequestMessage()
  {}

  public GameFightPlacementSwapPositionsRequestMessage(short cellId, double requestedId)
  {

    super(cellId);
    this.requestedId = requestedId;
  }

  @Override
  public int getProtocolId()
  {
    return 6541;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.requestedId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.requestedId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameFightPlacementSwapPositionsRequestMessage("
        + "cellId="
        + this.cellId
        + ", requestedId="
        + this.requestedId
        + ')';
  }
}
