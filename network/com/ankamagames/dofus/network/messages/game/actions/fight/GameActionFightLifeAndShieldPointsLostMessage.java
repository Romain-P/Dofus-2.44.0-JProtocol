// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightLifeAndShieldPointsLostMessage
    extends com.ankamagames.dofus.network.messages.game.actions.fight
        .GameActionFightLifePointsLostMessage {
  public static final int PROTOCOL_ID = 6310;
  // vi16
  public short shieldLoss;

  public GameActionFightLifeAndShieldPointsLostMessage() {}

  public GameActionFightLifeAndShieldPointsLostMessage(
      short actionId,
      double sourceId,
      double targetId,
      int loss,
      int permanentDamages,
      short shieldLoss) {

    super(actionId, sourceId, targetId, loss, permanentDamages);
    this.shieldLoss = shieldLoss;
  }

  @Override
  public int getProtocolId() {
    return 6310;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.shieldLoss);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.shieldLoss = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GameActionFightLifeAndShieldPointsLostMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", loss="
        + this.loss
        + ", permanentDamages="
        + this.permanentDamages
        + ", shieldLoss="
        + this.shieldLoss
        + ')';
  }
}
