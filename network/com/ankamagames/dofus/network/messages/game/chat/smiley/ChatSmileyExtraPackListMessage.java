// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatSmileyExtraPackListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6596;
  // array,i8
  public byte[] packIds;

  public ChatSmileyExtraPackListMessage() {}

  public ChatSmileyExtraPackListMessage(byte[] packIds) {
    this.packIds = packIds;
  }

  @Override
  public int getProtocolId() {
    return 6596;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(packIds.length);
    writer.write_array_i8(this.packIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    int packIds_length = reader.read_ui16();
    this.packIds = reader.read_array_i8(packIds_length);
  }

  @Override
  public String toString() {

    return "ChatSmileyExtraPackListMessage(" + "packIds=" + +this.packIds.length + "b" + ')';
  }
}
