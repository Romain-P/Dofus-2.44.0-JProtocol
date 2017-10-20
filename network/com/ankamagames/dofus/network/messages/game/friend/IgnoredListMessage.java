// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5674;
  // array,com.ankamagames.dofus.network.types.game.friend.IgnoredInformations
  public com.ankamagames.dofus.network.types.game.friend.IgnoredInformations[] ignoredList;

  public IgnoredListMessage() {}

  public IgnoredListMessage(
      com.ankamagames.dofus.network.types.game.friend.IgnoredInformations[] ignoredList) {
    this.ignoredList = ignoredList;
  }

  public IgnoredListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.friend.IgnoredInformations>
          ignoredList) {
    this.ignoredList =
        ignoredList.toArray(
            com.ankamagames.dofus.network.types.game.friend.IgnoredInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5674;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(ignoredList.length);

    for (int i = 0; i < ignoredList.length; i++) {

      writer.write_ui16(ignoredList[i].getProtocolId());

      ignoredList[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int ignoredList_length = reader.read_ui16();
    this.ignoredList =
        new com.ankamagames.dofus.network.types.game.friend.IgnoredInformations[ignoredList_length];

    for (int i = 0; i < ignoredList_length; i++) {

      int ignoredList_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.friend.IgnoredInformations ignoredList_it =
          (com.ankamagames.dofus.network.types.game.friend.IgnoredInformations)
              InternalProtocolTypeManager.get(ignoredList_it_typeId);

      ignoredList_it.deserialize(reader);
      this.ignoredList[i] = ignoredList_it;
    }
  }

  @Override
  public String toString() {

    return "IgnoredListMessage("
        + "ignoredList="
        + java.util.Arrays.toString(this.ignoredList)
        + ')';
  }
}
