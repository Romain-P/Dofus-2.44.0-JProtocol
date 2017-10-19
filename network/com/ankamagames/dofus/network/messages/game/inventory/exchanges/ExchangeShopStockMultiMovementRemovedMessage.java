// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeShopStockMultiMovementRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6037;
  // array,vi32
  public int[] objectIdList;

  public ExchangeShopStockMultiMovementRemovedMessage()
  {}

  public ExchangeShopStockMultiMovementRemovedMessage(int[] objectIdList)
  {
    this.objectIdList = objectIdList;
  }

  @Override
  public int getProtocolId()
  {
    return 6037;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objectIdList.length);
    writer.write_array_vi32(this.objectIdList);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objectIdList_length = reader.read_ui16();
    this.objectIdList = reader.read_array_vi32(objectIdList_length);
  }

  @Override
  public String toString()
  {

    return "ExchangeShopStockMultiMovementRemovedMessage("
        + "objectIdList="
        + java.util.Arrays.toString(this.objectIdList)
        + ')';
  }
}
