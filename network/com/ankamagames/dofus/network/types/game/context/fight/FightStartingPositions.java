// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightStartingPositions extends NetworkType {
  public static final int PROTOCOL_ID = 513;
  // array,vi16
  public short[] positionsForChallengers;
  // array,vi16
  public short[] positionsForDefenders;

  public FightStartingPositions()
  {}

  public FightStartingPositions(short[] positionsForChallengers, short[] positionsForDefenders)
  {
    this.positionsForChallengers = positionsForChallengers;
    this.positionsForDefenders = positionsForDefenders;
  }

  @Override
  public int getProtocolId()
  {
    return 513;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(positionsForChallengers.length);
    writer.write_array_vi16(this.positionsForChallengers);
    writer.write_ui16(positionsForDefenders.length);
    writer.write_array_vi16(this.positionsForDefenders);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int positionsForChallengers_length = reader.read_ui16();
    this.positionsForChallengers = reader.read_array_vi16(positionsForChallengers_length);

    int positionsForDefenders_length = reader.read_ui16();
    this.positionsForDefenders = reader.read_array_vi16(positionsForDefenders_length);
  }

  @Override
  public String toString()
  {

    return "FightStartingPositions("
        + "positionsForChallengers="
        + java.util.Arrays.toString(this.positionsForChallengers)
        + ", positionsForDefenders="
        + java.util.Arrays.toString(this.positionsForDefenders)
        + ')';
  }
}
