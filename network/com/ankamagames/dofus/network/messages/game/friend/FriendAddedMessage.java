// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5599;
  // com.ankamagames.dofus.network.types.game.friend.FriendInformations
  public com.ankamagames.dofus.network.types.game.friend.FriendInformations friendAdded;

  public FriendAddedMessage() {}

  public FriendAddedMessage(
      com.ankamagames.dofus.network.types.game.friend.FriendInformations friendAdded) {
    this.friendAdded = friendAdded;
  }

  @Override
  public int getProtocolId() {
    return 5599;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.friendAdded.getProtocolId());
    this.friendAdded.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    int friendAdded_typeId = reader.read_ui16();
    this.friendAdded =
        (com.ankamagames.dofus.network.types.game.friend.FriendInformations)
            InternalProtocolTypeManager.get(friendAdded_typeId);
    this.friendAdded.deserialize(reader);
  }

  @Override
  public String toString() {

    return "FriendAddedMessage(" + "friendAdded=" + this.friendAdded + ')';
  }
}
