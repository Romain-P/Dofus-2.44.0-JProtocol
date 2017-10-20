// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntStepFight
    extends com.ankamagames
        .dofus
        .network
        .types
        .game
        .context
        .roleplay
        .treasureHunt
        .TreasureHuntStep {
  public static final int PROTOCOL_ID = 462;

  public TreasureHuntStepFight() {}

  @Override
  public int getProtocolId() {
    return 462;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "TreasureHuntStepFight(" + ')';
  }
}
