// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6019;
  // vi16
  public short challengeId;
  // bool
  public boolean success;

  public ChallengeResultMessage() {}

  public ChallengeResultMessage(short challengeId, boolean success) {
    this.challengeId = challengeId;
    this.success = success;
  }

  @Override
  public int getProtocolId() {
    return 6019;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.challengeId);
    writer.write_bool(this.success);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.challengeId = reader.read_vi16();
    this.success = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ChallengeResultMessage("
        + "challengeId="
        + this.challengeId
        + ", success="
        + this.success
        + ')';
  }
}
