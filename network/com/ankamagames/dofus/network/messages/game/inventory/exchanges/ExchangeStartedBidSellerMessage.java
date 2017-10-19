// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartedBidSellerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5905;
  // com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor
  public com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor sellerDescriptor;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid[] objectsInfos;

  public ExchangeStartedBidSellerMessage()
  {}

  public ExchangeStartedBidSellerMessage(
      com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor sellerDescriptor,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid[] objectsInfos)
  {
    this.sellerDescriptor = sellerDescriptor;
    this.objectsInfos = objectsInfos;
  }

  public ExchangeStartedBidSellerMessage(
      com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor sellerDescriptor,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid>
          objectsInfos)
  {
    this.sellerDescriptor = sellerDescriptor;
    this.objectsInfos =
        objectsInfos.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5905;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.sellerDescriptor.serialize(writer);
    writer.write_ui16(objectsInfos.length);

    for (int i = 0; i < objectsInfos.length; i++)
  {

      objectsInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.sellerDescriptor =
        new com.ankamagames.dofus.network.types.game.data.items.SellerBuyerDescriptor();
    this.sellerDescriptor.deserialize(reader);

    int objectsInfos_length = reader.read_ui16();
    this.objectsInfos =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid
            [objectsInfos_length];

    for (int i = 0; i < objectsInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid objectsInfos_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInBid();

      objectsInfos_it.deserialize(reader);
      this.objectsInfos[i] = objectsInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeStartedBidSellerMessage("
        + "sellerDescriptor="
        + this.sellerDescriptor
        + ", objectsInfos="
        + java.util.Arrays.toString(this.objectsInfos)
        + ')';
  }
}
