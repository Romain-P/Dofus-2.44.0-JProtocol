// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellModifySuccessMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6654;
  // i32
  public int spellId;
  // i16
  public short spellLevel;

  public SpellModifySuccessMessage() {}

  public SpellModifySuccessMessage(int spellId, short spellLevel) {
    this.spellId = spellId;
    this.spellLevel = spellLevel;
  }

  @Override
  public int getProtocolId() {
    return 6654;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.spellId);
    writer.write_i16(this.spellLevel);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_i32();
    this.spellLevel = reader.read_i16();
  }

  @Override
  public String toString() {

    return "SpellModifySuccessMessage("
        + "spellId="
        + this.spellId
        + ", spellLevel="
        + this.spellLevel
        + ')';
  }
}
