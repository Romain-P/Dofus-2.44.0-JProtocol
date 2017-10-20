// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellItemBoostMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6011;
  // vi32
  public int statId;
  // vi16
  public short spellId;
  // vi16
  public short value;

  public SpellItemBoostMessage() {}

  public SpellItemBoostMessage(int statId, short spellId, short value) {
    this.statId = statId;
    this.spellId = spellId;
    this.value = value;
  }

  @Override
  public int getProtocolId() {
    return 6011;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.statId);
    writer.write_vi16(this.spellId);
    writer.write_vi16(this.value);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.statId = reader.read_vi32();
    this.spellId = reader.read_vi16();
    this.value = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "SpellItemBoostMessage("
        + "statId="
        + this.statId
        + ", spellId="
        + this.spellId
        + ", value="
        + this.value
        + ')';
  }
}
