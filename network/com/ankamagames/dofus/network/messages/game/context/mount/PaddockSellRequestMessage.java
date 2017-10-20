// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockSellRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5953;
  // vi64
  public long price;
  // bool
  public boolean forSale;

  public PaddockSellRequestMessage() {}

  public PaddockSellRequestMessage(long price, boolean forSale) {
    this.price = price;
    this.forSale = forSale;
  }

  @Override
  public int getProtocolId() {
    return 5953;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.price);
    writer.write_bool(this.forSale);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.price = reader.read_vi64();
    this.forSale = reader.read_bool();
  }

  @Override
  public String toString() {

    return "PaddockSellRequestMessage(" + "price=" + this.price + ", forSale=" + this.forSale + ')';
  }
}
