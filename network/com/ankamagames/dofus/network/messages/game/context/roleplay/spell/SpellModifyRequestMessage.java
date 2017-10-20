// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellModifyRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6655;
  // vi16
  public short spellId;
  // i16
  public short spellLevel;

  public SpellModifyRequestMessage() {}

  public SpellModifyRequestMessage(short spellId, short spellLevel) {
    this.spellId = spellId;
    this.spellLevel = spellLevel;
  }

  @Override
  public int getProtocolId() {
    return 6655;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.spellId);
    writer.write_i16(this.spellLevel);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_vi16();
    this.spellLevel = reader.read_i16();
  }

  @Override
  public String toString() {

    return "SpellModifyRequestMessage("
        + "spellId="
        + this.spellId
        + ", spellLevel="
        + this.spellLevel
        + ')';
  }
}
