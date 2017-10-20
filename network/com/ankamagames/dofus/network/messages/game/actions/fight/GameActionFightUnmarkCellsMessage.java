// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightUnmarkCellsMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5570;
  // i16
  public short markId;

  public GameActionFightUnmarkCellsMessage() {}

  public GameActionFightUnmarkCellsMessage(short actionId, double sourceId, short markId) {

    super(actionId, sourceId);
    this.markId = markId;
  }

  @Override
  public int getProtocolId() {
    return 5570;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i16(this.markId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.markId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "GameActionFightUnmarkCellsMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", markId="
        + this.markId
        + ')';
  }
}
