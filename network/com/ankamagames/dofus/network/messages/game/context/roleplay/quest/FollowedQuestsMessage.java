// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.quest;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FollowedQuestsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6717;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.quest.QuestActiveDetailedInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.quest
          .QuestActiveDetailedInformations[]
      quests;

  public FollowedQuestsMessage() {}

  public FollowedQuestsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .QuestActiveDetailedInformations
              []
          quests) {
    this.quests = quests;
  }

  public FollowedQuestsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .QuestActiveDetailedInformations>
          quests) {
    this.quests =
        quests.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.quest
                        .QuestActiveDetailedInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6717;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(quests.length);

    for (int i = 0; i < quests.length; i++) {

      quests[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int quests_length = reader.read_ui16();
    this.quests =
        new com.ankamagames.dofus.network.types.game.context.roleplay.quest
                .QuestActiveDetailedInformations[quests_length];

    for (int i = 0; i < quests_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.quest
              .QuestActiveDetailedInformations
          quests_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.quest
                  .QuestActiveDetailedInformations();

      quests_it.deserialize(reader);
      this.quests[i] = quests_it;
    }
  }

  @Override
  public String toString() {

    return "FollowedQuestsMessage(" + "quests=" + java.util.Arrays.toString(this.quests) + ')';
  }
}
