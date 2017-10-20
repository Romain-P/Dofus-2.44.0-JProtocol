// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInformationsMemberUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5597;
  // com.ankamagames.dofus.network.types.game.guild.GuildMember
  public com.ankamagames.dofus.network.types.game.guild.GuildMember member;

  public GuildInformationsMemberUpdateMessage() {}

  public GuildInformationsMemberUpdateMessage(
      com.ankamagames.dofus.network.types.game.guild.GuildMember member) {
    this.member = member;
  }

  @Override
  public int getProtocolId() {
    return 5597;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.member.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.member = new com.ankamagames.dofus.network.types.game.guild.GuildMember();
    this.member.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GuildInformationsMemberUpdateMessage(" + "member=" + this.member + ')';
  }
}
