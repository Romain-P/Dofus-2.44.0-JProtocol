// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.look;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccessoryPreviewRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6518;
  // array,vi16
  public short[] genericId;

  public AccessoryPreviewRequestMessage() {}

  public AccessoryPreviewRequestMessage(short[] genericId) {
    this.genericId = genericId;
  }

  @Override
  public int getProtocolId() {
    return 6518;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(genericId.length);
    writer.write_array_vi16(this.genericId);
  }

  @Override
  public void deserialize(DataReader reader) {

    int genericId_length = reader.read_ui16();
    this.genericId = reader.read_array_vi16(genericId_length);
  }

  @Override
  public String toString() {

    return "AccessoryPreviewRequestMessage("
        + "genericId="
        + java.util.Arrays.toString(this.genericId)
        + ')';
  }
}
