// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInAllianceInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
  public static final int PROTOCOL_ID = 420;
  // ui8
  public short nbMembers;

  public GuildInAllianceInformations() {}

  public GuildInAllianceInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem,
      short nbMembers) {

    super(guildId, guildName, guildLevel, guildEmblem);
    this.nbMembers = nbMembers;
  }

  @Override
  public int getProtocolId() {
    return 420;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui8(this.nbMembers);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.nbMembers = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "GuildInAllianceInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ", guildEmblem="
        + this.guildEmblem
        + ", nbMembers="
        + this.nbMembers
        + ')';
  }
}
