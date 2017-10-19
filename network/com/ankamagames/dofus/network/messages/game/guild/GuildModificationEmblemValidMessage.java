// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildModificationEmblemValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6328;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem;

  public GuildModificationEmblemValidMessage()
  {}

  public GuildModificationEmblemValidMessage(
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem)
  {
    this.guildEmblem = guildEmblem;
  }

  @Override
  public int getProtocolId()
  {
    return 6328;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.guildEmblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.guildEmblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.guildEmblem.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildModificationEmblemValidMessage(" + "guildEmblem=" + this.guildEmblem + ')';
  }
}
