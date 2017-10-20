// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeShopStockMovementUpdatedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5909;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell objectInfo;

  public ExchangeShopStockMovementUpdatedMessage() {}

  public ExchangeShopStockMovementUpdatedMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell objectInfo) {
    this.objectInfo = objectInfo;
  }

  @Override
  public int getProtocolId() {
    return 5909;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.objectInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectInfo = new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell();
    this.objectInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ExchangeShopStockMovementUpdatedMessage(" + "objectInfo=" + this.objectInfo + ')';
  }
}
