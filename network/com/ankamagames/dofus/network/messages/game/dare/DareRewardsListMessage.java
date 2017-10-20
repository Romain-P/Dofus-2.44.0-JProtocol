// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareRewardsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6677;
  // array,com.ankamagames.dofus.network.types.game.dare.DareReward
  public com.ankamagames.dofus.network.types.game.dare.DareReward[] rewards;

  public DareRewardsListMessage() {}

  public DareRewardsListMessage(
      com.ankamagames.dofus.network.types.game.dare.DareReward[] rewards) {
    this.rewards = rewards;
  }

  public DareRewardsListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.dare.DareReward> rewards) {
    this.rewards = rewards.toArray(com.ankamagames.dofus.network.types.game.dare.DareReward[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6677;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(rewards.length);

    for (int i = 0; i < rewards.length; i++) {

      rewards[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int rewards_length = reader.read_ui16();
    this.rewards = new com.ankamagames.dofus.network.types.game.dare.DareReward[rewards_length];

    for (int i = 0; i < rewards_length; i++) {

      com.ankamagames.dofus.network.types.game.dare.DareReward rewards_it =
          new com.ankamagames.dofus.network.types.game.dare.DareReward();

      rewards_it.deserialize(reader);
      this.rewards[i] = rewards_it;
    }
  }

  @Override
  public String toString() {

    return "DareRewardsListMessage(" + "rewards=" + java.util.Arrays.toString(this.rewards) + ')';
  }
}
