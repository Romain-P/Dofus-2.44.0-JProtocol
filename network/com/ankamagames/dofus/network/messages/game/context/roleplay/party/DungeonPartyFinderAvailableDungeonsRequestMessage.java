// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DungeonPartyFinderAvailableDungeonsRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6240;

  public DungeonPartyFinderAvailableDungeonsRequestMessage()
  {}

  public static final DungeonPartyFinderAvailableDungeonsRequestMessage i =
      new DungeonPartyFinderAvailableDungeonsRequestMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6240;
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

    return "DungeonPartyFinderAvailableDungeonsRequestMessage";
  }
}
