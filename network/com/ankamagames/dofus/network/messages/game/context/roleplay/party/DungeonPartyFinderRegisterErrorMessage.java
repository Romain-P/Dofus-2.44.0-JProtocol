// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderRegisterErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6243;

  public DungeonPartyFinderRegisterErrorMessage()
  {}

  public static final DungeonPartyFinderRegisterErrorMessage i =
      new DungeonPartyFinderRegisterErrorMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6243;
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

    return "DungeonPartyFinderRegisterErrorMessage";
  }
}
