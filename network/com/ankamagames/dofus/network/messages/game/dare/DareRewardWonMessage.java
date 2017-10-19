// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareRewardWonMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6678;
  // com.ankamagames.dofus.network.types.game.dare.DareReward
  public com.ankamagames.dofus.network.types.game.dare.DareReward reward;

  public DareRewardWonMessage()
  {}

  public DareRewardWonMessage(com.ankamagames.dofus.network.types.game.dare.DareReward reward)
  {
    this.reward = reward;
  }

  @Override
  public int getProtocolId()
  {
    return 6678;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.reward.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.reward = new com.ankamagames.dofus.network.types.game.dare.DareReward();
    this.reward.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "DareRewardWonMessage(" + "reward=" + this.reward + ')';
  }
}
