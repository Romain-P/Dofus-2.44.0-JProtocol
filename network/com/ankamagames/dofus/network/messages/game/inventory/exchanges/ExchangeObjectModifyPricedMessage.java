// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectModifyPricedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeObjectMovePricedMessage {
  public static final int PROTOCOL_ID = 6238;

  public ExchangeObjectModifyPricedMessage() {}

  public ExchangeObjectModifyPricedMessage(int objectUID, int quantity, long price) {

    super(objectUID, quantity, price);
  }

  @Override
  public int getProtocolId() {
    return 6238;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ExchangeObjectModifyPricedMessage("
        + "objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ", price="
        + this.price
        + ')';
  }
}
