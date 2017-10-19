// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TitlesAndOrnamentsListRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6363;

  public TitlesAndOrnamentsListRequestMessage()
  {}

  public static final TitlesAndOrnamentsListRequestMessage i =
      new TitlesAndOrnamentsListRequestMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6363;
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

    return "TitlesAndOrnamentsListRequestMessage";
  }
}
