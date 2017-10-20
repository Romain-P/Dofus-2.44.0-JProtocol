// Created by Heat the 2017-10-20 01:53:23+02:00
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
  // vi64
  public long targetId;

  public AllianceInvitationMessage() {}

  public AllianceInvitationMessage(long targetId) {
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId() {
    return 6395;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.targetId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.targetId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "AllianceInvitationMessage(" + "targetId=" + this.targetId + ')';
  }
}
