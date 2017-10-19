// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildVersatileInfoListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6435;
  // array,com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations
  public com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations[] guilds;

  public GuildVersatileInfoListMessage()
  {}

  public GuildVersatileInfoListMessage(
      com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations[] guilds)
  {
    this.guilds = guilds;
  }

  public GuildVersatileInfoListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations>
          guilds)
  {
    this.guilds =
        guilds.toArray(
            com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6435;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(guilds.length);

    for (int i = 0; i < guilds.length; i++)
  {

      writer.write_ui16(guilds[i].getProtocolId());

      guilds[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int guilds_length = reader.read_ui16();
    this.guilds =
        new com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations
            [guilds_length];

    for (int i = 0; i < guilds_length; i++)
  {

      int guilds_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations guilds_it =
          (com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations)
              InternalProtocolTypeManager.get(guilds_it_typeId);

      guilds_it.deserialize(reader);
      this.guilds[i] = guilds_it;
    }
  }

  @Override
  public String toString()
  {

    return "GuildVersatileInfoListMessage("
        + "guilds="
        + java.util.Arrays.toString(this.guilds)
        + ')';
  }
}
