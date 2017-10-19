// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatAbstractClientMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 850;
  // str
  public java.lang.String content;

  public ChatAbstractClientMessage()
  {}

  public ChatAbstractClientMessage(java.lang.String content)
  {
    this.content = content;
  }

  @Override
  public int getProtocolId()
  {
    return 850;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.content);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.content = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "ChatAbstractClientMessage(" + "content=" + this.content + ')';
  }
}
