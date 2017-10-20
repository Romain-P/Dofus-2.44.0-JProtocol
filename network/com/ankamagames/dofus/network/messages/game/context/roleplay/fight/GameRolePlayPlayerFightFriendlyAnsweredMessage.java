// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerFightFriendlyAnsweredMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5733;
  // i32
  public int fightId;
  // vi64
  public long sourceId;
  // vi64
  public long targetId;
  // bool
  public boolean accept;

  public GameRolePlayPlayerFightFriendlyAnsweredMessage() {}

  public GameRolePlayPlayerFightFriendlyAnsweredMessage(
      int fightId, long sourceId, long targetId, boolean accept) {
    this.fightId = fightId;
    this.sourceId = sourceId;
    this.targetId = targetId;
    this.accept = accept;
  }

  @Override
  public int getProtocolId() {
    return 5733;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
    writer.write_vi64(this.sourceId);
    writer.write_vi64(this.targetId);
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
    this.sourceId = reader.read_vi64();
    this.targetId = reader.read_vi64();
    this.accept = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GameRolePlayPlayerFightFriendlyAnsweredMessage("
        + "fightId="
        + this.fightId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", accept="
        + this.accept
        + ')';
  }
}
