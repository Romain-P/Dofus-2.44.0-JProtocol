// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5924;
  // com.ankamagames.dofus.network.types.game.friend.FriendInformations
  public com.ankamagames.dofus.network.types.game.friend.FriendInformations friendUpdated;

  public FriendUpdateMessage() {}

  public FriendUpdateMessage(
      com.ankamagames.dofus.network.types.game.friend.FriendInformations friendUpdated) {
    this.friendUpdated = friendUpdated;
  }

  @Override
  public int getProtocolId() {
    return 5924;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(this.friendUpdated.getProtocolId());
    this.friendUpdated.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    int friendUpdated_typeId = reader.read_ui16();
    this.friendUpdated =
        (com.ankamagames.dofus.network.types.game.friend.FriendInformations)
            InternalProtocolTypeManager.get(friendUpdated_typeId);
    this.friendUpdated.deserialize(reader);
  }

  @Override
  public String toString() {

    return "FriendUpdateMessage(" + "friendUpdated=" + this.friendUpdated + ')';
  }
}
