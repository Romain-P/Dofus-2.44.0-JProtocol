// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameCautiousMapMovementRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.GameMapMovementRequestMessage {
  public static final int PROTOCOL_ID = 6496;

  public GameCautiousMapMovementRequestMessage() {}

  public GameCautiousMapMovementRequestMessage(short[] keyMovements, double mapId) {

    super(keyMovements, mapId);
  }

  @Override
  public int getProtocolId() {
    return 6496;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameCautiousMapMovementRequestMessage("
        + "keyMovements="
        + java.util.Arrays.toString(this.keyMovements)
        + ", mapId="
        + this.mapId
        + ')';
  }
}
