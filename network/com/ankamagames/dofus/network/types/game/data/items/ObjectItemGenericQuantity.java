// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemGenericQuantity
    extends com.ankamagames.dofus.network.types.game.data.items.Item {
  public static final int PROTOCOL_ID = 483;
  // vi16
  public short objectGID;
  // vi32
  public int quantity;

  public ObjectItemGenericQuantity() {}

  public ObjectItemGenericQuantity(short objectGID, int quantity) {

    super();
    this.objectGID = objectGID;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 483;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.objectGID);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.objectGID = reader.read_vi16();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectItemGenericQuantity("
        + "objectGID="
        + this.objectGID
        + ", quantity="
        + this.quantity
        + ')';
  }
}
