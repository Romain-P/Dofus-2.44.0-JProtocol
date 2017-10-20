// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPresetUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6606;
  // com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset
  public com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset idolsPreset;

  public IdolsPresetUpdateMessage() {}

  public IdolsPresetUpdateMessage(
      com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset idolsPreset) {
    this.idolsPreset = idolsPreset;
  }

  @Override
  public int getProtocolId() {
    return 6606;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.idolsPreset.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.idolsPreset = new com.ankamagames.dofus.network.types.game.inventory.preset.IdolsPreset();
    this.idolsPreset.deserialize(reader);
  }

  @Override
  public String toString() {

    return "IdolsPresetUpdateMessage(" + "idolsPreset=" + this.idolsPreset + ')';
  }
}
