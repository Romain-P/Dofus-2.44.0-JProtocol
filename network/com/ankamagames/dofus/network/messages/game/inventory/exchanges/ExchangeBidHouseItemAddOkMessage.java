// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseItemAddOkMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5945;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid itemInfo;

  public ExchangeBidHouseItemAddOkMessage() {}

  public ExchangeBidHouseItemAddOkMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid itemInfo) {
    this.itemInfo = itemInfo;
  }

  @Override
  public int getProtocolId() {
    return 5945;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.itemInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.itemInfo = new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid();
    this.itemInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ExchangeBidHouseItemAddOkMessage(" + "itemInfo=" + this.itemInfo + ')';
  }
}
