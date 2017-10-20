// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeInfoMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6022;
  // vi16
  public short challengeId;
  // f64
  public double targetId;
  // vi32
  public int xpBonus;
  // vi32
  public int dropBonus;

  public ChallengeInfoMessage() {}

  public ChallengeInfoMessage(short challengeId, double targetId, int xpBonus, int dropBonus) {
    this.challengeId = challengeId;
    this.targetId = targetId;
    this.xpBonus = xpBonus;
    this.dropBonus = dropBonus;
  }

  @Override
  public int getProtocolId() {
    return 6022;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.challengeId);
    writer.write_f64(this.targetId);
    writer.write_vi32(this.xpBonus);
    writer.write_vi32(this.dropBonus);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.challengeId = reader.read_vi16();
    this.targetId = reader.read_f64();
    this.xpBonus = reader.read_vi32();
    this.dropBonus = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ChallengeInfoMessage("
        + "challengeId="
        + this.challengeId
        + ", targetId="
        + this.targetId
        + ", xpBonus="
        + this.xpBonus
        + ", dropBonus="
        + this.dropBonus
        + ')';
  }
}
