// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultFighterListEntry
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry {
  public static final int PROTOCOL_ID = 189;
  // f64
  public double id;
  // bool
  public boolean alive;

  public FightResultFighterListEntry() {}

  public FightResultFighterListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards,
      double id,
      boolean alive) {

    super(outcome, wave, rewards);
    this.id = id;
    this.alive = alive;
  }

  @Override
  public int getProtocolId() {
    return 189;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.id);
    writer.write_bool(this.alive);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.id = reader.read_f64();
    this.alive = reader.read_bool();
  }

  @Override
  public String toString() {

    return "FightResultFighterListEntry("
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
        + ')';
  }
}
