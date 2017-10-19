// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInvitationStateRecruterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5563;
  // str
  public java.lang.String recrutedName;
  // i8
  public byte invitationState;

  public GuildInvitationStateRecruterMessage()
  {}

  public GuildInvitationStateRecruterMessage(java.lang.String recrutedName, byte invitationState)
  {
    this.recrutedName = recrutedName;
    this.invitationState = invitationState;
  }

  @Override
  public int getProtocolId()
  {
    return 5563;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.recrutedName);
    writer.write_i8(this.invitationState);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.recrutedName = reader.read_str();
    this.invitationState = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GuildInvitationStateRecruterMessage("
        + "recrutedName="
        + this.recrutedName
        + ", invitationState="
        + this.invitationState
        + ')';
  }
}
