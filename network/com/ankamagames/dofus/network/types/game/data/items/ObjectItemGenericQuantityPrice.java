// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemGenericQuantityPrice
    extends com.ankamagames.dofus.network.types.game.data.items.ObjectItemGenericQuantity {
  public static final int PROTOCOL_ID = 494;
  // vi64
  public long price;

  public ObjectItemGenericQuantityPrice() {}

  public ObjectItemGenericQuantityPrice(short objectGID, int quantity, long price) {

    super(objectGID, quantity);
    this.price = price;
  }

  @Override
  public int getProtocolId() {
    return 494;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.price);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.price = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ObjectItemGenericQuantityPrice("
        + "objectGID="
        + this.objectGID
        + ", quantity="
        + this.quantity
        + ", price="
        + this.price
        + ')';
  }
}
