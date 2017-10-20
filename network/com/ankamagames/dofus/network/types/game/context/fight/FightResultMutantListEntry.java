// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultMutantListEntry
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultFighterListEntry {
  public static final int PROTOCOL_ID = 216;
  // vi16
  public short level;

  public FightResultMutantListEntry() {}

  public FightResultMutantListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards,
      double id,
      boolean alive,
      short level) {

    super(outcome, wave, rewards, id, alive);
    this.level = level;
  }

  @Override
  public int getProtocolId() {
    return 216;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.level);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.level = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "FightResultMutantListEntry("
        + "outcome="
        + this.outcome
        + ", wave="
        + this.wave
        + ", rewards="
        + this.rewards
        + ", id="
        + this.id
        + ", alive="
        + this.alive
        + ", level="
        + this.level
        + ')';
  }
}
