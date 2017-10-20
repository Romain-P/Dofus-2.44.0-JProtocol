// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildModificationNameValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6327;
  // str
  public java.lang.String guildName;

  public GuildModificationNameValidMessage() {}

  public GuildModificationNameValidMessage(java.lang.String guildName) {
    this.guildName = guildName;
  }

  @Override
  public int getProtocolId() {
    return 6327;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.guildName);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guildName = reader.read_str();
  }

  @Override
  public String toString() {

    return "GuildModificationNameValidMessage(" + "guildName=" + this.guildName + ')';
  }
}
