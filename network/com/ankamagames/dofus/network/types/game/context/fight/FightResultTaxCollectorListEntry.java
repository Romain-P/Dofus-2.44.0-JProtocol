// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightResultTaxCollectorListEntry
    extends com.ankamagames.dofus.network.types.game.context.fight.FightResultFighterListEntry {
  public static final int PROTOCOL_ID = 84;
  // ui8
  public short level;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo;
  // i32
  public int experienceForGuild;

  public FightResultTaxCollectorListEntry()
  {}

  public FightResultTaxCollectorListEntry(
      short outcome,
      byte wave,
      com.ankamagames.dofus.network.types.game.context.fight.FightLoot rewards,
      double id,
      boolean alive,
      short level,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo,
      int experienceForGuild)
  {

    super(outcome, wave, rewards, id, alive);
    this.level = level;
    this.guildInfo = guildInfo;
    this.experienceForGuild = experienceForGuild;
  }

  @Override
  public int getProtocolId()
  {
    return 84;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui8(this.level);
    this.guildInfo.serialize(writer);
    writer.write_i32(this.experienceForGuild);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.level = reader.read_ui8();
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations();
    this.guildInfo.deserialize(reader);
    this.experienceForGuild = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "FightResultTaxCollectorListEntry("
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
        + ", guildInfo="
        + this.guildInfo
        + ", experienceForGuild="
        + this.experienceForGuild
        + ')';
  }
}
