// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightRemoveTeamMemberMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 711;
  // i16
  public short fightId;
  // i8
  public byte teamId;
  // f64
  public double charId;

  public GameFightRemoveTeamMemberMessage() {}

  public GameFightRemoveTeamMemberMessage(short fightId, byte teamId, double charId) {
    this.fightId = fightId;
    this.teamId = teamId;
    this.charId = charId;
  }

  @Override
  public int getProtocolId() {
    return 711;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.fightId);
    writer.write_i8(this.teamId);
    writer.write_f64(this.charId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i16();
    this.teamId = reader.read_i8();
    this.charId = reader.read_f64();
  }

  @Override
  public String toString() {

    return "GameFightRemoveTeamMemberMessage("
        + "fightId="
        + this.fightId
        + ", teamId="
        + this.teamId
        + ", charId="
        + this.charId
        + ')';
  }
}
