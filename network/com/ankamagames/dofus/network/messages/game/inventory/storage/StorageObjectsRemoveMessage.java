// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageObjectsRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6035;
  // array,vi32
  public int[] objectUIDList;

  public StorageObjectsRemoveMessage()
  {}

  public StorageObjectsRemoveMessage(int[] objectUIDList)
  {
    this.objectUIDList = objectUIDList;
  }

  @Override
  public int getProtocolId()
  {
    return 6035;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objectUIDList.length);
    writer.write_array_vi32(this.objectUIDList);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objectUIDList_length = reader.read_ui16();
    this.objectUIDList = reader.read_array_vi32(objectUIDList_length);
  }

  @Override
  public String toString()
  {

    return "StorageObjectsRemoveMessage("
        + "objectUIDList="
        + java.util.Arrays.toString(this.objectUIDList)
        + ')';
  }
}
