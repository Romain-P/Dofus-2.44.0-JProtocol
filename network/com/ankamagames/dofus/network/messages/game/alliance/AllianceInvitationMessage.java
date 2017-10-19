// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInvitationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6395;
  // ui64
  public java.math.BigInteger targetId;

  public AllianceInvitationMessage()
  {}

  public AllianceInvitationMessage(java.math.BigInteger targetId)
  {
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId()
  {
    return 6395;
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

    return "AllianceInvitationMessage(" + "targetId=" + this.targetId + ')';
  }
}
