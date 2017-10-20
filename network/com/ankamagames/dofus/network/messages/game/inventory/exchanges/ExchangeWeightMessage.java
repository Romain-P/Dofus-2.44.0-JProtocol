// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeWeightMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5793;
  // vi32
  public int currentWeight;
  // vi32
  public int maxWeight;

  public ExchangeWeightMessage() {}

  public ExchangeWeightMessage(int currentWeight, int maxWeight) {
    this.currentWeight = currentWeight;
    this.maxWeight = maxWeight;
  }

  @Override
  public int getProtocolId() {
    return 5793;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.currentWeight);
    writer.write_vi32(this.maxWeight);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.currentWeight = reader.read_vi32();
    this.maxWeight = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeWeightMessage("
        + "currentWeight="
        + this.currentWeight
        + ", maxWeight="
        + this.maxWeight
        + ')';
  }
}
