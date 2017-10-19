// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeTargetUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6123;
  // vi16
  public short challengeId;
  // f64
  public double targetId;

  public ChallengeTargetUpdateMessage()
  {}

  public ChallengeTargetUpdateMessage(short challengeId, double targetId)
  {
    this.challengeId = challengeId;
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 6123;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.challengeId);
    writer.write_f64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.challengeId = reader.read_vi16();
    this.targetId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "ChallengeTargetUpdateMessage("
        + "challengeId="
        + this.challengeId
        + ", targetId="
        + this.targetId
        + ')';
  }
}
