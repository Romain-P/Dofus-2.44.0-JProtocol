// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatClientPrivateMessage
    extends com.ankamagames.dofus.network.messages.game.chat.ChatAbstractClientMessage {
  public static final int PROTOCOL_ID = 851;
  // str
  public java.lang.String receiver;

  public ChatClientPrivateMessage() {}

  public ChatClientPrivateMessage(java.lang.String content, java.lang.String receiver) {

    super(content);
    this.receiver = receiver;
  }

  @Override
  public int getProtocolId() {
    return 851;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.receiver);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.receiver = reader.read_str();
  }

  @Override
  public String toString() {

    return "ChatClientPrivateMessage("
        + "content="
        + this.content
        + ", receiver="
        + this.receiver
        + ')';
  }
}
