// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeTypesItemsExchangerDescriptionForUserMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5752;
  // array,com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo
  public com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo[]
      itemTypeDescriptions;

  public ExchangeTypesItemsExchangerDescriptionForUserMessage() {}

  public ExchangeTypesItemsExchangerDescriptionForUserMessage(
      com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo[]
          itemTypeDescriptions) {
    this.itemTypeDescriptions = itemTypeDescriptions;
  }

  public ExchangeTypesItemsExchangerDescriptionForUserMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo>
          itemTypeDescriptions) {
    this.itemTypeDescriptions =
        itemTypeDescriptions.toArray(
            com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5752;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(itemTypeDescriptions.length);

    for (int i = 0; i < itemTypeDescriptions.length; i++) {

      itemTypeDescriptions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int itemTypeDescriptions_length = reader.read_ui16();
    this.itemTypeDescriptions =
        new com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo
            [itemTypeDescriptions_length];

    for (int i = 0; i < itemTypeDescriptions_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo
          itemTypeDescriptions_it =
              new com.ankamagames.dofus.network.types.game.data.items.BidExchangerObjectInfo();

      itemTypeDescriptions_it.deserialize(reader);
      this.itemTypeDescriptions[i] = itemTypeDescriptions_it;
    }
  }

  @Override
  public String toString() {

    return "ExchangeTypesItemsExchangerDescriptionForUserMessage("
        + "itemTypeDescriptions="
        + java.util.Arrays.toString(this.itemTypeDescriptions)
        + ')';
  }
}
