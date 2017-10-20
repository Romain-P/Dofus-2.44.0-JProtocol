// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightTurnEndMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 719;
  // f64
  public double id;

  public GameFightTurnEndMessage() {}

  public GameFightTurnEndMessage(double id) {
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 719;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameFightTurnEndMessage(" + "id=" + this.id + ')';
  }
}
