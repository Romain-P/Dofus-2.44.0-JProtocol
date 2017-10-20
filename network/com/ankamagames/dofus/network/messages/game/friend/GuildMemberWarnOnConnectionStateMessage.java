// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMemberWarnOnConnectionStateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6160;
  // bool
  public boolean enable;

  public GuildMemberWarnOnConnectionStateMessage() {}

  public GuildMemberWarnOnConnectionStateMessage(boolean enable) {
    this.enable = enable;
  }

  @Override
  public int getProtocolId() {
    return 6160;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.enable);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.enable = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GuildMemberWarnOnConnectionStateMessage(" + "enable=" + this.enable + ')';
  }
}
