// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInvitationByNameMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6115;
  // str
  public java.lang.String name;

  public GuildInvitationByNameMessage()
  {}

  public GuildInvitationByNameMessage(java.lang.String name)
  {
    this.name = name;
  }

  @Override
  public int getProtocolId()
  {
    return 6115;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.name = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "GuildInvitationByNameMessage(" + "name=" + this.name + ')';
  }
}
