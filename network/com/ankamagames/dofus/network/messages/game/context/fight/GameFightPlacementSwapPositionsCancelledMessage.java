// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsCancelledMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6546;
  // i32
  public int requestId;
  // f64
  public double cancellerId;

  public GameFightPlacementSwapPositionsCancelledMessage() {}

  public GameFightPlacementSwapPositionsCancelledMessage(int requestId, double cancellerId) {
    this.requestId = requestId;
    this.cancellerId = cancellerId;
  }

  @Override
  public int getProtocolId() {
    return 6546;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.requestId);
    writer.write_f64(this.cancellerId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.requestId = reader.read_i32();
    this.cancellerId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameFightPlacementSwapPositionsCancelledMessage("
        + "requestId="
        + this.requestId
        + ", cancellerId="
        + this.cancellerId
        + ')';
  }
}
