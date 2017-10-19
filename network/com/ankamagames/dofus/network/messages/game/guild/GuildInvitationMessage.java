// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInvitationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5551;
  // ui64
  public java.math.BigInteger targetId;

  public GuildInvitationMessage()
  {}

  public GuildInvitationMessage(java.math.BigInteger targetId)
  {
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 5551;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.targetId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GuildInvitationMessage(" + "targetId=" + this.targetId + ')';
  }
}
