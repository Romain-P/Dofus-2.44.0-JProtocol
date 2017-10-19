// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberCharacterInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations {
  public static final int PROTOCOL_ID = 13;
  // str
  public java.lang.String name;
  // ui8
  public short level;

  public FightTeamMemberCharacterInformations()
  {}

  public FightTeamMemberCharacterInformations(double id, java.lang.String name, short level)
  {

    super(id);
    this.name = name;
    this.level = level;
  }

  @Override
  public int getProtocolId()
  {
    return 13;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.name);
    writer.write_ui8(this.level);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.name = reader.read_str();
    this.level = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "FightTeamMemberCharacterInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ')';
  }
}
