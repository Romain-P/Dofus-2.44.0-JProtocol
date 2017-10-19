// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.objects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectGroundListAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5925;
  // array,vi16
  public short[] cells;
  // array,vi16
  public short[] referenceIds;

  public ObjectGroundListAddedMessage()
  {}

  public ObjectGroundListAddedMessage(short[] cells, short[] referenceIds)
  {
    this.cells = cells;
    this.referenceIds = referenceIds;
  }

  @Override
  public int getProtocolId()
  {
    return 5925;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(cells.length);
    writer.write_array_vi16(this.cells);
    writer.write_ui16(referenceIds.length);
    writer.write_array_vi16(this.referenceIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int cells_length = reader.read_ui16();
    this.cells = reader.read_array_vi16(cells_length);

    int referenceIds_length = reader.read_ui16();
    this.referenceIds = reader.read_array_vi16(referenceIds_length);
  }

  @Override
  public String toString()
  {

    return "ObjectGroundListAddedMessage("
        + "cells="
        + java.util.Arrays.toString(this.cells)
        + ", referenceIds="
        + java.util.Arrays.toString(this.referenceIds)
        + ')';
  }
}
