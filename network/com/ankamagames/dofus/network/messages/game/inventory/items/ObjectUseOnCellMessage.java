// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectUseOnCellMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseMessage {
  public static final int PROTOCOL_ID = 3013;
  // vi16
  public short cells;

  public ObjectUseOnCellMessage() {}

  public ObjectUseOnCellMessage(int objectUID, short cells) {

    super(objectUID);
    this.cells = cells;
  }

  @Override
  public int getProtocolId() {
    return 3013;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.cells);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.cells = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ObjectUseOnCellMessage("
        + "objectUID="
        + this.objectUID
        + ", cells="
        + this.cells
        + ')';
  }
}
