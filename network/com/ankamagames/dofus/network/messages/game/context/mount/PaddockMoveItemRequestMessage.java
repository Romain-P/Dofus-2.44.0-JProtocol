// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockMoveItemRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6052;
  // vi16
  public short oldCellId;
  // vi16
  public short newCellId;

  public PaddockMoveItemRequestMessage() {}

  public PaddockMoveItemRequestMessage(short oldCellId, short newCellId) {
    this.oldCellId = oldCellId;
    this.newCellId = newCellId;
  }

  @Override
  public int getProtocolId() {
    return 6052;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.oldCellId);
    writer.write_vi16(this.newCellId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.oldCellId = reader.read_vi16();
    this.newCellId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "PaddockMoveItemRequestMessage("
        + "oldCellId="
        + this.oldCellId
        + ", newCellId="
        + this.newCellId
        + ')';
  }
}
