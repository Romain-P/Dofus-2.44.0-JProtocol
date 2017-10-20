// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.objects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectGroundRemovedMultipleMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5944;
  // array,vi16
  public short[] cells;

  public ObjectGroundRemovedMultipleMessage() {}

  public ObjectGroundRemovedMultipleMessage(short[] cells) {
    this.cells = cells;
  }

  @Override
  public int getProtocolId() {
    return 5944;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(cells.length);
    writer.write_array_vi16(this.cells);
  }

  @Override
  public void deserialize(DataReader reader) {

    int cells_length = reader.read_ui16();
    this.cells = reader.read_array_vi16(cells_length);
  }

  @Override
  public String toString() {

    return "ObjectGroundRemovedMultipleMessage("
        + "cells="
        + java.util.Arrays.toString(this.cells)
        + ')';
  }
}
