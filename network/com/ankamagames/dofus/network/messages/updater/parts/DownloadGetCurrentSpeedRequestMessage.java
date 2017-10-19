// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DownloadGetCurrentSpeedRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1510;

  public DownloadGetCurrentSpeedRequestMessage()
  {}

  public static final DownloadGetCurrentSpeedRequestMessage i =
      new DownloadGetCurrentSpeedRequestMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 1510;
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

    return "DownloadGetCurrentSpeedRequestMessage";
  }
}
