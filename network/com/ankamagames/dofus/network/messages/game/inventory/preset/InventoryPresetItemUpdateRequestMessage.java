// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryPresetItemUpdateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6210;
  // i8
  public byte presetId;
  // ui8
  public short position;
  // vi32
  public int objUid;

  public InventoryPresetItemUpdateRequestMessage() {}

  public InventoryPresetItemUpdateRequestMessage(byte presetId, short position, int objUid) {
    this.presetId = presetId;
    this.position = position;
    this.objUid = objUid;
  }

  @Override
  public int getProtocolId() {
    return 6210;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_ui8(this.position);
    writer.write_vi32(this.objUid);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.position = reader.read_ui8();
    this.objUid = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "InventoryPresetItemUpdateRequestMessage("
        + "presetId="
        + this.presetId
        + ", position="
        + this.position
        + ", objUid="
        + this.objUid
        + ')';
  }
}
