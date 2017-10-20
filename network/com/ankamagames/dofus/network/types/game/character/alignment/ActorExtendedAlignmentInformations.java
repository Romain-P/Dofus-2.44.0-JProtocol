// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character.alignment;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ActorExtendedAlignmentInformations
    extends com.ankamagames.dofus.network.types.game.character.alignment
        .ActorAlignmentInformations {
  public static final int PROTOCOL_ID = 202;
  // vi16
  public short honor;
  // vi16
  public short honorGradeFloor;
  // vi16
  public short honorNextGradeFloor;
  // i8
  public byte aggressable;

  public ActorExtendedAlignmentInformations() {}

  public ActorExtendedAlignmentInformations(
      byte alignmentSide,
      byte alignmentValue,
      byte alignmentGrade,
      double characterPower,
      short honor,
      short honorGradeFloor,
      short honorNextGradeFloor,
      byte aggressable) {

    super(alignmentSide, alignmentValue, alignmentGrade, characterPower);
    this.honor = honor;
    this.honorGradeFloor = honorGradeFloor;
    this.honorNextGradeFloor = honorNextGradeFloor;
    this.aggressable = aggressable;
  }

  @Override
  public int getProtocolId() {
    return 202;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.honor);
    writer.write_vi16(this.honorGradeFloor);
    writer.write_vi16(this.honorNextGradeFloor);
    writer.write_i8(this.aggressable);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.honor = reader.read_vi16();
    this.honorGradeFloor = reader.read_vi16();
    this.honorNextGradeFloor = reader.read_vi16();
    this.aggressable = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ActorExtendedAlignmentInformations("
        + "alignmentSide="
        + this.alignmentSide
        + ", alignmentValue="
        + this.alignmentValue
        + ", alignmentGrade="
        + this.alignmentGrade
        + ", characterPower="
        + this.characterPower
        + ", honor="
        + this.honor
        + ", honorGradeFloor="
        + this.honorGradeFloor
        + ", honorNextGradeFloor="
        + this.honorNextGradeFloor
        + ", aggressable="
        + this.aggressable
        + ')';
  }
}
