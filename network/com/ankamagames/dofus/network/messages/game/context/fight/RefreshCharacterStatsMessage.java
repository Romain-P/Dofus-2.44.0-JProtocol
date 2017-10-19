// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class RefreshCharacterStatsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6699;
  // f64
  public double fighterId;
  // com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats;

  public RefreshCharacterStatsMessage()
  {}

  public RefreshCharacterStatsMessage(
      double fighterId,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats)
  {
    this.fighterId = fighterId;
    this.stats = stats;
  }

  @Override
  public int getProtocolId()
  {
    return 6699;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.fighterId);
    this.stats.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fighterId = reader.read_f64();
    this.stats = new com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats();
    this.stats.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "RefreshCharacterStatsMessage("
        + "fighterId="
        + this.fighterId
        + ", stats="
        + this.stats
        + ')';
  }
}
