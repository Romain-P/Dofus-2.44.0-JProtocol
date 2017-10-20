// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildLevelUpMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6062;
  // ui8
  public short newLevel;

  public GuildLevelUpMessage() {}

  public GuildLevelUpMessage(short newLevel) {
    this.newLevel = newLevel;
  }

  @Override
  public int getProtocolId() {
    return 6062;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui8(this.newLevel);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.newLevel = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "GuildLevelUpMessage(" + "newLevel=" + this.newLevel + ')';
  }
}
