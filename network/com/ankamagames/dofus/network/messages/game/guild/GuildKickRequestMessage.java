// Created by Heat the 2017-10-20 01:53:25+02:00
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
  // vi64
  public long kickedId;

  public GuildKickRequestMessage() {}

  public GuildKickRequestMessage(long kickedId) {
    this.kickedId = kickedId;
  }

  @Override
  public int getProtocolId() {
    return 5887;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.kickedId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.kickedId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "GuildKickRequestMessage(" + "kickedId=" + this.kickedId + ')';
  }
}
