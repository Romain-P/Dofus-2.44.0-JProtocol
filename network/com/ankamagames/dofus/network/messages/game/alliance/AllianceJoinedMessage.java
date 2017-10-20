// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceJoinedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6402;
  // com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
      allianceInfo;
  // bool
  public boolean enabled;
  // vi32
  public int leadingGuildId;

  public AllianceJoinedMessage() {}

  public AllianceJoinedMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations allianceInfo,
      boolean enabled,
      int leadingGuildId) {
    this.allianceInfo = allianceInfo;
    this.enabled = enabled;
    this.leadingGuildId = leadingGuildId;
  }

  @Override
  public int getProtocolId() {
    return 6402;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.allianceInfo.serialize(writer);
    writer.write_bool(this.enabled);
    writer.write_vi32(this.leadingGuildId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allianceInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations();
    this.allianceInfo.deserialize(reader);
    this.enabled = reader.read_bool();
    this.leadingGuildId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "AllianceJoinedMessage("
        + "allianceInfo="
        + this.allianceInfo
        + ", enabled="
        + this.enabled
        + ", leadingGuildId="
        + this.leadingGuildId
        + ')';
  }
}
