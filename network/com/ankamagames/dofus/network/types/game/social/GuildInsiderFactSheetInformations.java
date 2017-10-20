// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInsiderFactSheetInformations
    extends com.ankamagames.dofus.network.types.game.social.GuildFactSheetInformations {
  public static final int PROTOCOL_ID = 423;
  // str
  public java.lang.String leaderName;
  // vi16
  public short nbConnectedMembers;
  // i8
  public byte nbTaxCollectors;
  // i32
  public int lastActivity;

  public GuildInsiderFactSheetInformations() {}

  public GuildInsiderFactSheetInformations(
      int guildId,
      java.lang.String guildName,
      short guildLevel,
      com.ankamagames.dofus.network.types.game.guild.GuildEmblem guildEmblem,
      long leaderId,
      short nbMembers,
      java.lang.String leaderName,
      short nbConnectedMembers,
      byte nbTaxCollectors,
      int lastActivity) {

    super(guildId, guildName, guildLevel, guildEmblem, leaderId, nbMembers);
    this.leaderName = leaderName;
    this.nbConnectedMembers = nbConnectedMembers;
    this.nbTaxCollectors = nbTaxCollectors;
    this.lastActivity = lastActivity;
  }

  @Override
  public int getProtocolId() {
    return 423;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.leaderName);
    writer.write_vi16(this.nbConnectedMembers);
    writer.write_i8(this.nbTaxCollectors);
    writer.write_i32(this.lastActivity);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.leaderName = reader.read_str();
    this.nbConnectedMembers = reader.read_vi16();
    this.nbTaxCollectors = reader.read_i8();
    this.lastActivity = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GuildInsiderFactSheetInformations("
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
        + ", leaderName="
        + this.leaderName
        + ", nbConnectedMembers="
        + this.nbConnectedMembers
        + ", nbTaxCollectors="
        + this.nbTaxCollectors
        + ", lastActivity="
        + this.lastActivity
        + ')';
  }
}
