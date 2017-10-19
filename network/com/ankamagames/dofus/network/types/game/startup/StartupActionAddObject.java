// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionAddObject extends NetworkType {
  public static final int PROTOCOL_ID = 52;
  // i32
  public int uid;
  // str
  public java.lang.String title;
  // str
  public java.lang.String text;
  // str
  public java.lang.String descUrl;
  // str
  public java.lang.String pictureUrl;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity[]
      items;

  public StartupActionAddObject()
  {}

  public StartupActionAddObject(
      int uid,
      java.lang.String title,
      java.lang.String text,
      java.lang.String descUrl,
      java.lang.String pictureUrl,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity[]
          items)
  {
    this.uid = uid;
    this.title = title;
    this.text = text;
    this.descUrl = descUrl;
    this.pictureUrl = pictureUrl;
    this.items = items;
  }

  public StartupActionAddObject(
      int uid,
      java.lang.String title,
      java.lang.String text,
      java.lang.String descUrl,
      java.lang.String pictureUrl,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity>
          items)
  {
    this.uid = uid;
    this.title = title;
    this.text = text;
    this.descUrl = descUrl;
    this.pictureUrl = pictureUrl;
    this.items =
        items.toArray(
            com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 52;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.uid);
    writer.write_str(this.title);
    writer.write_str(this.text);
    writer.write_str(this.descUrl);
    writer.write_str(this.pictureUrl);
    writer.write_ui16(items.length);

    for (int i = 0; i < items.length; i++)
  {

      items[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.uid = reader.read_i32();
    this.title = reader.read_str();
    this.text = reader.read_str();
    this.descUrl = reader.read_str();
    this.pictureUrl = reader.read_str();

    int items_length = reader.read_ui16();
    this.items =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity
            [items_length];

    for (int i = 0; i < items_length; i++)
  {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItemInformationWithQuantity
          items_it =
              new com.ankamagames.dofus.network.types.game.data.items
                  .ObjectItemInformationWithQuantity();

      items_it.deserialize(reader);
      this.items[i] = items_it;
    }
  }

  @Override
  public String toString()
  {

    return "StartupActionAddObject("
        + "uid="
        + this.uid
        + ", title="
        + this.title
        + ", text="
        + this.text
        + ", descUrl="
        + this.descUrl
        + ", pictureUrl="
        + this.pictureUrl
        + ", items="
        + java.util.Arrays.toString(this.items)
        + ')';
  }
}
