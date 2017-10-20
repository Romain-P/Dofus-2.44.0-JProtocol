// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildModificationValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6323;
  // str
  public java.lang.String guildName;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem;

  public GuildModificationValidMessage() {}

  public GuildModificationValidMessage(
      java.lang.String guildName,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem) {
    this.guildName = guildName;
    this.guildEmblem = guildEmblem;
  }

  @Override
  public int getProtocolId() {
    return 6323;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.guildName);
    this.guildEmblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guildName = reader.read_str();
    this.guildEmblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.guildEmblem.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GuildModificationValidMessage("
        + "guildName="
        + this.guildName
        + ", guildEmblem="
        + this.guildEmblem
        + ')';
  }
}
