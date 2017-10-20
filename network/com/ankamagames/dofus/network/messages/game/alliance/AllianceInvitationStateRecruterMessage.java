// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInvitationStateRecruterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6396;
  // str
  public java.lang.String recrutedName;
  // i8
  public byte invitationState;

  public AllianceInvitationStateRecruterMessage() {}

  public AllianceInvitationStateRecruterMessage(
      java.lang.String recrutedName, byte invitationState) {
    this.recrutedName = recrutedName;
    this.invitationState = invitationState;
  }

  @Override
  public int getProtocolId() {
    return 6396;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.recrutedName);
    writer.write_i8(this.invitationState);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.recrutedName = reader.read_str();
    this.invitationState = reader.read_i8();
  }

  @Override
  public String toString() {

    return "AllianceInvitationStateRecruterMessage("
        + "recrutedName="
        + this.recrutedName
        + ", invitationState="
        + this.invitationState
        + ')';
  }
}
