// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayAggressionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6073;
  // vi64
  public long attackerId;
  // vi64
  public long defenderId;

  public GameRolePlayAggressionMessage() {}

  public GameRolePlayAggressionMessage(long attackerId, long defenderId) {
    this.attackerId = attackerId;
    this.defenderId = defenderId;
  }

  @Override
  public int getProtocolId() {
    return 6073;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.attackerId);
    writer.write_vi64(this.defenderId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.attackerId = reader.read_vi64();
    this.defenderId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "GameRolePlayAggressionMessage("
        + "attackerId="
        + this.attackerId
        + ", defenderId="
        + this.defenderId
        + ')';
  }
}
