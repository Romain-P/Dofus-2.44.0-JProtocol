// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkHumanVendorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5767;
  // f64
  public double sellerId;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop[]
      objectsInfos;

  public ExchangeStartOkHumanVendorMessage()
  {}

  public ExchangeStartOkHumanVendorMessage(
      double sellerId,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop[]
          objectsInfos)
  {
    this.sellerId = sellerId;
    this.objectsInfos = objectsInfos;
  }

  public ExchangeStartOkHumanVendorMessage(
      double sellerId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop>
          objectsInfos)
  {
    this.sellerId = sellerId;
    this.objectsInfos =
        objectsInfos.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5767;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.sellerId);
    writer.write_ui16(objectsInfos.length);

    for (int i = 0; i < objectsInfos.length; i++)
  {

      objectsInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.sellerId = reader.read_f64();

    int objectsInfos_length = reader.read_ui16();
    this.objectsInfos =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop
            [objectsInfos_length];

    for (int i = 0; i < objectsInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemToSellInHumanVendorShop
          objectsInfos_it =
              new com.ankamagames.dofus.network.types.game.data.items
                  .ObjectItemToSellInHumanVendorShop();

      objectsInfos_it.deserialize(reader);
      this.objectsInfos[i] = objectsInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "ExchangeStartOkHumanVendorMessage("
        + "sellerId="
        + this.sellerId
        + ", objectsInfos="
        + java.util.Arrays.toString(this.objectsInfos)
        + ')';
  }
}
