// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectSetPositionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3021;
  // vi32
  public int objectUID;
  // ui8
  public short position;
  // vi32
  public int quantity;

  public ObjectSetPositionMessage() {}

  public ObjectSetPositionMessage(int objectUID, short position, int quantity) {
    this.objectUID = objectUID;
    this.position = position;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 3021;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.objectUID);
    writer.write_ui8(this.position);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.objectUID = reader.read_vi32();
    this.position = reader.read_ui8();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObjectSetPositionMessage("
        + "objectUID="
        + this.objectUID
        + ", position="
        + this.position
        + ", quantity="
        + this.quantity
        + ')';
  }
}
