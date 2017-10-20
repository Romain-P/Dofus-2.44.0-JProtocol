// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntDigRequestAnswerFailedMessage
    extends com.ankamagames
        .dofus
        .network
        .messages
        .game
        .context
        .roleplay
        .treasureHunt
        .TreasureHuntDigRequestAnswerMessage {
  public static final int PROTOCOL_ID = 6509;
  // i8
  public byte wrongFlagCount;

  public TreasureHuntDigRequestAnswerFailedMessage() {}

  public TreasureHuntDigRequestAnswerFailedMessage(
      byte questType, byte result, byte wrongFlagCount) {

    super(questType, result);
    this.wrongFlagCount = wrongFlagCount;
  }

  @Override
  public int getProtocolId() {
    return 6509;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.wrongFlagCount);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.wrongFlagCount = reader.read_i8();
  }

  @Override
  public String toString() {

    return "TreasureHuntDigRequestAnswerFailedMessage("
        + "questType="
        + this.questType
        + ", result="
        + this.result
        + ", wrongFlagCount="
        + this.wrongFlagCount
        + ')';
  }
}
