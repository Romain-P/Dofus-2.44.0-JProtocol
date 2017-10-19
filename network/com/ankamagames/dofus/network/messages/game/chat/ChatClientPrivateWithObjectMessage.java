// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatClientPrivateWithObjectMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatClientPrivateMessage {
  public static final int PROTOCOL_ID = 852;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;

  public ChatClientPrivateWithObjectMessage()
  {}

  public ChatClientPrivateWithObjectMessage(
      java.lang.String content,
      java.lang.String receiver,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects)
  {

    super(content, receiver);
    this.objects = objects;
  }

  public ChatClientPrivateWithObjectMessage(
      java.lang.String content,
      java.lang.String receiver,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects)
  {

    super(content, receiver);
    this.objects =
        objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 852;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(objects.length);

    for (int i = 0; i < objects.length; i++)
  {

      objects[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

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
  }

  @Override
  public String toString()
  {

    return "ChatClientPrivateWithObjectMessage("
        + "content="
        + this.content
        + ", receiver="
        + this.receiver
        + ", objects="
        + java.util.Arrays.toString(this.objects)
        + ')';
  }
}
