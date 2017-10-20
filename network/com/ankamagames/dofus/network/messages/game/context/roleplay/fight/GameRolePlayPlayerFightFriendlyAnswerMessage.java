// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayPlayerFightFriendlyAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5732;
  // i32
  public int fightId;
  // bool
  public boolean accept;

  public GameRolePlayPlayerFightFriendlyAnswerMessage() {}

  public GameRolePlayPlayerFightFriendlyAnswerMessage(int fightId, boolean accept) {
    this.fightId = fightId;
    this.accept = accept;
  }

  @Override
  public int getProtocolId() {
    return 5732;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
    this.accept = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GameRolePlayPlayerFightFriendlyAnswerMessage("
        + "fightId="
        + this.fightId
        + ", accept="
        + this.accept
        + ')';
  }
}
