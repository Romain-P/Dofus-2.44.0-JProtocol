// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightExchangePositionsMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5527;
  // f64
  public double targetId;
  // i16
  public short casterCellId;
  // i16
  public short targetCellId;

  public GameActionFightExchangePositionsMessage() {}

  public GameActionFightExchangePositionsMessage(
      short actionId, double sourceId, double targetId, short casterCellId, short targetCellId) {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.casterCellId = casterCellId;
    this.targetCellId = targetCellId;
  }

  @Override
  public int getProtocolId() {
    return 5527;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_i16(this.casterCellId);
    writer.write_i16(this.targetCellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.casterCellId = reader.read_i16();
    this.targetCellId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "GameActionFightExchangePositionsMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", casterCellId="
        + this.casterCellId
        + ", targetCellId="
        + this.targetCellId
        + ')';
  }
}
