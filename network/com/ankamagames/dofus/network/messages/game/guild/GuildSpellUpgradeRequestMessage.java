// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildSpellUpgradeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5699;
  // i32
  public int spellId;

  public GuildSpellUpgradeRequestMessage() {}

  public GuildSpellUpgradeRequestMessage(int spellId) {
    this.spellId = spellId;
  }

  @Override
  public int getProtocolId() {
    return 5699;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.spellId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GuildSpellUpgradeRequestMessage(" + "spellId=" + this.spellId + ')';
  }
}
