// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameCautiousMapMovementMessage
    extends com.ankamagames.dofus.network.messages.game.context.GameMapMovementMessage {
  public static final int PROTOCOL_ID = 6497;

  public GameCautiousMapMovementMessage()
  {}

  public GameCautiousMapMovementMessage(
      short[] keyMovements, short forcedDirection, double actorId)
  {

    super(keyMovements, forcedDirection, actorId);
  }

  @Override
  public int getProtocolId()
  {
    return 6497;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameCautiousMapMovementMessage("
        + "keyMovements="
        + java.util.Arrays.toString(this.keyMovements)
        + ", forcedDirection="
        + this.forcedDirection
        + ", actorId="
        + this.actorId
        + ')';
  }
}
