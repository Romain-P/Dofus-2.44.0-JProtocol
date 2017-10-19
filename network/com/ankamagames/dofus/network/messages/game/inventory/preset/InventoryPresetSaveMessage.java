// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetSaveMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetSaveMessage {
  public static final int PROTOCOL_ID = 6165;
  // bool
  public boolean saveEquipment;

  public InventoryPresetSaveMessage()
  {}

  public InventoryPresetSaveMessage(byte presetId, byte symbolId, boolean saveEquipment)
  {

    super(presetId, symbolId);
    this.saveEquipment = saveEquipment;
  }

  @Override
  public int getProtocolId()
  {
    return 6165;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_bool(this.saveEquipment);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.saveEquipment = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "InventoryPresetSaveMessage("
        + "presetId="
        + this.presetId
        + ", symbolId="
        + this.symbolId
        + ", saveEquipment="
        + this.saveEquipment
        + ')';
  }
}
