// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ArenaRankInfos extends NetworkType {
  public static final int PROTOCOL_ID = 499;
  // vi16
  public short rank;
  // vi16
  public short bestRank;
  // vi16
  public short victoryCount;
  // vi16
  public short fightcount;

  public ArenaRankInfos()
  {}

  public ArenaRankInfos(short rank, short bestRank, short victoryCount, short fightcount)
  {
    this.rank = rank;
    this.bestRank = bestRank;
    this.victoryCount = victoryCount;
    this.fightcount = fightcount;
  }

  @Override
  public int getProtocolId()
  {
    return 499;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.rank);
    writer.write_vi16(this.bestRank);
    writer.write_vi16(this.victoryCount);
    writer.write_vi16(this.fightcount);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.rank = reader.read_vi16();
    this.bestRank = reader.read_vi16();
    this.victoryCount = reader.read_vi16();
    this.fightcount = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "ArenaRankInfos("
        + "rank="
        + this.rank
        + ", bestRank="
        + this.bestRank
        + ", victoryCount="
        + this.victoryCount
        + ", fightcount="
        + this.fightcount
        + ')';
  }
}
