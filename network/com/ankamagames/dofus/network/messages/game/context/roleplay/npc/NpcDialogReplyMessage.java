// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcDialogReplyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5616;
  // vi32
  public int replyId;

  public NpcDialogReplyMessage() {}

  public NpcDialogReplyMessage(int replyId) {
    this.replyId = replyId;
  }

  @Override
  public int getProtocolId() {
    return 5616;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.replyId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.replyId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "NpcDialogReplyMessage(" + "replyId=" + this.replyId + ')';
  }
}
