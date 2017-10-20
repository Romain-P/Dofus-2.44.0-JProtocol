// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.data.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemInformationWithQuantity
    extends com.ankamagames.dofus.network.types.game.data.items.ObjectItemMinimalInformation {
  public static final int PROTOCOL_ID = 387;
  // vi32
  public int quantity;

  public ObjectItemInformationWithQuantity() {}

  public ObjectItemInformationWithQuantity(
      short objectGID,
      com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect[] effects,
      int quantity) {

    super(objectGID, effects);
    this.quantity = quantity;
  }

  public ObjectItemInformationWithQuantity(
      short objectGID,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.effects.ObjectEffect>
          effects,
      int quantity) {

    super(objectGID, effects);
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 387;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectItemInformationWithQuantity("
        + "objectGID="
        + this.objectGID
        + ", effects="
        + java.util.Arrays.toString(this.effects)
        + ", quantity="
        + this.quantity
        + ')';
  }
}
