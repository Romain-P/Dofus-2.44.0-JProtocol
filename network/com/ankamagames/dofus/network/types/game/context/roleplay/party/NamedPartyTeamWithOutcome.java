// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NamedPartyTeamWithOutcome extends NetworkType {
  public static final int PROTOCOL_ID = 470;
  // com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam team;
  // vi16
  public short outcome;

  public NamedPartyTeamWithOutcome()
  {}

  public NamedPartyTeamWithOutcome(
      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam team,
      short outcome)
  {
    this.team = team;
    this.outcome = outcome;
  }

  @Override
  public int getProtocolId()
  {
    return 470;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.team.serialize(writer);
    writer.write_vi16(this.outcome);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.team =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam();
    this.team.deserialize(reader);
    this.outcome = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "NamedPartyTeamWithOutcome(" + "team=" + this.team + ", outcome=" + this.outcome + ')';
  }
}
