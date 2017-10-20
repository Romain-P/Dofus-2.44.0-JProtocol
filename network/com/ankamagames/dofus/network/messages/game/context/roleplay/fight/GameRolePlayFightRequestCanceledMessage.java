// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayFightRequestCanceledMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5822;
  // i32
  public int fightId;
  // f64
  public double sourceId;
  // f64
  public double targetId;

  public GameRolePlayFightRequestCanceledMessage() {}

  public GameRolePlayFightRequestCanceledMessage(int fightId, double sourceId, double targetId) {
    this.fightId = fightId;
    this.sourceId = sourceId;
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId() {
    return 5822;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
    writer.write_f64(this.sourceId);
    writer.write_f64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
    this.sourceId = reader.read_f64();
    this.targetId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameRolePlayFightRequestCanceledMessage("
        + "fightId="
        + this.fightId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ')';
  }
}
