// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.achievement;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AchievementRewardSuccessMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6376;
  // i16
  public short achievementId;

  public AchievementRewardSuccessMessage() {}

  public AchievementRewardSuccessMessage(short achievementId) {
    this.achievementId = achievementId;
  }

  @Override
  public int getProtocolId() {
    return 6376;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.achievementId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.achievementId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "AchievementRewardSuccessMessage(" + "achievementId=" + this.achievementId + ')';
  }
}
