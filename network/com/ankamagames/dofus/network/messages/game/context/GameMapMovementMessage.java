// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapMovementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 951;
  // array,i16
  public short[] keyMovements;
  // i16
  public short forcedDirection;
  // f64
  public double actorId;

  public GameMapMovementMessage() {}

  public GameMapMovementMessage(short[] keyMovements, short forcedDirection, double actorId) {
    this.keyMovements = keyMovements;
    this.forcedDirection = forcedDirection;
    this.actorId = actorId;
  }

  @Override
  public int getProtocolId() {
    return 951;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(keyMovements.length);
    writer.write_array_i16(this.keyMovements);
    writer.write_i16(this.forcedDirection);
    writer.write_f64(this.actorId);
  }

  @Override
  public void deserialize(DataReader reader) {

    int keyMovements_length = reader.read_ui16();
    this.keyMovements = reader.read_array_i16(keyMovements_length);
    this.forcedDirection = reader.read_i16();
    this.actorId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameMapMovementMessage("
        + "keyMovements="
        + java.util.Arrays.toString(this.keyMovements)
        + ", forcedDirection="
        + this.forcedDirection
        + ", actorId="
        + this.actorId
        + ')';
  }
}
