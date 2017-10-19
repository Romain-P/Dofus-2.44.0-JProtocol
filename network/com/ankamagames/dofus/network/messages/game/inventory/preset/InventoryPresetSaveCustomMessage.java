// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetSaveCustomMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetSaveMessage {
  public static final int PROTOCOL_ID = 6329;
  // array,ui8
  public short[] itemsPositions;
  // array,vi32
  public int[] itemsUids;

  public InventoryPresetSaveCustomMessage()
  {}

  public InventoryPresetSaveCustomMessage(
      byte presetId, byte symbolId, short[] itemsPositions, int[] itemsUids)
  {

    super(presetId, symbolId);
    this.itemsPositions = itemsPositions;
    this.itemsUids = itemsUids;
  }

  @Override
  public int getProtocolId()
  {
    return 6329;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(itemsPositions.length);
    writer.write_array_ui8(this.itemsPositions);
    writer.write_ui16(itemsUids.length);
    writer.write_array_vi32(this.itemsUids);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int itemsPositions_length = reader.read_ui16();
    this.itemsPositions = reader.read_array_ui8(itemsPositions_length);

    int itemsUids_length = reader.read_ui16();
    this.itemsUids = reader.read_array_vi32(itemsUids_length);
  }

  @Override
  public String toString()
  {

    return "InventoryPresetSaveCustomMessage("
        + "presetId="
        + this.presetId
        + ", symbolId="
        + this.symbolId
        + ", itemsPositions="
        + java.util.Arrays.toString(this.itemsPositions)
        + ", itemsUids="
        + java.util.Arrays.toString(this.itemsUids)
        + ')';
  }
}
