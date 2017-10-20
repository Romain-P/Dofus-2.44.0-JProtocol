// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSummonMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 5825;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
      summons;

  public GameActionFightSummonMessage() {}

  public GameActionFightSummonMessage(
      short actionId,
      double sourceId,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
          summons) {

    super(actionId, sourceId);
    this.summons = summons;
  }

  public GameActionFightSummonMessage(
      short actionId,
      double sourceId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations>
          summons) {

    super(actionId, sourceId);
    this.summons =
        summons.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5825;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(summons.length);

    for (int i = 0; i < summons.length; i++) {

      writer.write_ui16(summons[i].getProtocolId());

      summons[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int summons_length = reader.read_ui16();
    this.summons =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
            [summons_length];

    for (int i = 0; i < summons_length; i++) {

      int summons_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
          summons_it =
              (com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations)
                  InternalProtocolTypeManager.get(summons_it_typeId);

      summons_it.deserialize(reader);
      this.summons[i] = summons_it;
    }
  }

  @Override
  public String toString() {

    return "GameActionFightSummonMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", summons="
        + java.util.Arrays.toString(this.summons)
        + ')';
  }
}
