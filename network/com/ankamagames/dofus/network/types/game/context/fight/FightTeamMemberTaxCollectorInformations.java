// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberTaxCollectorInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations {
  public static final int PROTOCOL_ID = 177;
  // vi16
  public short firstNameId;
  // vi16
  public short lastNameId;
  // ui8
  public short level;
  // vi32
  public int guildId;
  // f64
  public double uid;

  public FightTeamMemberTaxCollectorInformations()
  {}

  public FightTeamMemberTaxCollectorInformations(
      double id, short firstNameId, short lastNameId, short level, int guildId, double uid)
  {

    super(id);
    this.firstNameId = firstNameId;
    this.lastNameId = lastNameId;
    this.level = level;
    this.guildId = guildId;
    this.uid = uid;
  }

  @Override
  public int getProtocolId()
  {
    return 177;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi16(this.firstNameId);
    writer.write_vi16(this.lastNameId);
    writer.write_ui8(this.level);
    writer.write_vi32(this.guildId);
    writer.write_f64(this.uid);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.firstNameId = reader.read_vi16();
    this.lastNameId = reader.read_vi16();
    this.level = reader.read_ui8();
    this.guildId = reader.read_vi32();
    this.uid = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "FightTeamMemberTaxCollectorInformations("
        + "id="
        + this.id
        + ", firstNameId="
        + this.firstNameId
        + ", lastNameId="
        + this.lastNameId
        + ", level="
        + this.level
        + ", guildId="
        + this.guildId
        + ", uid="
        + this.uid
        + ')';
  }
}
