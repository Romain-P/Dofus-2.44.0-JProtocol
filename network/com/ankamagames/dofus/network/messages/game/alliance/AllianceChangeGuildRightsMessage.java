// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceChangeGuildRightsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6426;
  // vi32
  public int guildId;
  // i8
  public byte rights;

  public AllianceChangeGuildRightsMessage() {}

  public AllianceChangeGuildRightsMessage(int guildId, byte rights) {
    this.guildId = guildId;
    this.rights = rights;
  }

  @Override
  public int getProtocolId() {
    return 6426;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.guildId);
    writer.write_i8(this.rights);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.guildId = reader.read_vi32();
    this.rights = reader.read_i8();
  }

  @Override
  public String toString() {

    return "AllianceChangeGuildRightsMessage("
        + "guildId="
        + this.guildId
        + ", rights="
        + this.rights
        + ')';
  }
}
