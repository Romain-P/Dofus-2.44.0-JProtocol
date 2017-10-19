// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFactsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6404;
  // vi32
  public int guildId;

  public GuildFactsRequestMessage()
  {}

  public GuildFactsRequestMessage(int guildId)
  {
    this.guildId = guildId;
  }

  @Override
  public int getProtocolId()
  {
    return 6404;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.guildId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.guildId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GuildFactsRequestMessage(" + "guildId=" + this.guildId + ')';
  }
}
