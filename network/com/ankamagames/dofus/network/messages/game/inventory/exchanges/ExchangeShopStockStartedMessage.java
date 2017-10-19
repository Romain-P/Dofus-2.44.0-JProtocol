// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeShopStockStartedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5910;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[] objectsInfos;

  public ExchangeShopStockStartedMessage()
  {}

  public ExchangeShopStockStartedMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[] objectsInfos)
  {
    this.objectsInfos = objectsInfos;
  }

  public ExchangeShopStockStartedMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell>
          objectsInfos)
  {
    this.objectsInfos =
        objectsInfos.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5910;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objectsInfos.length);

    for (int i = 0; i < objectsInfos.length; i++)
  {

      objectsInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objectsInfos_length = reader.read_ui16();
    this.objectsInfos =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell
            [objectsInfos_length];

    for (int i = 0; i < objectsInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell objectsInfos_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell();

      objectsInfos_it.deserialize(reader);
      this.objectsInfos[i] = objectsInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeShopStockStartedMessage("
        + "objectsInfos="
        + java.util.Arrays.toString(this.objectsInfos)
        + ')';
  }
}
