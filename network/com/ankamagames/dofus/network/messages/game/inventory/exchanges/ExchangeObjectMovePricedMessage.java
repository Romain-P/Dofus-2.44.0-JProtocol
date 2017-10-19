// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectMovePricedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeObjectMoveMessage {
  public static final int PROTOCOL_ID = 5514;
  // ui64
  public java.math.BigInteger price;

  public ExchangeObjectMovePricedMessage()
  {}

  public ExchangeObjectMovePricedMessage(int objectUID, int quantity, java.math.BigInteger price)
  {

    super(objectUID, quantity);
    this.price = price;
  }

  @Override
  public int getProtocolId()
  {
    return 5514;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.price);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.price = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "ExchangeObjectMovePricedMessage("
        + "objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ", price="
        + this.price
        + ')';
  }
}
