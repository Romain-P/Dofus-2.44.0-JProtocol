// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseUnsoldItemsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6612;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[] items;

  public ExchangeBidHouseUnsoldItemsMessage()
  {}

  public ExchangeBidHouseUnsoldItemsMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[] items)
  {
    this.items = items;
  }

  public ExchangeBidHouseUnsoldItemsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity>
          items)
  {
    this.items =
        items.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6612;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(items.length);

    for (int i = 0; i < items.length; i++)
  {

      items[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int items_length = reader.read_ui16();
    this.items =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity
            [items_length];

    for (int i = 0; i < items_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity items_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity();

      items_it.deserialize(reader);
      this.items[i] = items_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseUnsoldItemsMessage("
        + "items="
        + java.util.Arrays.toString(this.items)
        + ')';
  }
}
