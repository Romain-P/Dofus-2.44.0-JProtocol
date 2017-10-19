// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidHouseItemRemoveOkMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5946;
  // i32
  public int sellerId;

  public ExchangeBidHouseItemRemoveOkMessage()
  {}

  public ExchangeBidHouseItemRemoveOkMessage(int sellerId)
  {
    this.sellerId = sellerId;
  }

  @Override
  public int getProtocolId()
  {
    return 5946;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.sellerId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.sellerId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ExchangeBidHouseItemRemoveOkMessage(" + "sellerId=" + this.sellerId + ')';
  }
}
