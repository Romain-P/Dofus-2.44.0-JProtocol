// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInvitedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5552;
  // ui64
  public java.math.BigInteger recruterId;
  // str
  public java.lang.String recruterName;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo;

  public GuildInvitedMessage()
  {}

  public GuildInvitedMessage(
      java.math.BigInteger recruterId,
      java.lang.String recruterName,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo)
  {
    this.recruterId = recruterId;
    this.recruterName = recruterName;
    this.guildInfo = guildInfo;
  }

  @Override
  public int getProtocolId()
  {
    return 5552;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.recruterId);
    writer.write_str(this.recruterName);
    this.guildInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.recruterId = reader.read_ui64();
    this.recruterName = reader.read_str();
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guildInfo.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildInvitedMessage("
        + "recruterId="
        + this.recruterId
        + ", recruterName="
        + this.recruterName
        + ", guildInfo="
        + this.guildInfo
        + ')';
  }
}