// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseInListRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5950;
  // i32
  public int itemUID;

  public ExchangeBidHouseInListRemovedMessage()
  {}

  public ExchangeBidHouseInListRemovedMessage(int itemUID)
  {
    this.itemUID = itemUID;
  }

  @Override
  public int getProtocolId()
  {
    return 5950;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.itemUID);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.itemUID = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseInListRemovedMessage(" + "itemUID=" + this.itemUID + ')';
  }
}
