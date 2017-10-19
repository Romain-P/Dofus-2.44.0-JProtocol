// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFactSheetInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
  public static final int PROTOCOL_ID = 424;
  // ui64
  public java.math.BigInteger leaderId;
  // vi16
  public short nbMembers;

  public GuildFactSheetInformations()
  {}

  public GuildFactSheetInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem,
      java.math.BigInteger leaderId,
      short nbMembers)
  {

    super(guildId, guildName, guildLevel, guildEmblem);
    this.leaderId = leaderId;
    this.nbMembers = nbMembers;
  }

  @Override
  public int getProtocolId()
  {
    return 424;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.leaderId);
    writer.write_vi16(this.nbMembers);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.leaderId = reader.read_ui64();
    this.nbMembers = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "GuildFactSheetInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ", guildEmblem="
        + this.guildEmblem
        + ", leaderId="
        + this.leaderId
        + ", nbMembers="
        + this.nbMembers
        + ')';
  }
}
