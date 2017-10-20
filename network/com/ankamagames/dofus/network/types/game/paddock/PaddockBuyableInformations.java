// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockBuyableInformations extends NetworkType {
  public static final int PROTOCOL_ID = 130;
  // vi64
  public long price;
  // bool
  public boolean locked;

  public PaddockBuyableInformations() {}

  public PaddockBuyableInformations(long price, boolean locked) {
    this.price = price;
    this.locked = locked;
  }

  @Override
  public int getProtocolId() {
    return 130;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.price);
    writer.write_bool(this.locked);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.price = reader.read_vi64();
    this.locked = reader.read_bool();
  }

  @Override
  public String toString() {

    return "PaddockBuyableInformations(" + "price=" + this.price + ", locked=" + this.locked + ')';
  }
}
