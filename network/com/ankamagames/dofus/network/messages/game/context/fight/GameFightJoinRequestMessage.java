// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightJoinRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 701;
  // f64
  public double fighterId;
  // i32
  public int fightId;

  public GameFightJoinRequestMessage() {}

  public GameFightJoinRequestMessage(double fighterId, int fightId) {
    this.fighterId = fighterId;
    this.fightId = fightId;
  }

  @Override
  public int getProtocolId() {
    return 701;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.fighterId);
    writer.write_i32(this.fightId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fighterId = reader.read_f64();
    this.fightId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GameFightJoinRequestMessage("
        + "fighterId="
        + this.fighterId
        + ", fightId="
        + this.fightId
        + ')';
  }
}
