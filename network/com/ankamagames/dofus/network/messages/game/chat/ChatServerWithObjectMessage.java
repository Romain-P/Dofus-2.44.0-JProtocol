// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatServerWithObjectMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatServerMessage {
  public static final int PROTOCOL_ID = 883;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;

  public ChatServerWithObjectMessage() {}

  public ChatServerWithObjectMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      double senderId,
      java.lang.String senderName,
      int senderAccountId,
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects) {

    super(channel, content, timestamp, fingerprint, senderId, senderName, senderAccountId);
    this.objects = objects;
  }

  public ChatServerWithObjectMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      double senderId,
      java.lang.String senderName,
      int senderAccountId,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects) {

    super(channel, content, timestamp, fingerprint, senderId, senderName, senderAccountId);
    this.objects =
        objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 883;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(objects.length);

    for (int i = 0; i < objects.length; i++) {

      objects[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int objects_length = reader.read_ui16();
    this.objects =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[objects_length];

    for (int i = 0; i < objects_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem objects_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      objects_it.deserialize(reader);
      this.objects[i] = objects_it;
    }
  }

  @Override
  public String toString() {

    return "ChatServerWithObjectMessage("
        + "channel="
        + this.channel
        + ", content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", fingerprint="
        + this.fingerprint
        + ", senderId="
        + this.senderId
        + ", senderName="
        + this.senderName
        + ", senderAccountId="
        + this.senderAccountId
        + ", objects="
        + java.util.Arrays.toString(this.objects)
        + ')';
  }
}
