// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementPossiblePositionsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 703;
  // array,vi16
  public short[] positionsForChallengers;
  // array,vi16
  public short[] positionsForDefenders;
  // i8
  public byte teamNumber;

  public GameFightPlacementPossiblePositionsMessage() {}

  public GameFightPlacementPossiblePositionsMessage(
      short[] positionsForChallengers, short[] positionsForDefenders, byte teamNumber) {
    this.positionsForChallengers = positionsForChallengers;
    this.positionsForDefenders = positionsForDefenders;
    this.teamNumber = teamNumber;
  }

  @Override
  public int getProtocolId() {
    return 703;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(positionsForChallengers.length);
    writer.write_array_vi16(this.positionsForChallengers);
    writer.write_ui16(positionsForDefenders.length);
    writer.write_array_vi16(this.positionsForDefenders);
    writer.write_i8(this.teamNumber);
  }

  @Override
  public void deserialize(DataReader reader) {

    int positionsForChallengers_length = reader.read_ui16();
    this.positionsForChallengers = reader.read_array_vi16(positionsForChallengers_length);

    int positionsForDefenders_length = reader.read_ui16();
    this.positionsForDefenders = reader.read_array_vi16(positionsForDefenders_length);
    this.teamNumber = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameFightPlacementPossiblePositionsMessage("
        + "positionsForChallengers="
        + java.util.Arrays.toString(this.positionsForChallengers)
        + ", positionsForDefenders="
        + java.util.Arrays.toString(this.positionsForDefenders)
        + ", teamNumber="
        + this.teamNumber
        + ')';
  }
}
