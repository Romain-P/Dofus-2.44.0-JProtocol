// Created by Heat the 2017-10-19 04:03:16+02:00
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
  // ui64
  public java.math.BigInteger price;

  public ObjectItemGenericQuantityPrice()
  {}

  public ObjectItemGenericQuantityPrice(short objectGID, int quantity, java.math.BigInteger price)
  {

    super(objectGID, quantity);
    this.price = price;
  }

  @Override
  public int getProtocolId()
  {
    return 494;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.price);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.price = reader.read_ui64();
  }

  @Override
  public String toString()
  {

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
