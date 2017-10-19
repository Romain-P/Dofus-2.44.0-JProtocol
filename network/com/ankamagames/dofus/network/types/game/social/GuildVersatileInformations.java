// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildVersatileInformations extends NetworkType {
  public static final int PROTOCOL_ID = 435;
  // vi32
  public int guildId;
  // ui64
  public java.math.BigInteger leaderId;
  // ui8
  public short guildLevel;
  // ui8
  public short nbMembers;

  public GuildVersatileInformations()
  {}

  public GuildVersatileInformations(
      int guildId, java.math.BigInteger leaderId, short guildLevel, short nbMembers)
  {
    this.guildId = guildId;
    this.leaderId = leaderId;
    this.guildLevel = guildLevel;
    this.nbMembers = nbMembers;
  }

  @Override
  public int getProtocolId()
  {
    return 435;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.guildId);
    writer.write_ui64(this.leaderId);
    writer.write_ui8(this.guildLevel);
    writer.write_ui8(this.nbMembers);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.guildId = reader.read_vi32();
    this.leaderId = reader.read_ui64();
    this.guildLevel = reader.read_ui8();
    this.nbMembers = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "GuildVersatileInformations("
        + "guildId="
        + this.guildId
        + ", leaderId="
        + this.leaderId
        + ", guildLevel="
        + this.guildLevel
        + ", nbMembers="
        + this.nbMembers
        + ')';
  }
}
