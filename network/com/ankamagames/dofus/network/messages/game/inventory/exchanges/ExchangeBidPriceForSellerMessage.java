// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidPriceForSellerMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeBidPriceMessage {
  public static final int PROTOCOL_ID = 6464;
  // bool
  public boolean allIdentical;
  // array,vi64
  public long[] minimalPrices;

  public ExchangeBidPriceForSellerMessage() {}

  public ExchangeBidPriceForSellerMessage(
      short genericId, long averagePrice, boolean allIdentical, long[] minimalPrices) {

    super(genericId, averagePrice);
    this.allIdentical = allIdentical;
    this.minimalPrices = minimalPrices;
  }

  @Override
  public int getProtocolId() {
    return 6464;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_bool(this.allIdentical);
    writer.write_ui16(minimalPrices.length);
    writer.write_array_vi64(this.minimalPrices);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allIdentical = reader.read_bool();

    int minimalPrices_length = reader.read_ui16();
    this.minimalPrices = reader.read_array_vi64(minimalPrices_length);
  }

  @Override
  public String toString() {

    return "ExchangeBidPriceForSellerMessage("
        + "genericId="
        + this.genericId
        + ", averagePrice="
        + this.averagePrice
        + ", allIdentical="
        + this.allIdentical
        + ", minimalPrices="
        + java.util.Arrays.toString(this.minimalPrices)
        + ')';
  }
}
