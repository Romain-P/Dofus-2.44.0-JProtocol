// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeSellMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5778;
  // vi32
  public int objectToSellId;
  // vi32
  public int quantity;

  public ExchangeSellMessage()
  {}

  public ExchangeSellMessage(int objectToSellId, int quantity)
  {
    this.objectToSellId = objectToSellId;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId()
  {
    return 5778;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.objectToSellId);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.objectToSellId = reader.read_vi32();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ExchangeSellMessage("
        + "objectToSellId="
        + this.objectToSellId
        + ", quantity="
        + this.quantity
        + ')';
  }
}
