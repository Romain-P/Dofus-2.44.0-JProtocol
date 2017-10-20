// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlliancedGuildFactSheetInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
  public static final int PROTOCOL_ID = 422;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
      allianceInfos;

  public AlliancedGuildFactSheetInformations() {}

  public AlliancedGuildFactSheetInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
          allianceInfos) {

    super(guildId, guildName, guildLevel, guildEmblem);
    this.allianceInfos = allianceInfos;
  }

  @Override
  public int getProtocolId() {
    return 422;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.allianceInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allianceInfos =
        new com.ankamagames.dofus.network.types.game.context.roleplay
            .BasicNamedAllianceInformations();
    this.allianceInfos.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AlliancedGuildFactSheetInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ", guildEmblem="
        + this.guildEmblem
        + ", allianceInfos="
        + this.allianceInfos
        + ')';
  }
}
