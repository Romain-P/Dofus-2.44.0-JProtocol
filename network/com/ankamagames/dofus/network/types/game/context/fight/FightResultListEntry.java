// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultListEntry extends NetworkType {
  public static final int PROTOCOL_ID = 16;
  // vi16
  public short outcome;
  // i8
  public byte wave;
  // com.ankamagames.dofus.network.types.game.context.fight.FightLoot
  public com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards;

  public FightResultListEntry()
  {}

  public FightResultListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards)
  {
    this.outcome = outcome;
    this.wave = wave;
    this.rewards = rewards;
  }

  @Override
  public int getProtocolId()
  {
    return 16;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.outcome);
    writer.write_i8(this.wave);
    this.rewards.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.outcome = reader.read_vi16();
    this.wave = reader.read_i8();
    this.rewards = new com.ankamagames.dofus.network.types.game.context.fight.FightLoot();
    this.rewards.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "FightResultListEntry("
        + "outcome="
        + this.outcome
        + ", wave="
        + this.wave
        + ", rewards="
        + this.rewards
        + ')';
  }
}
