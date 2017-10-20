// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectUseMultipleMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseMessage {
  public static final int PROTOCOL_ID = 6234;
  // vi32
  public int quantity;

  public ObjectUseMultipleMessage() {}

  public ObjectUseMultipleMessage(int objectUID, int quantity) {

    super(objectUID);
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId() {
    return 6234;
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

    return "ObjectUseMultipleMessage("
        + "objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ')';
  }
}
