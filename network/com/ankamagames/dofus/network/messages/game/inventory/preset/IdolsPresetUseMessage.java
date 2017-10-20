// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPresetUseMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6615;
  // i8
  public byte presetId;
  // bool
  public boolean party;

  public IdolsPresetUseMessage() {}

  public IdolsPresetUseMessage(byte presetId, boolean party) {
    this.presetId = presetId;
    this.party = party;
  }

  @Override
  public int getProtocolId() {
    return 6615;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_bool(this.party);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.party = reader.read_bool();
  }

  @Override
  public String toString() {

    return "IdolsPresetUseMessage(" + "presetId=" + this.presetId + ", party=" + this.party + ')';
  }
}
