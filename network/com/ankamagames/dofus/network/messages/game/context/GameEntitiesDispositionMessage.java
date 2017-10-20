// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameEntitiesDispositionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5696;
  // array,com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
  public com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations[]
      dispositions;

  public GameEntitiesDispositionMessage() {}

  public GameEntitiesDispositionMessage(
      com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations[]
          dispositions) {
    this.dispositions = dispositions;
  }

  public GameEntitiesDispositionMessage(
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
    return 5696;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(dispositions.length);

    for (int i = 0; i < dispositions.length; i++) {

      dispositions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int dispositions_length = reader.read_ui16();
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

    return "GameEntitiesDispositionMessage("
        + "dispositions="
        + java.util.Arrays.toString(this.dispositions)
        + ')';
  }
}
