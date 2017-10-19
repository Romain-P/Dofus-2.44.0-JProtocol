// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractGameActionFightTargetedAbilityMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6118;
  // flag,_loc2_,0
  public boolean silentCast;
  // flag,_loc2_,1
  public boolean verboseCast;
  // f64
  public double targetId;
  // i16
  public short destinationCellId;
  // i8
  public byte critical;

  public AbstractGameActionFightTargetedAbilityMessage()
  {}

  public AbstractGameActionFightTargetedAbilityMessage(
      short actionId,
      double sourceId,
      boolean silentCast,
      boolean verboseCast,
      double targetId,
      short destinationCellId,
      byte critical)
  {

    super(actionId, sourceId);
    this.silentCast = silentCast;
    this.verboseCast = verboseCast;
    this.targetId = targetId;
    this.destinationCellId = destinationCellId;
    this.critical = critical;
  }

  @Override
  public int getProtocolId()
  {
    return 6118;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.silentCast, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.verboseCast, 1);
    writer.write_i8(_loc2_);
    writer.write_f64(this.targetId);
    writer.write_i16(this.destinationCellId);
    writer.write_i8(this.critical);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.silentCast = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.verboseCast = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.targetId = reader.read_f64();
    this.destinationCellId = reader.read_i16();
    this.critical = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AbstractGameActionFightTargetedAbilityMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", silentCast="
        + this.silentCast
        + ", verboseCast="
        + this.verboseCast
        + ", targetId="
        + this.targetId
        + ", destinationCellId="
        + this.destinationCellId
        + ", critical="
        + this.critical
        + ')';
  }
}
