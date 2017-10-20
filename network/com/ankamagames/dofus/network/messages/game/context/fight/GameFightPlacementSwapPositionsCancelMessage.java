// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsCancelMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6543;
  // i32
  public int requestId;

  public GameFightPlacementSwapPositionsCancelMessage() {}

  public GameFightPlacementSwapPositionsCancelMessage(int requestId) {
    this.requestId = requestId;
  }

  @Override
  public int getProtocolId() {
    return 6543;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.requestId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.requestId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GameFightPlacementSwapPositionsCancelMessage(" + "requestId=" + this.requestId + ')';
  }
}
