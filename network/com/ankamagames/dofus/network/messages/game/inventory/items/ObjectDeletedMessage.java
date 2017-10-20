// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectDeletedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3024;
  // vi32
  public int objectUID;

  public ObjectDeletedMessage() {}

  public ObjectDeletedMessage(int objectUID) {
    this.objectUID = objectUID;
  }

  @Override
  public int getProtocolId() {
    return 3024;
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

    return "ObjectDeletedMessage(" + "objectUID=" + this.objectUID + ')';
  }
}
