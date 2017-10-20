// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceGuildLeavingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6399;
  // bool
  public boolean kicked;
  // vi32
  public int guildId;

  public AllianceGuildLeavingMessage() {}

  public AllianceGuildLeavingMessage(boolean kicked, int guildId) {
    this.kicked = kicked;
    this.guildId = guildId;
  }

  @Override
  public int getProtocolId() {
    return 6399;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.kicked);
    writer.write_vi32(this.guildId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.kicked = reader.read_bool();
    this.guildId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "AllianceGuildLeavingMessage("
        + "kicked="
        + this.kicked
        + ", guildId="
        + this.guildId
        + ')';
  }
}
