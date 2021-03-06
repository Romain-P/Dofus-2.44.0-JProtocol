// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat.community;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChatCommunityChannelCommunityMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6730;
  // i16
  public short communityId;

  public ChatCommunityChannelCommunityMessage() {}

  public ChatCommunityChannelCommunityMessage(short communityId) {
    this.communityId = communityId;
  }

  @Override
  public int getProtocolId() {
    return 6730;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i16(this.communityId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.communityId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "ChatCommunityChannelCommunityMessage(" + "communityId=" + this.communityId + ')';
  }
}
