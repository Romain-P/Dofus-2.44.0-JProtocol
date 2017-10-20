// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryWeightMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3009;
  // vi32
  public int weight;
  // vi32
  public int weightMax;

  public InventoryWeightMessage() {}

  public InventoryWeightMessage(int weight, int weightMax) {
    this.weight = weight;
    this.weightMax = weightMax;
  }

  @Override
  public int getProtocolId() {
    return 3009;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.weight);
    writer.write_vi32(this.weightMax);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.weight = reader.read_vi32();
    this.weightMax = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "InventoryWeightMessage("
        + "weight="
        + this.weight
        + ", weightMax="
        + this.weightMax
        + ')';
  }
}
