// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInformationsMembersMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5558;
  // array,com.ankamagames.dofus.network.types.game.guild.GuildMember
  public com.ankamagames.dofus.network.types.game.guild.GuildMember[] members;

  public GuildInformationsMembersMessage() {}

  public GuildInformationsMembersMessage(
      com.ankamagames.dofus.network.types.game.guild.GuildMember[] members) {
    this.members = members;
  }

  public GuildInformationsMembersMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.guild.GuildMember> members) {
    this.members =
        members.toArray(com.ankamagames.dofus.network.types.game.guild.GuildMember[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5558;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(members.length);

    for (int i = 0; i < members.length; i++) {

      members[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int members_length = reader.read_ui16();
    this.members = new com.ankamagames.dofus.network.types.game.guild.GuildMember[members_length];

    for (int i = 0; i < members_length; i++) {

      com.ankamagames.dofus.network.types.game.guild.GuildMember members_it =
          new com.ankamagames.dofus.network.types.game.guild.GuildMember();

      members_it.deserialize(reader);
      this.members[i] = members_it;
    }
  }

  @Override
  public String toString() {

    return "GuildInformationsMembersMessage("
        + "members="
        + java.util.Arrays.toString(this.members)
        + ')';
  }
}
