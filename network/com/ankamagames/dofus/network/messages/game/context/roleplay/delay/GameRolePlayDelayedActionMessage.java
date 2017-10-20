// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.delay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayDelayedActionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6153;
  // f64
  public double delayedCharacterId;
  // i8
  public byte delayTypeId;
  // f64
  public double delayEndTime;

  public GameRolePlayDelayedActionMessage() {}

  public GameRolePlayDelayedActionMessage(
      double delayedCharacterId, byte delayTypeId, double delayEndTime) {
    this.delayedCharacterId = delayedCharacterId;
    this.delayTypeId = delayTypeId;
    this.delayEndTime = delayEndTime;
  }

  @Override
  public int getProtocolId() {
    return 6153;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.delayedCharacterId);
    writer.write_i8(this.delayTypeId);
    writer.write_f64(this.delayEndTime);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.delayedCharacterId = reader.read_f64();
    this.delayTypeId = reader.read_i8();
    this.delayEndTime = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameRolePlayDelayedActionMessage("
        + "delayedCharacterId="
        + this.delayedCharacterId
        + ", delayTypeId="
        + this.delayTypeId
        + ", delayEndTime="
        + this.delayEndTime
        + ')';
  }
}
