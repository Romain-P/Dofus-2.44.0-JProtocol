// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeBidPriceMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5755;
  // vi16
  public short genericId;
  // vi64
  public long averagePrice;

  public ExchangeBidPriceMessage() {}

  public ExchangeBidPriceMessage(short genericId, long averagePrice) {
    this.genericId = genericId;
    this.averagePrice = averagePrice;
  }

  @Override
  public int getProtocolId() {
    return 5755;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.genericId);
    writer.write_vi64(this.averagePrice);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.genericId = reader.read_vi16();
    this.averagePrice = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeBidPriceMessage("
        + "genericId="
        + this.genericId
        + ", averagePrice="
        + this.averagePrice
        + ')';
  }
}
