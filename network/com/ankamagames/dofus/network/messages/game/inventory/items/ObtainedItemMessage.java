// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObtainedItemMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6519;
  // vi16
  public short genericId;
  // vi32
  public int baseQuantity;

  public ObtainedItemMessage() {}

  public ObtainedItemMessage(short genericId, int baseQuantity) {
    this.genericId = genericId;
    this.baseQuantity = baseQuantity;
  }

  @Override
  public int getProtocolId() {
    return 6519;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.genericId);
    writer.write_vi32(this.baseQuantity);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.genericId = reader.read_vi16();
    this.baseQuantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObtainedItemMessage("
        + "genericId="
        + this.genericId
        + ", baseQuantity="
        + this.baseQuantity
        + ')';
  }
}
