// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultPlayerListEntry
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultFighterListEntry {
  public static final int PROTOCOL_ID = 24;
  // ui8
  public short level;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData
  public com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData[]
      additional;

  public FightResultPlayerListEntry()
  {}

  public FightResultPlayerListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards,
      double id,
      boolean alive,
      short level,
      com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData[]
          additional)
  {

    super(outcome, wave, rewards, id, alive);
    this.level = level;
    this.additional = additional;
  }

  public FightResultPlayerListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards,
      double id,
      boolean alive,
      short level,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData>
          additional)
  {

    super(outcome, wave, rewards, id, alive);
    this.level = level;
    this.additional =
        additional.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 24;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui8(this.level);
    writer.write_ui16(additional.length);

    for (int i = 0; i < additional.length; i++)
  {

      writer.write_ui16(additional[i].getProtocolId());

      additional[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.level = reader.read_ui8();

    int additional_length = reader.read_ui16();
    this.additional =
        new com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData
            [additional_length];

    for (int i = 0; i < additional_length; i++)
  {

      int additional_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData
          additional_it =
              (com.ankamagames.dofus.network.types.game.context.fight.FightResultAdditionalData)
                  InternalProtocolTypeManager.get(additional_it_typeId);

      additional_it.deserialize(reader);
      this.additional[i] = additional_it;
    }
  }

  @Override
  public String toString()
  {

    return "FightResultPlayerListEntry("
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
        + ", additional="
        + java.util.Arrays.toString(this.additional)
        + ')';
  }
}
