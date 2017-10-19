// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMembershipMessage
    extends com.ankamagames.dofus.network.messages.game.guild.GuildJoinedMessage {
  public static final int PROTOCOL_ID = 5835;

  public GuildMembershipMessage()
  {}

  public GuildMembershipMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo,
      int memberRights)
  {

    super(guildInfo, memberRights);
  }

  @Override
  public int getProtocolId()
  {
    return 5835;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildMembershipMessage("
        + "guildInfo="
        + this.guildInfo
        + ", memberRights="
        + this.memberRights
        + ')';
  }
}
