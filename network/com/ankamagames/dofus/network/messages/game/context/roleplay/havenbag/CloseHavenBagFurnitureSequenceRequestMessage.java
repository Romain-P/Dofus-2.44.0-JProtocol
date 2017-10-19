// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CloseHavenBagFurnitureSequenceRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6621;

  public CloseHavenBagFurnitureSequenceRequestMessage()
  {}

  public static final CloseHavenBagFurnitureSequenceRequestMessage i =
      new CloseHavenBagFurnitureSequenceRequestMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6621;
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

    return "CloseHavenBagFurnitureSequenceRequestMessage";
  }
}
