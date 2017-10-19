// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatServerMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatAbstractServerMessage {
  public static final int PROTOCOL_ID = 881;
  // f64
  public double senderId;
  // str
  public java.lang.String senderName;
  // i32
  public int senderAccountId;

  public ChatServerMessage()
  {}

  public ChatServerMessage(
      byte channel,
      java.lang.String content,
      int timestamp,
      java.lang.String fingerprint,
      double senderId,
      java.lang.String senderName,
      int senderAccountId)
  {

    super(channel, content, timestamp, fingerprint);
    this.senderId = senderId;
    this.senderName = senderName;
    this.senderAccountId = senderAccountId;
  }

  @Override
  public int getProtocolId()
  {
    return 881;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.senderId);
    writer.write_str(this.senderName);
    writer.write_i32(this.senderAccountId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.senderId = reader.read_f64();
    this.senderName = reader.read_str();
    this.senderAccountId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ChatServerMessage("
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
