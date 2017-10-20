// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeShopStockMovementRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5907;
  // vi32
  public int objectId;

  public ExchangeShopStockMovementRemovedMessage() {}

  public ExchangeShopStockMovementRemovedMessage(int objectId) {
    this.objectId = objectId;
  }

  @Override
  public int getProtocolId() {
    return 5907;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.objectId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeShopStockMovementRemovedMessage(" + "objectId=" + this.objectId + ')';
  }
}
