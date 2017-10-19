// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatAbstractServerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 880;
  // i8
  public byte channel;
  // str
  public java.lang.String content;
  // i32
  public int timestamp;
  // str
  public java.lang.String fingerprint;

  public ChatAbstractServerMessage()
  {}

  public ChatAbstractServerMessage(
      byte channel, java.lang.String content, int timestamp, java.lang.String fingerprint)
  {
    this.channel = channel;
    this.content = content;
    this.timestamp = timestamp;
    this.fingerprint = fingerprint;
  }

  @Override
  public int getProtocolId()
  {
    return 880;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.channel);
    writer.write_str(this.content);
    writer.write_i32(this.timestamp);
    writer.write_str(this.fingerprint);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.channel = reader.read_i8();
    this.content = reader.read_str();
    this.timestamp = reader.read_i32();
    this.fingerprint = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "ChatAbstractServerMessage("
        + "channel="
        + this.channel
        + ", content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", fingerprint="
        + this.fingerprint
        + ')';
  }
}
