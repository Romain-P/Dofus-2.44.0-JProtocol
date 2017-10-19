// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LifePointsRegenEndMessage
    extends com.ankamagames.dofus.network.messages.game.character.stats.UpdateLifePointsMessage {
  public static final int PROTOCOL_ID = 5686;
  // vi32
  public int lifePointsGained;

  public LifePointsRegenEndMessage()
  {}

  public LifePointsRegenEndMessage(int lifePoints, int maxLifePoints, int lifePointsGained)
  {

    super(lifePoints, maxLifePoints);
    this.lifePointsGained = lifePointsGained;
  }

  @Override
  public int getProtocolId()
  {
    return 5686;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.lifePointsGained);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.lifePointsGained = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "LifePointsRegenEndMessage("
        + "lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", lifePointsGained="
        + this.lifePointsGained
        + ')';
  }
}
