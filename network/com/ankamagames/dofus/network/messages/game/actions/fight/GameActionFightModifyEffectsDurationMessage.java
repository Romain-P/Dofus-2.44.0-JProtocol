// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightModifyEffectsDurationMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6304;
  // f64
  public double targetId;
  // i16
  public short delta;

  public GameActionFightModifyEffectsDurationMessage()
  {}

  public GameActionFightModifyEffectsDurationMessage(
      short actionId, double sourceId, double targetId, short delta)
  {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.delta = delta;
  }

  @Override
  public int getProtocolId()
  {
    return 6304;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_i16(this.delta);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.delta = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "GameActionFightModifyEffectsDurationMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", delta="
        + this.delta
        + ')';
  }
}
