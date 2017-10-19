// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatServerCopyWithObjectMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatServerCopyMessage {
  public static final int PROTOCOL_ID = 884;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;

  public ChatServerCopyWithObjectMessage()
  {}

  public ChatServerCopyWithObjectMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      java.math.BigInteger receiverId,
      java.lang.String receiverName,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects)
  {

    super(channel, content, timestamp, fingerprint, receiverId, receiverName);
    this.objects = objects;
  }

  public ChatServerCopyWithObjectMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      java.math.BigInteger receiverId,
      java.lang.String receiverName,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects)
  {

    super(channel, content, timestamp, fingerprint, receiverId, receiverName);
    this.objects =
        objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 884;
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

    return "ChatServerCopyWithObjectMessage("
        + "channel="
        + this.channel
        + ", content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", fingerprint="
        + this.fingerprint
        + ", receiverId="
        + this.receiverId
        + ", receiverName="
        + this.receiverName
        + ", objects="
        + java.util.Arrays.toString(this.objects)
        + ')';
  }
}
