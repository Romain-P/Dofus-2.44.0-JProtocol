// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.finishmoves;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FinishMoveListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6704;
  // array,com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations
  public com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations[] finishMoves;

  public FinishMoveListMessage() {}

  public FinishMoveListMessage(
      com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations[] finishMoves) {
    this.finishMoves = finishMoves;
  }

  public FinishMoveListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations>
          finishMoves) {
    this.finishMoves =
        finishMoves.toArray(
            com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6704;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(finishMoves.length);

    for (int i = 0; i < finishMoves.length; i++) {

      finishMoves[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int finishMoves_length = reader.read_ui16();
    this.finishMoves =
        new com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations
            [finishMoves_length];

    for (int i = 0; i < finishMoves_length; i++) {

      com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations finishMoves_it =
          new com.ankamagames.dofus.network.types.game.finishmoves.FinishMoveInformations();

      finishMoves_it.deserialize(reader);
      this.finishMoves[i] = finishMoves_it;
    }
  }

  @Override
  public String toString() {

    return "FinishMoveListMessage("
        + "finishMoves="
        + java.util.Arrays.toString(this.finishMoves)
        + ')';
  }
}
