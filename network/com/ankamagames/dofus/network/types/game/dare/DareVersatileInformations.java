// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareVersatileInformations extends NetworkType {
  public static final int PROTOCOL_ID = 504;
  // f64
  public double dareId;
  // i32
  public int countEntrants;
  // i32
  public int countWinners;

  public DareVersatileInformations()
  {}

  public DareVersatileInformations(double dareId, int countEntrants, int countWinners)
  {
    this.dareId = dareId;
    this.countEntrants = countEntrants;
    this.countWinners = countWinners;
  }

  @Override
  public int getProtocolId()
  {
    return 504;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.dareId);
    writer.write_i32(this.countEntrants);
    writer.write_i32(this.countWinners);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dareId = reader.read_f64();
    this.countEntrants = reader.read_i32();
    this.countWinners = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "DareVersatileInformations("
        + "dareId="
        + this.dareId
        + ", countEntrants="
        + this.countEntrants
        + ", countWinners="
        + this.countWinners
        + ')';
  }
}
