// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMemberLeavingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5923;
  // bool
  public boolean kicked;
  // vi64
  public long memberId;

  public GuildMemberLeavingMessage() {}

  public GuildMemberLeavingMessage(boolean kicked, long memberId) {
    this.kicked = kicked;
    this.memberId = memberId;
  }

  @Override
  public int getProtocolId() {
    return 5923;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.kicked);
    writer.write_vi64(this.memberId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.kicked = reader.read_bool();
    this.memberId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "GuildMemberLeavingMessage("
        + "kicked="
        + this.kicked
        + ", memberId="
        + this.memberId
        + ')';
  }
}
