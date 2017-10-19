// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildKickRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5887;
  // ui64
  public java.math.BigInteger kickedId;

  public GuildKickRequestMessage()
  {}

  public GuildKickRequestMessage(java.math.BigInteger kickedId)
  {
    this.kickedId = kickedId;
  }

  @Override
  public int getProtocolId()
  {
    return 5887;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.kickedId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.kickedId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GuildKickRequestMessage(" + "kickedId=" + this.kickedId + ')';
  }
}
