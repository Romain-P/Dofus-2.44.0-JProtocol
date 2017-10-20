// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6413;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations[] guilds;

  public GuildListMessage() {}

  public GuildListMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations[] guilds) {
    this.guilds = guilds;
  }

  public GuildListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations>
          guilds) {
    this.guilds =
        guilds.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6413;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(guilds.length);

    for (int i = 0; i < guilds.length; i++) {

      guilds[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int guilds_length = reader.read_ui16();
    this.guilds =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
            [guilds_length];

    for (int i = 0; i < guilds_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guilds_it =
          new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();

      guilds_it.deserialize(reader);
      this.guilds[i] = guilds_it;
    }
  }

  @Override
  public String toString() {

    return "GuildListMessage(" + "guilds=" + java.util.Arrays.toString(this.guilds) + ')';
  }
}
