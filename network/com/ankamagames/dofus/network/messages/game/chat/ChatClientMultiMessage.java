// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatClientMultiMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatAbstractClientMessage {
  public static final int PROTOCOL_ID = 861;
  // i8
  public byte channel;

  public ChatClientMultiMessage()
  {}

  public ChatClientMultiMessage(java.lang.String content, byte channel)
  {

    super(content);
    this.channel = channel;
  }

  @Override
  public int getProtocolId()
  {
    return 861;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.channel);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.channel = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ChatClientMultiMessage("
        + "content="
        + this.content
        + ", channel="
        + this.channel
        + ')';
  }
}
