// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageObjectsUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6036;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objectList;

  public StorageObjectsUpdateMessage() {}

  public StorageObjectsUpdateMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objectList) {
    this.objectList = objectList;
  }

  public StorageObjectsUpdateMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objectList) {
    this.objectList =
        objectList.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6036;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(objectList.length);

    for (int i = 0; i < objectList.length; i++) {

      objectList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int objectList_length = reader.read_ui16();
    this.objectList =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[objectList_length];

    for (int i = 0; i < objectList_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem objectList_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      objectList_it.deserialize(reader);
      this.objectList[i] = objectList_it;
    }
  }

  @Override
  public String toString() {

    return "StorageObjectsUpdateMessage("
        + "objectList="
        + java.util.Arrays.toString(this.objectList)
        + ')';
  }
}
