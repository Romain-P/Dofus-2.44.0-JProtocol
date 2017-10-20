// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceMembershipMessage
    extends com.ankamagames.dofus.network.messages.game.alliance.AllianceJoinedMessage {
  public static final int PROTOCOL_ID = 6390;

  public AllianceMembershipMessage() {}

  public AllianceMembershipMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations allianceInfo,
      boolean enabled,
      int leadingGuildId) {

    super(allianceInfo, enabled, leadingGuildId);
  }

  @Override
  public int getProtocolId() {
    return 6390;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AllianceMembershipMessage("
        + "allianceInfo="
        + this.allianceInfo
        + ", enabled="
        + this.enabled
        + ", leadingGuildId="
        + this.leadingGuildId
        + ')';
  }
}
