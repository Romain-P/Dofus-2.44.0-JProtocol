// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectsDeletedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6034;
  // array,vi32
  public int[] objectUID;

  public ObjectsDeletedMessage()
  {}

  public ObjectsDeletedMessage(int[] objectUID)
  {
    this.objectUID = objectUID;
  }

  @Override
  public int getProtocolId()
  {
    return 6034;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objectUID.length);
    writer.write_array_vi32(this.objectUID);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objectUID_length = reader.read_ui16();
    this.objectUID = reader.read_array_vi32(objectUID_length);
  }

  @Override
  public String toString()
  {

    return "ObjectsDeletedMessage("
        + "objectUID="
        + java.util.Arrays.toString(this.objectUID)
        + ')';
  }
}
