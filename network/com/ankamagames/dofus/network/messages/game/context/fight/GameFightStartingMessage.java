// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightStartingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 700;
  // i8
  public byte fightType;
  // f64
  public double attackerId;
  // f64
  public double defenderId;

  public GameFightStartingMessage() {}

  public GameFightStartingMessage(byte fightType, double attackerId, double defenderId) {
    this.fightType = fightType;
    this.attackerId = attackerId;
    this.defenderId = defenderId;
  }

  @Override
  public int getProtocolId() {
    return 700;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.fightType);
    writer.write_f64(this.attackerId);
    writer.write_f64(this.defenderId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightType = reader.read_i8();
    this.attackerId = reader.read_f64();
    this.defenderId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameFightStartingMessage("
        + "fightType="
        + this.fightType
        + ", attackerId="
        + this.attackerId
        + ", defenderId="
        + this.defenderId
        + ')';
  }
}
