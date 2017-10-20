// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceModificationValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6450;
  // str
  public java.lang.String allianceName;
  // str
  public java.lang.String allianceTag;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem Alliancemblem;

  public AllianceModificationValidMessage() {}

  public AllianceModificationValidMessage(
      java.lang.String allianceName,
      java.lang.String allianceTag,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem Alliancemblem) {
    this.allianceName = allianceName;
    this.allianceTag = allianceTag;
    this.Alliancemblem = Alliancemblem;
  }

  @Override
  public int getProtocolId() {
    return 6450;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.allianceName);
    writer.write_str(this.allianceTag);
    this.Alliancemblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allianceName = reader.read_str();
    this.allianceTag = reader.read_str();
    this.Alliancemblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.Alliancemblem.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AllianceModificationValidMessage("
        + "allianceName="
        + this.allianceName
        + ", allianceTag="
        + this.allianceTag
        + ", Alliancemblem="
        + this.Alliancemblem
        + ')';
  }
}
