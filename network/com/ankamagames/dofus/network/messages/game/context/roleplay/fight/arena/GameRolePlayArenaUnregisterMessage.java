// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayArenaUnregisterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6282;

  public GameRolePlayArenaUnregisterMessage()
  {}

  public static final GameRolePlayArenaUnregisterMessage i =
      new GameRolePlayArenaUnregisterMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6282;
  }

  @Override
  public void serialize(DataWriter writer)
  {}

  @Override
  public void deserialize(DataReader reader)
  {}

  @Override
  public String toString()
  {

    return "GameRolePlayArenaUnregisterMessage";
  }
}
