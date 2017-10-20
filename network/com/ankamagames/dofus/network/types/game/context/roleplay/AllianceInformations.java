// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .BasicNamedAllianceInformations {
  public static final int PROTOCOL_ID = 417;
  // com.ankamagames.dofus.network.types.game.guild.GuildEmblem
  public com.ankamagames.dofus.network.types.game.guild.GuildEmblem allianceEmblem;

  public AllianceInformations() {}

  public AllianceInformations(
      int allianceId,
      java.lang.String allianceTag,
      java.lang.String allianceName,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem allianceEmblem) {

    super(allianceId, allianceTag, allianceName);
    this.allianceEmblem = allianceEmblem;
  }

  @Override
  public int getProtocolId() {
    return 417;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.allianceEmblem.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allianceEmblem = new com.ankamagames.dofus.network.types.game.guild.GuildEmblem();
    this.allianceEmblem.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AllianceInformations("
        + "allianceId="
        + this.allianceId
        + ", allianceTag="
        + this.allianceTag
        + ", allianceName="
        + this.allianceName
        + ", allianceEmblem="
        + this.allianceEmblem
        + ')';
  }
}
