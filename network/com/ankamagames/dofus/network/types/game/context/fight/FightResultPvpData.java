// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultPvpData
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData {
  public static final int PROTOCOL_ID = 190;
  // ui8
  public short grade;
  // vi16
  public short minHonorForGrade;
  // vi16
  public short maxHonorForGrade;
  // vi16
  public short honor;
  // vi16
  public short honorDelta;

  public FightResultPvpData()
  {}

  public FightResultPvpData(
      short grade, short minHonorForGrade, short maxHonorForGrade, short honor, short honorDelta)
  {

    super();
    this.grade = grade;
    this.minHonorForGrade = minHonorForGrade;
    this.maxHonorForGrade = maxHonorForGrade;
    this.honor = honor;
    this.honorDelta = honorDelta;
  }

  @Override
  public int getProtocolId()
  {
    return 190;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui8(this.grade);
    writer.write_vi16(this.minHonorForGrade);
    writer.write_vi16(this.maxHonorForGrade);
    writer.write_vi16(this.honor);
    writer.write_vi16(this.honorDelta);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.grade = reader.read_ui8();
    this.minHonorForGrade = reader.read_vi16();
    this.maxHonorForGrade = reader.read_vi16();
    this.honor = reader.read_vi16();
    this.honorDelta = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "FightResultPvpData("
        + "grade="
        + this.grade
        + ", minHonorForGrade="
        + this.minHonorForGrade
        + ", maxHonorForGrade="
        + this.maxHonorForGrade
        + ", honor="
        + this.honor
        + ", honorDelta="
        + this.honorDelta
        + ')';
  }
}
