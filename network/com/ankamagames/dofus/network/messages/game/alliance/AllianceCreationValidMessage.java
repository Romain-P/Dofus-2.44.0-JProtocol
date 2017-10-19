// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceCreationValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6393;
  // str
  public java.lang.String allianceName;
  // str
  public java.lang.String allianceTag;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem allianceEmblem;

  public AllianceCreationValidMessage()
  {}

  public AllianceCreationValidMessage(
      java.lang.String allianceName,
      java.lang.String allianceTag,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem allianceEmblem)
  {
    this.allianceName = allianceName;
    this.allianceTag = allianceTag;
    this.allianceEmblem = allianceEmblem;
  }

  @Override
  public int getProtocolId()
  {
    return 6393;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.allianceName);
    writer.write_str(this.allianceTag);
    this.allianceEmblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.allianceName = reader.read_str();
    this.allianceTag = reader.read_str();
    this.allianceEmblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.allianceEmblem.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "AllianceCreationValidMessage("
        + "allianceName="
        + this.allianceName
        + ", allianceTag="
        + this.allianceTag
        + ", allianceEmblem="
        + this.allianceEmblem
        + ')';
  }
}
