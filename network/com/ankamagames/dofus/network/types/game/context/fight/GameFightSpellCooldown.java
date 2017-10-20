// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightSpellCooldown extends NetworkType {
  public static final int PROTOCOL_ID = 205;
  // i32
  public int spellId;
  // i8
  public byte cooldown;

  public GameFightSpellCooldown() {}

  public GameFightSpellCooldown(int spellId, byte cooldown) {
    this.spellId = spellId;
    this.cooldown = cooldown;
  }

  @Override
  public int getProtocolId() {
    return 205;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.spellId);
    writer.write_i8(this.cooldown);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_i32();
    this.cooldown = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameFightSpellCooldown("
        + "spellId="
        + this.spellId
        + ", cooldown="
        + this.cooldown
        + ')';
  }
}
