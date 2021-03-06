// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPresetDeleteResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6605;
  // i8
  public byte presetId;
  // i8
  public byte code;

  public IdolsPresetDeleteResultMessage() {}

  public IdolsPresetDeleteResultMessage(byte presetId, byte code) {
    this.presetId = presetId;
    this.code = code;
  }

  @Override
  public int getProtocolId() {
    return 6605;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.code);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.code = reader.read_i8();
  }

  @Override
  public String toString() {

    return "IdolsPresetDeleteResultMessage("
        + "presetId="
        + this.presetId
        + ", code="
        + this.code
        + ')';
  }
}
