// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.challenge;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChallengeTargetsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5613;
  // array,f64
  public double[] targetIds;
  // array,i16
  public short[] targetCells;

  public ChallengeTargetsListMessage()
  {}

  public ChallengeTargetsListMessage(double[] targetIds, short[] targetCells)
  {
    this.targetIds = targetIds;
    this.targetCells = targetCells;
  }

  @Override
  public int getProtocolId()
  {
    return 5613;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(targetIds.length);
    writer.write_array_f64(this.targetIds);
    writer.write_ui16(targetCells.length);
    writer.write_array_i16(this.targetCells);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int targetIds_length = reader.read_ui16();
    this.targetIds = reader.read_array_f64(targetIds_length);

    int targetCells_length = reader.read_ui16();
    this.targetCells = reader.read_array_i16(targetCells_length);
  }

  @Override
  public String toString()
  {

    return "ChallengeTargetsListMessage("
        + "targetIds="
        + java.util.Arrays.toString(this.targetIds)
        + ", targetCells="
        + java.util.Arrays.toString(this.targetCells)
        + ')';
  }
}
