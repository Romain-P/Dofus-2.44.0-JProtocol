// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageInventoryContentMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.InventoryContentMessage {
  public static final int PROTOCOL_ID = 5646;

  public StorageInventoryContentMessage() {}

  public StorageInventoryContentMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects, long kamas) {

    super(objects, kamas);
  }

  public StorageInventoryContentMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects,
      long kamas) {

    super(objects, kamas);
  }

  @Override
  public int getProtocolId() {
    return 5646;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "StorageInventoryContentMessage("
        + "objects="
        + java.util.Arrays.toString(this.objects)
        + ", kamas="
        + this.kamas
        + ')';
  }
}
