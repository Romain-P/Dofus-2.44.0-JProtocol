// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractPresetSaveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6736;
  // i8
  public byte presetId;
  // i8
  public byte symbolId;

  public AbstractPresetSaveMessage() {}

  public AbstractPresetSaveMessage(byte presetId, byte symbolId) {
    this.presetId = presetId;
    this.symbolId = symbolId;
  }

  @Override
  public int getProtocolId() {
    return 6736;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.presetId);
    writer.write_i8(this.symbolId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.presetId = reader.read_i8();
    this.symbolId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "AbstractPresetSaveMessage("
        + "presetId="
        + this.presetId
        + ", symbolId="
        + this.symbolId
        + ')';
  }
}
