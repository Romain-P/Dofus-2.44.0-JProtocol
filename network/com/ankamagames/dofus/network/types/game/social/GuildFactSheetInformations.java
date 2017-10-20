// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFactSheetInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations {
  public static final int PROTOCOL_ID = 424;
  // vi64
  public long leaderId;
  // vi16
  public short nbMembers;

  public GuildFactSheetInformations() {}

  public GuildFactSheetInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem,
      long leaderId,
      short nbMembers) {

    super(guildId, guildName, guildLevel, guildEmblem);
    this.leaderId = leaderId;
    this.nbMembers = nbMembers;
  }

  @Override
  public int getProtocolId() {
    return 424;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.leaderId);
    writer.write_vi16(this.nbMembers);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.leaderId = reader.read_vi64();
    this.nbMembers = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GuildFactSheetInformations("
        + "guildId="
        + this.guildId
        + ", guildName="
        + this.guildName
        + ", guildLevel="
        + this.guildLevel
        + ", guildEmblem="
        + this.guildEmblem
        + ", leaderId="
        + this.leaderId
        + ", nbMembers="
        + this.nbMembers
        + ')';
  }
}
