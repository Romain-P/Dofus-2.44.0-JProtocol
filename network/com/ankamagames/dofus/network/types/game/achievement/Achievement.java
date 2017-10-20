// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class Achievement extends NetworkType {
  public static final int PROTOCOL_ID = 363;
  // vi16
  public short id;
  // array,com.ankamagames.dofus.network.types.game.achievement.AchievementObjective
  public com.ankamagames.dofus.network.types.game.achievement.AchievementObjective[]
      finishedObjective;
  // array,com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective
  public com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective[]
      startedObjectives;

  public Achievement() {}

  public Achievement(
      short id,
      com.ankamagames.dofus.network.types.game.achievement.AchievementObjective[] finishedObjective,
      com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective[]
          startedObjectives) {
    this.id = id;
    this.finishedObjective = finishedObjective;
    this.startedObjectives = startedObjectives;
  }

  public Achievement(
      short id,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.achievement.AchievementObjective>
          finishedObjective,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective>
          startedObjectives) {
    this.id = id;
    this.finishedObjective =
        finishedObjective.toArray(
            com.ankamagames.dofus.network.types.game.achievement.AchievementObjective[]::new);
    this.startedObjectives =
        startedObjectives.toArray(
            com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 363;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.id);
    writer.write_ui16(finishedObjective.length);

    for (int i = 0; i < finishedObjective.length; i++) {

      finishedObjective[i].serialize(writer);
    }
    writer.write_ui16(startedObjectives.length);

    for (int i = 0; i < startedObjectives.length; i++) {

      startedObjectives[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_vi16();

    int finishedObjective_length = reader.read_ui16();
    this.finishedObjective =
        new com.ankamagames.dofus.network.types.game.achievement.AchievementObjective
            [finishedObjective_length];

    for (int i = 0; i < finishedObjective_length; i++) {

      com.ankamagames.dofus.network.types.game.achievement.AchievementObjective
          finishedObjective_it =
              new com.ankamagames.dofus.network.types.game.achievement.AchievementObjective();

      finishedObjective_it.deserialize(reader);
      this.finishedObjective[i] = finishedObjective_it;
    }

    int startedObjectives_length = reader.read_ui16();
    this.startedObjectives =
        new com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective
            [startedObjectives_length];

    for (int i = 0; i < startedObjectives_length; i++) {

      com.ankamagames.dofus.network.types.game.achievement.AchievementStartedObjective
          startedObjectives_it =
              new com.ankamagames.dofus.network.types.game.achievement
                  .AchievementStartedObjective();

      startedObjectives_it.deserialize(reader);
      this.startedObjectives[i] = startedObjectives_it;
    }
  }

  @Override
  public String toString() {

    return "Achievement("
        + "id="
        + this.id
        + ", finishedObjective="
        + java.util.Arrays.toString(this.finishedObjective)
        + ", startedObjectives="
        + java.util.Arrays.toString(this.startedObjectives)
        + ')';
  }
}
