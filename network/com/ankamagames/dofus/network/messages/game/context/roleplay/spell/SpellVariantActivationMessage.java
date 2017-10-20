// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.spell;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpellVariantActivationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6705;
  // bool
  public boolean result;
  // vi16
  public short activatedSpellId;
  // vi16
  public short deactivatedSpellId;

  public SpellVariantActivationMessage() {}

  public SpellVariantActivationMessage(
      boolean result, short activatedSpellId, short deactivatedSpellId) {
    this.result = result;
    this.activatedSpellId = activatedSpellId;
    this.deactivatedSpellId = deactivatedSpellId;
  }

  @Override
  public int getProtocolId() {
    return 6705;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.result);
    writer.write_vi16(this.activatedSpellId);
    writer.write_vi16(this.deactivatedSpellId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.result = reader.read_bool();
    this.activatedSpellId = reader.read_vi16();
    this.deactivatedSpellId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "SpellVariantActivationMessage("
        + "result="
        + this.result
        + ", activatedSpellId="
        + this.activatedSpellId
        + ", deactivatedSpellId="
        + this.deactivatedSpellId
        + ')';
  }
}
