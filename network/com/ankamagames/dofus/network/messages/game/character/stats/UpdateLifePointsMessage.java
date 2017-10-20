// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateLifePointsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5658;
  // vi32
  public int lifePoints;
  // vi32
  public int maxLifePoints;

  public UpdateLifePointsMessage() {}

  public UpdateLifePointsMessage(int lifePoints, int maxLifePoints) {
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
  }

  @Override
  public int getProtocolId() {
    return 5658;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.lifePoints);
    writer.write_vi32(this.maxLifePoints);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.lifePoints = reader.read_vi32();
    this.maxLifePoints = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "UpdateLifePointsMessage("
        + "lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ')';
  }
}
