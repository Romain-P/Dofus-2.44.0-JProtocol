// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.chat.report;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatMessageReportMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 821;
  // str
  public java.lang.String senderName;
  // str
  public java.lang.String content;
  // i32
  public int timestamp;
  // i8
  public byte channel;
  // str
  public java.lang.String fingerprint;
  // i8
  public byte reason;

  public ChatMessageReportMessage()
  {}

  public ChatMessageReportMessage(
      java.lang.String senderName,
      java.lang.String content,
      int timestamp,
      byte channel,
      java.lang.String fingerprint,
      byte reason)
  {
    this.senderName = senderName;
    this.content = content;
    this.timestamp = timestamp;
    this.channel = channel;
    this.fingerprint = fingerprint;
    this.reason = reason;
  }

  @Override
  public int getProtocolId()
  {
    return 821;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.senderName);
    writer.write_str(this.content);
    writer.write_i32(this.timestamp);
    writer.write_i8(this.channel);
    writer.write_str(this.fingerprint);
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.senderName = reader.read_str();
    this.content = reader.read_str();
    this.timestamp = reader.read_i32();
    this.channel = reader.read_i8();
    this.fingerprint = reader.read_str();
    this.reason = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ChatMessageReportMessage("
        + "senderName="
        + this.senderName
        + ", content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", channel="
        + this.channel
        + ", fingerprint="
        + this.fingerprint
        + ", reason="
        + this.reason
        + ')';
  }
}
