// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LocalizedChatSmileyMessage
    extends com.ankamagames.dofus.network.messages.game.chat.smiley.ChatSmileyMessage {
  public static final int PROTOCOL_ID = 6185;
  // vi16
  public short cellId;

  public LocalizedChatSmileyMessage() {}

  public LocalizedChatSmileyMessage(double entityId, short smileyId, int accountId, short cellId) {

    super(entityId, smileyId, accountId);
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId() {
    return 6185;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.cellId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "LocalizedChatSmileyMessage("
        + "entityId="
        + this.entityId
        + ", smileyId="
        + this.smileyId
        + ", accountId="
        + this.accountId
        + ", cellId="
        + this.cellId
        + ')';
  }
}
