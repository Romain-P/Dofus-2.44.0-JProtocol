// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartedBidBuyerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5904;
  // com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor
  public com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor buyerDescriptor;

  public ExchangeStartedBidBuyerMessage()
  {}

  public ExchangeStartedBidBuyerMessage(
      com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor buyerDescriptor)
  {
    this.buyerDescriptor = buyerDescriptor;
  }

  @Override
  public int getProtocolId()
  {
    return 5904;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.buyerDescriptor.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.buyerDescriptor =
        new com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor();
    this.buyerDescriptor.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ExchangeStartedBidBuyerMessage(" + "buyerDescriptor=" + this.buyerDescriptor + ')';
  }
}
