// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 4002;
  // array,com.ankamagames.dofus.network.types.game.friend.FriendInformations
  public com.ankamagames.dofus.network.types.game.friend.FriendInformations[] friendsList;

  public FriendsListMessage() {}

  public FriendsListMessage(
      com.ankamagames.dofus.network.types.game.friend.FriendInformations[] friendsList) {
    this.friendsList = friendsList;
  }

  public FriendsListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.friend.FriendInformations>
          friendsList) {
    this.friendsList =
        friendsList.toArray(
            com.ankamagames.dofus.network.types.game.friend.FriendInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 4002;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(friendsList.length);

    for (int i = 0; i < friendsList.length; i++) {

      writer.write_ui16(friendsList[i].getProtocolId());

      friendsList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int friendsList_length = reader.read_ui16();
    this.friendsList =
        new com.ankamagames.dofus.network.types.game.friend.FriendInformations[friendsList_length];

    for (int i = 0; i < friendsList_length; i++) {

      int friendsList_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.friend.FriendInformations friendsList_it =
          (com.ankamagames.dofus.network.types.game.friend.FriendInformations)
              InternalProtocolTypeManager.get(friendsList_it_typeId);

      friendsList_it.deserialize(reader);
      this.friendsList[i] = friendsList_it;
    }
  }

  @Override
  public String toString() {

    return "FriendsListMessage("
        + "friendsList="
        + java.util.Arrays.toString(this.friendsList)
        + ')';
  }
}
