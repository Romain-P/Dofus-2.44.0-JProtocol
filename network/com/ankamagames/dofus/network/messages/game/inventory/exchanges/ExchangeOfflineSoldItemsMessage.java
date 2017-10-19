// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeOfflineSoldItemsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6613;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
      bidHouseItems;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
      merchantItems;

  public ExchangeOfflineSoldItemsMessage()
  {}

  public ExchangeOfflineSoldItemsMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
          bidHouseItems,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
          merchantItems)
  {
    this.bidHouseItems = bidHouseItems;
    this.merchantItems = merchantItems;
  }

  public ExchangeOfflineSoldItemsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice>
          bidHouseItems,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice>
          merchantItems)
  {
    this.bidHouseItems =
        bidHouseItems.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
                ::new);
    this.merchantItems =
        merchantItems.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6613;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(bidHouseItems.length);

    for (int i = 0; i < bidHouseItems.length; i++)
  {

      bidHouseItems[i].serialize(writer);
    }
    writer.write_ui16(merchantItems.length);

    for (int i = 0; i < merchantItems.length; i++)
  {

      merchantItems[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int bidHouseItems_length = reader.read_ui16();
    this.bidHouseItems =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
            [bidHouseItems_length];

    for (int i = 0; i < bidHouseItems_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
          bidHouseItems_it =
              new com.ankamagames.dofus.network.types.game.data.items
                  .ObjectItemGenericQuantityPrice();

      bidHouseItems_it.deserialize(reader);
      this.bidHouseItems[i] = bidHouseItems_it;
    }

    int merchantItems_length = reader.read_ui16();
    this.merchantItems =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
            [merchantItems_length];

    for (int i = 0; i < merchantItems_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantityPrice
          merchantItems_it =
              new com.ankamagames.dofus.network.types.game.data.items
                  .ObjectItemGenericQuantityPrice();

      merchantItems_it.deserialize(reader);
      this.merchantItems[i] = merchantItems_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeOfflineSoldItemsMessage("
        + "bidHouseItems="
        + java.util.Arrays.toString(this.bidHouseItems)
        + ", merchantItems="
        + java.util.Arrays.toString(this.merchantItems)
        + ')';
  }
}
