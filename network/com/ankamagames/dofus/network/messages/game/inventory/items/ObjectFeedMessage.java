// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectFeedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6290;
  // vi32
  public int objectUID;
  // vi32
  public int foodUID;
  // vi32
  public int foodQuantity;

  public ObjectFeedMessage() {}

  public ObjectFeedMessage(int objectUID, int foodUID, int foodQuantity) {
    this.objectUID = objectUID;
    this.foodUID = foodUID;
    this.foodQuantity = foodQuantity;
  }

  @Override
  public int getProtocolId() {
    return 6290;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.objectUID);
    writer.write_vi32(this.foodUID);
    writer.write_vi32(this.foodQuantity);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectUID = reader.read_vi32();
    this.foodUID = reader.read_vi32();
    this.foodQuantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectFeedMessage("
        + "objectUID="
        + this.objectUID
        + ", foodUID="
        + this.foodUID
        + ", foodQuantity="
        + this.foodQuantity
        + ')';
  }
}
