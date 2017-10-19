// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountInformationInPaddockRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5975;
  // vi32
  public int mapRideId;

  public MountInformationInPaddockRequestMessage()
  {}

  public MountInformationInPaddockRequestMessage(int mapRideId)
  {
    this.mapRideId = mapRideId;
  }

  @Override
  public int getProtocolId()
  {
    return 5975;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.mapRideId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.mapRideId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "MountInformationInPaddockRequestMessage(" + "mapRideId=" + this.mapRideId + ')';
  }
}
