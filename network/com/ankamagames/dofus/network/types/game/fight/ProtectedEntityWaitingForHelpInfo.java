// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ProtectedEntityWaitingForHelpInfo extends NetworkType {
  public static final int PROTOCOL_ID = 186;
  // i32
  public int timeLeftBeforeFight;
  // i32
  public int waitTimeForPlacement;
  // i8
  public byte nbPositionForDefensors;

  public ProtectedEntityWaitingForHelpInfo() {}

  public ProtectedEntityWaitingForHelpInfo(
      int timeLeftBeforeFight, int waitTimeForPlacement, byte nbPositionForDefensors) {
    this.timeLeftBeforeFight = timeLeftBeforeFight;
    this.waitTimeForPlacement = waitTimeForPlacement;
    this.nbPositionForDefensors = nbPositionForDefensors;
  }

  @Override
  public int getProtocolId() {
    return 186;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.timeLeftBeforeFight);
    writer.write_i32(this.waitTimeForPlacement);
    writer.write_i8(this.nbPositionForDefensors);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.timeLeftBeforeFight = reader.read_i32();
    this.waitTimeForPlacement = reader.read_i32();
    this.nbPositionForDefensors = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ProtectedEntityWaitingForHelpInfo("
        + "timeLeftBeforeFight="
        + this.timeLeftBeforeFight
        + ", waitTimeForPlacement="
        + this.waitTimeForPlacement
        + ", nbPositionForDefensors="
        + this.nbPositionForDefensors
        + ')';
  }
}
