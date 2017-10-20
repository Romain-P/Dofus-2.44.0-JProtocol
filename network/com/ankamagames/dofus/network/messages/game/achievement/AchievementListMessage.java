// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6205;
  // array,vi16
  public short[] finishedAchievementsIds;
  // array,com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable
  public com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable[]
      rewardableAchievements;

  public AchievementListMessage() {}

  public AchievementListMessage(
      short[] finishedAchievementsIds,
      com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable[]
          rewardableAchievements) {
    this.finishedAchievementsIds = finishedAchievementsIds;
    this.rewardableAchievements = rewardableAchievements;
  }

  public AchievementListMessage(
      short[] finishedAchievementsIds,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable>
          rewardableAchievements) {
    this.finishedAchievementsIds = finishedAchievementsIds;
    this.rewardableAchievements =
        rewardableAchievements.toArray(
            com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6205;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(finishedAchievementsIds.length);
    writer.write_array_vi16(this.finishedAchievementsIds);
    writer.write_ui16(rewardableAchievements.length);

    for (int i = 0; i < rewardableAchievements.length; i++) {

      rewardableAchievements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int finishedAchievementsIds_length = reader.read_ui16();
    this.finishedAchievementsIds = reader.read_array_vi16(finishedAchievementsIds_length);

    int rewardableAchievements_length = reader.read_ui16();
    this.rewardableAchievements =
        new com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable
            [rewardableAchievements_length];

    for (int i = 0; i < rewardableAchievements_length; i++) {

      com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable
          rewardableAchievements_it =
              new com.ankamagames.dofus.network.types.game.achievement.AchievementRewardable();

      rewardableAchievements_it.deserialize(reader);
      this.rewardableAchievements[i] = rewardableAchievements_it;
    }
  }

  @Override
  public String toString() {

    return "AchievementListMessage("
        + "finishedAchievementsIds="
        + java.util.Arrays.toString(this.finishedAchievementsIds)
        + ", rewardableAchievements="
        + java.util.Arrays.toString(this.rewardableAchievements)
        + ')';
  }
}
