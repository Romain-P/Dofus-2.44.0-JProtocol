// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightSynchronizeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5921;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
      fighters;

  public GameFightSynchronizeMessage() {}

  public GameFightSynchronizeMessage(
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
          fighters) {
    this.fighters = fighters;
  }

  public GameFightSynchronizeMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations>
          fighters) {
    this.fighters =
        fighters.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 5921;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(fighters.length);

    for (int i = 0; i < fighters.length; i++) {

      writer.write_ui16(fighters[i].getProtocolId());

      fighters[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int fighters_length = reader.read_ui16();
    this.fighters =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
            [fighters_length];

    for (int i = 0; i < fighters_length; i++) {

      int fighters_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
          fighters_it =
              (com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations)
                  InternalProtocolTypeManager.get(fighters_it_typeId);

      fighters_it.deserialize(reader);
      this.fighters[i] = fighters_it;
    }
  }

  @Override
  public String toString() {

    return "GameFightSynchronizeMessage("
        + "fighters="
        + java.util.Arrays.toString(this.fighters)
        + ')';
  }
}
