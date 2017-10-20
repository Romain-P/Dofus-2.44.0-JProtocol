// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageObjectRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5648;
  // vi32
  public int objectUID;

  public StorageObjectRemoveMessage() {}

  public StorageObjectRemoveMessage(int objectUID) {
    this.objectUID = objectUID;
  }

  @Override
  public int getProtocolId() {
    return 5648;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.objectUID);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectUID = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "StorageObjectRemoveMessage(" + "objectUID=" + this.objectUID + ')';
  }
}
