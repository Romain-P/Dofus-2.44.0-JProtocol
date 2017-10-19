// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NamedPartyTeam extends NetworkType {
  public static final int PROTOCOL_ID = 469;
  // i8
  public byte teamId;
  // str
  public java.lang.String partyName;

  public NamedPartyTeam()
  {}

  public NamedPartyTeam(byte teamId, java.lang.String partyName)
  {
    this.teamId = teamId;
    this.partyName = partyName;
  }

  @Override
  public int getProtocolId()
  {
    return 469;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.teamId);
    writer.write_str(this.partyName);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.teamId = reader.read_i8();
    this.partyName = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "NamedPartyTeam(" + "teamId=" + this.teamId + ", partyName=" + this.partyName + ')';
  }
}
