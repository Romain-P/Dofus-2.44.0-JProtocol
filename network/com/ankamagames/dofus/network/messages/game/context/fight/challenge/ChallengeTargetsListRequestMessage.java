// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeTargetsListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5614;
  // vi16
  public short challengeId;

  public ChallengeTargetsListRequestMessage()
  {}

  public ChallengeTargetsListRequestMessage(short challengeId)
  {
    this.challengeId = challengeId;
  }

  @Override
  public int getProtocolId()
  {
    return 5614;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.challengeId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.challengeId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ChallengeTargetsListRequestMessage(" + "challengeId=" + this.challengeId + ')';
  }
}
