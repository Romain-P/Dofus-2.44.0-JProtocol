// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementDetailedListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6358;
  // array,com.ankamagames.dofus.network.types.game.achievement.Achievement
  public com.ankamagames.dofus.network.types.game.achievement.Achievement[] startedAchievements;
  // array,com.ankamagames.dofus.network.types.game.achievement.Achievement
  public com.ankamagames.dofus.network.types.game.achievement.Achievement[] finishedAchievements;

  public AchievementDetailedListMessage() {}

  public AchievementDetailedListMessage(
      com.ankamagames.dofus.network.types.game.achievement.Achievement[] startedAchievements,
      com.ankamagames.dofus.network.types.game.achievement.Achievement[] finishedAchievements) {
    this.startedAchievements = startedAchievements;
    this.finishedAchievements = finishedAchievements;
  }

  public AchievementDetailedListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.achievement.Achievement>
          startedAchievements,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.achievement.Achievement>
          finishedAchievements) {
    this.startedAchievements =
        startedAchievements.toArray(
            com.ankamagames.dofus.network.types.game.achievement.Achievement[]::new);
    this.finishedAchievements =
        finishedAchievements.toArray(
            com.ankamagames.dofus.network.types.game.achievement.Achievement[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6358;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(startedAchievements.length);

    for (int i = 0; i < startedAchievements.length; i++) {

      startedAchievements[i].serialize(writer);
    }
    writer.write_ui16(finishedAchievements.length);

    for (int i = 0; i < finishedAchievements.length; i++) {

      finishedAchievements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int startedAchievements_length = reader.read_ui16();
    this.startedAchievements =
        new com.ankamagames.dofus.network.types.game.achievement.Achievement
            [startedAchievements_length];

    for (int i = 0; i < startedAchievements_length; i++) {

      com.ankamagames.dofus.network.types.game.achievement.Achievement startedAchievements_it =
          new com.ankamagames.dofus.network.types.game.achievement.Achievement();

      startedAchievements_it.deserialize(reader);
      this.startedAchievements[i] = startedAchievements_it;
    }

    int finishedAchievements_length = reader.read_ui16();
    this.finishedAchievements =
        new com.ankamagames.dofus.network.types.game.achievement.Achievement
            [finishedAchievements_length];

    for (int i = 0; i < finishedAchievements_length; i++) {

      com.ankamagames.dofus.network.types.game.achievement.Achievement finishedAchievements_it =
          new com.ankamagames.dofus.network.types.game.achievement.Achievement();

      finishedAchievements_it.deserialize(reader);
      this.finishedAchievements[i] = finishedAchievements_it;
    }
  }

  @Override
  public String toString() {

    return "AchievementDetailedListMessage("
        + "startedAchievements="
        + java.util.Arrays.toString(this.startedAchievements)
        + ", finishedAchievements="
        + java.util.Arrays.toString(this.finishedAchievements)
        + ')';
  }
}
