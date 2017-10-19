// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectQuantityMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3023;
  // vi32
  public int objectUID;
  // vi32
  public int quantity;

  public ObjectQuantityMessage()
  {}

  public ObjectQuantityMessage(int objectUID, int quantity)
  {
    this.objectUID = objectUID;
    this.quantity = quantity;
  }

  @Override
  public int getProtocolId()
  {
    return 3023;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.objectUID);
    writer.write_vi32(this.quantity);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.objectUID = reader.read_vi32();
    this.quantity = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ObjectQuantityMessage("
        + "objectUID="
        + this.objectUID
        + ", quantity="
        + this.quantity
        + ')';
  }
}
