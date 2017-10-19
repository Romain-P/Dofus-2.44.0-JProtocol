// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeShopStockMultiMovementUpdatedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6038;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[] objectInfoList;

  public ExchangeShopStockMultiMovementUpdatedMessage()
  {}

  public ExchangeShopStockMultiMovementUpdatedMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[] objectInfoList)
  {
    this.objectInfoList = objectInfoList;
  }

  public ExchangeShopStockMultiMovementUpdatedMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell>
          objectInfoList)
  {
    this.objectInfoList =
        objectInfoList.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6038;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objectInfoList.length);

    for (int i = 0; i < objectInfoList.length; i++)
  {

      objectInfoList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objectInfoList_length = reader.read_ui16();
    this.objectInfoList =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell
            [objectInfoList_length];

    for (int i = 0; i < objectInfoList_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell objectInfoList_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSell();

      objectInfoList_it.deserialize(reader);
      this.objectInfoList[i] = objectInfoList_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeShopStockMultiMovementUpdatedMessage("
        + "objectInfoList="
        + java.util.Arrays.toString(this.objectInfoList)
        + ')';
  }
}
