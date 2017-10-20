// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangePodsModifiedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 6670;
  // vi32
  public int currentWeight;
  // vi32
  public int maxWeight;

  public ExchangePodsModifiedMessage() {}

  public ExchangePodsModifiedMessage(boolean remote, int currentWeight, int maxWeight) {

    super(remote);
    this.currentWeight = currentWeight;
    this.maxWeight = maxWeight;
  }

  @Override
  public int getProtocolId() {
    return 6670;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.currentWeight);
    writer.write_vi32(this.maxWeight);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.currentWeight = reader.read_vi32();
    this.maxWeight = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangePodsModifiedMessage("
        + "remote="
        + this.remote
        + ", currentWeight="
        + this.currentWeight
        + ", maxWeight="
        + this.maxWeight
        + ')';
  }
}
