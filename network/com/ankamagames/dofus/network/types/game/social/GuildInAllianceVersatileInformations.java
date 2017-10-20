// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInAllianceVersatileInformations
    extends com.ankamagames.dofus.network.types.game.social.GuildVersatileInformations {
  public static final int PROTOCOL_ID = 437;
  // vi32
  public int allianceId;

  public GuildInAllianceVersatileInformations() {}

  public GuildInAllianceVersatileInformations(
      int guildId, long leaderId, short guildLevel, short nbMembers, int allianceId) {

    super(guildId, leaderId, guildLevel, nbMembers);
    this.allianceId = allianceId;
  }

  @Override
  public int getProtocolId() {
    return 437;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.allianceId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allianceId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "GuildInAllianceVersatileInformations("
        + "guildId="
        + this.guildId
        + ", leaderId="
        + this.leaderId
        + ", guildLevel="
        + this.guildLevel
        + ", nbMembers="
        + this.nbMembers
        + ", allianceId="
        + this.allianceId
        + ')';
  }
}
