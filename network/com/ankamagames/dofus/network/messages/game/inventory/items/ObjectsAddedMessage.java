// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectsAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6033;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object;

  public ObjectsAddedMessage()
  {}

  public ObjectsAddedMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object)
  {
    this.object = object;
  }

  public ObjectsAddedMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          object)
  {
    this.object =
        object.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6033;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(object.length);

    for (int i = 0; i < object.length; i++)
  {

      object[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int object_length = reader.read_ui16();
    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[object_length];

    for (int i = 0; i < object_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem object_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      object_it.deserialize(reader);
      this.object[i] = object_it;
    }
  }

  @Override
  public String toString()
  {

    return "ObjectsAddedMessage(" + "object=" + java.util.Arrays.toString(this.object) + ')';
  }
}
