// Created by Heat the 2017-10-20 01:53:25+02:00
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
  // vi64
  public long targetId;

  public GuildInvitationMessage() {}

  public GuildInvitationMessage(long targetId) {
    this.targetId = targetId;
  }

  @Override
  public int getProtocolId() {
    return 5551;
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

    return "GuildInvitationMessage(" + "targetId=" + this.targetId + ')';
  }
}
