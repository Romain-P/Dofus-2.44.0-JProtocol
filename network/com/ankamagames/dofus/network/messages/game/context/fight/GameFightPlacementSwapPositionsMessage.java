// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6544;
  // array,com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations,2
  public com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations[]
      dispositions;

  public GameFightPlacementSwapPositionsMessage() {}

  public GameFightPlacementSwapPositionsMessage(
      com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations[]
          dispositions) {
    this.dispositions = dispositions;
  }

  public GameFightPlacementSwapPositionsMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context
                  .IdentifiedEntityDispositionInformations>
          dispositions) {
    this.dispositions =
        dispositions.toArray(
            com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6544;
  }

  @Override
  public void serialize(DataWriter writer) {

    for (int i = 0; i < 2; i++) {

      dispositions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int dispositions_length = 2;
    this.dispositions =
        new com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
            [dispositions_length];

    for (int i = 0; i < dispositions_length; i++) {

      com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
          dispositions_it =
              new com.ankamagames.dofus.network.types.game.context
                  .IdentifiedEntityDispositionInformations();

      dispositions_it.deserialize(reader);
      this.dispositions[i] = dispositions_it;
    }
  }

  @Override
  public String toString() {

    return "GameFightPlacementSwapPositionsMessage("
        + "dispositions="
        + java.util.Arrays.toString(this.dispositions)
        + ')';
  }
}
