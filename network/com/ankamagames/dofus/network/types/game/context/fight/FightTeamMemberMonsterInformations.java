// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberMonsterInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations {
  public static final int PROTOCOL_ID = 6;
  // i32
  public int monsterId;
  // i8
  public byte grade;

  public FightTeamMemberMonsterInformations()
  {}

  public FightTeamMemberMonsterInformations(double id, int monsterId, byte grade)
  {

    super(id);
    this.monsterId = monsterId;
    this.grade = grade;
  }

  @Override
  public int getProtocolId()
  {
    return 6;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.monsterId);
    writer.write_i8(this.grade);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.monsterId = reader.read_i32();
    this.grade = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "FightTeamMemberMonsterInformations("
        + "id="
        + this.id
        + ", monsterId="
        + this.monsterId
        + ", grade="
        + this.grade
        + ')';
  }
}
