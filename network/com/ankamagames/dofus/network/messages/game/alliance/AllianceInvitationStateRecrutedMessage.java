// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInvitationStateRecrutedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6392;
  // i8
  public byte invitationState;

  public AllianceInvitationStateRecrutedMessage()
  {}

  public AllianceInvitationStateRecrutedMessage(byte invitationState)
  {
    this.invitationState = invitationState;
  }

  @Override
  public int getProtocolId()
  {
    return 6392;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.invitationState);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.invitationState = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AllianceInvitationStateRecrutedMessage("
        + "invitationState="
        + this.invitationState
        + ')';
  }
}
