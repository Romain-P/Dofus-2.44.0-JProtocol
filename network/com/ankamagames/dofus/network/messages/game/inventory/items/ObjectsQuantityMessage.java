// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectsQuantityMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6206;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity[] objectsUIDAndQty;

  public ObjectsQuantityMessage() {}

  public ObjectsQuantityMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity[] objectsUIDAndQty) {
    this.objectsUIDAndQty = objectsUIDAndQty;
  }

  public ObjectsQuantityMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity>
          objectsUIDAndQty) {
    this.objectsUIDAndQty =
        objectsUIDAndQty.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6206;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(objectsUIDAndQty.length);

    for (int i = 0; i < objectsUIDAndQty.length; i++) {

      objectsUIDAndQty[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int objectsUIDAndQty_length = reader.read_ui16();
    this.objectsUIDAndQty =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity
            [objectsUIDAndQty_length];

    for (int i = 0; i < objectsUIDAndQty_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity objectsUIDAndQty_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItemQuantity();

      objectsUIDAndQty_it.deserialize(reader);
      this.objectsUIDAndQty[i] = objectsUIDAndQty_it;
    }
  }

  @Override
  public String toString() {

    return "ObjectsQuantityMessage("
        + "objectsUIDAndQty="
        + java.util.Arrays.toString(this.objectsUIDAndQty)
        + ')';
  }
}
