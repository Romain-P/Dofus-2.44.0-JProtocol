// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightStealKamaMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5535;
  // f64
  public double targetId;
  // ui64
  public java.math.BigInteger amount;

  public GameActionFightStealKamaMessage()
  {}

  public GameActionFightStealKamaMessage(
      short actionId, double sourceId, double targetId, java.math.BigInteger amount)
  {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.amount = amount;
  }

  @Override
  public int getProtocolId()
  {
    return 5535;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_ui64(this.amount);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.amount = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GameActionFightStealKamaMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", amount="
        + this.amount
        + ')';
  }
}
