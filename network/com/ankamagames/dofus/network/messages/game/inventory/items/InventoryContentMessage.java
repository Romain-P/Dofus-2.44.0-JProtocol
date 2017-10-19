// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InventoryContentMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3016;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;
  // ui64
  public java.math.BigInteger kamas;

  public InventoryContentMessage()
  {}

  public InventoryContentMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects,
      java.math.BigInteger kamas)
  {
    this.objects = objects;
    this.kamas = kamas;
  }

  public InventoryContentMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects,
      java.math.BigInteger kamas)
  {
    this.objects =
        objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
    this.kamas = kamas;
  }

  @Override
  public int getProtocolId()
  {
    return 3016;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(objects.length);

    for (int i = 0; i < objects.length; i++)
  {

      objects[i].serialize(writer);
    }
    writer.write_ui64(this.kamas);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int objects_length = reader.read_ui16();
    this.objects =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[objects_length];

    for (int i = 0; i < objects_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem objects_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      objects_it.deserialize(reader);
      this.objects[i] = objects_it;
    }
    this.kamas = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "InventoryContentMessage("
        + "objects="
        + java.util.Arrays.toString(this.objects)
        + ", kamas="
        + this.kamas
        + ')';
  }
}
