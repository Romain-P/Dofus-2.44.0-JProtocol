// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatAdminServerMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatServerMessage {
  public static final int PROTOCOL_ID = 6135;

  public ChatAdminServerMessage() {}

  public ChatAdminServerMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      double senderId,
      java.lang.String senderName,
      int senderAccountId) {

    super(channel, content, timestamp, fingerprint, senderId, senderName, senderAccountId);
  }

  @Override
  public int getProtocolId() {
    return 6135;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ChatAdminServerMessage("
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
        + ')';
  }
}
