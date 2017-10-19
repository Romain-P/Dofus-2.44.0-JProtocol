// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations {
  public static final int PROTOCOL_ID = 127;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem;

  public GuildInformations()
  {}

  public GuildInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem)
  {

    super(guildId, guildName, guildLevel);
    this.guildEmblem = guildEmblem;
  }

  @Override
  public int getProtocolId()
  {
    return 127;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.guildEmblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.guildEmblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.guildEmblem.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ", guildEmblem="
        + this.guildEmblem
        + ')';
  }
}
