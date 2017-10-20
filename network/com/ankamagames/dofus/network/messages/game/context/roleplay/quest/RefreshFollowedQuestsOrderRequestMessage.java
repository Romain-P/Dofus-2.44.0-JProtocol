// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RefreshFollowedQuestsOrderRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6722;
  // array,vi16
  public short[] quests;

  public RefreshFollowedQuestsOrderRequestMessage() {}

  public RefreshFollowedQuestsOrderRequestMessage(short[] quests) {
    this.quests = quests;
  }

  @Override
  public int getProtocolId() {
    return 6722;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(quests.length);
    writer.write_array_vi16(this.quests);
  }

  @Override
  public void deserialize(DataReader reader) {

    int quests_length = reader.read_ui16();
    this.quests = reader.read_array_vi16(quests_length);
  }

  @Override
  public String toString() {

    return "RefreshFollowedQuestsOrderRequestMessage("
        + "quests="
        + java.util.Arrays.toString(this.quests)
        + ')';
  }
}
