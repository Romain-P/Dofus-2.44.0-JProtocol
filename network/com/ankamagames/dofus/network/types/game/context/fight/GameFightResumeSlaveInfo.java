// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightResumeSlaveInfo extends NetworkType {
  public static final int PROTOCOL_ID = 364;
  // f64
  public double slaveId;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]
      spellCooldowns;
  // i8
  public byte summonCount;
  // i8
  public byte bombCount;

  public GameFightResumeSlaveInfo() {}

  public GameFightResumeSlaveInfo(
      double slaveId,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]
          spellCooldowns,
      byte summonCount,
      byte bombCount) {
    this.slaveId = slaveId;
    this.spellCooldowns = spellCooldowns;
    this.summonCount = summonCount;
    this.bombCount = bombCount;
  }

  public GameFightResumeSlaveInfo(
      double slaveId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown>
          spellCooldowns,
      byte summonCount,
      byte bombCount) {
    this.slaveId = slaveId;
    this.spellCooldowns =
        spellCooldowns.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]::new);
    this.summonCount = summonCount;
    this.bombCount = bombCount;
  }

  @Override
  public int getProtocolId() {
    return 364;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.slaveId);
    writer.write_ui16(spellCooldowns.length);

    for (int i = 0; i < spellCooldowns.length; i++) {

      spellCooldowns[i].serialize(writer);
    }
    writer.write_i8(this.summonCount);
    writer.write_i8(this.bombCount);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.slaveId = reader.read_f64();

    int spellCooldowns_length = reader.read_ui16();
    this.spellCooldowns =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
            [spellCooldowns_length];

    for (int i = 0; i < spellCooldowns_length; i++) {

      com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
          spellCooldowns_it =
              new com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown();

      spellCooldowns_it.deserialize(reader);
      this.spellCooldowns[i] = spellCooldowns_it;
    }
    this.summonCount = reader.read_i8();
    this.bombCount = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameFightResumeSlaveInfo("
        + "slaveId="
        + this.slaveId
        + ", spellCooldowns="
        + java.util.Arrays.toString(this.spellCooldowns)
        + ", summonCount="
        + this.summonCount
        + ", bombCount="
        + this.bombCount
        + ')';
  }
}
