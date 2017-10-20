// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightPlacementSwapPositionsErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6548;

  public GameFightPlacementSwapPositionsErrorMessage() {}

  public static final GameFightPlacementSwapPositionsErrorMessage i =
      new GameFightPlacementSwapPositionsErrorMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6548;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "GameFightPlacementSwapPositionsErrorMessage";
  }
}
