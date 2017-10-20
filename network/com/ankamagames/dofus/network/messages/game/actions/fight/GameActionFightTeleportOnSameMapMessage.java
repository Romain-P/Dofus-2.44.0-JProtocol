// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightTeleportOnSameMapMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5528;
  // f64
  public double targetId;
  // i16
  public short cellId;

  public GameActionFightTeleportOnSameMapMessage() {}

  public GameActionFightTeleportOnSameMapMessage(
      short actionId, double sourceId, double targetId, short cellId) {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId() {
    return 5528;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_i16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.cellId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "GameActionFightTeleportOnSameMapMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", cellId="
        + this.cellId
        + ')';
  }
}
