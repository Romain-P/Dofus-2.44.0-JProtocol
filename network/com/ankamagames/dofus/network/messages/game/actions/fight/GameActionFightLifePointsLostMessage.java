// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightLifePointsLostMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6312;
  // f64
  public double targetId;
  // vi32
  public int loss;
  // vi32
  public int permanentDamages;

  public GameActionFightLifePointsLostMessage()
  {}

  public GameActionFightLifePointsLostMessage(
      short actionId, double sourceId, double targetId, int loss, int permanentDamages)
  {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.loss = loss;
    this.permanentDamages = permanentDamages;
  }

  @Override
  public int getProtocolId()
  {
    return 6312;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_vi32(this.loss);
    writer.write_vi32(this.permanentDamages);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.loss = reader.read_vi32();
    this.permanentDamages = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GameActionFightLifePointsLostMessage("
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
        + ')';
  }
}
