// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChangeMapMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 221;
  // f64
  public double mapId;

  public ChangeMapMessage()
  {}

  public ChangeMapMessage(double mapId)
  {
    this.mapId = mapId;
  }

  @Override
  public int getProtocolId()
  {
    return 221;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.mapId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.mapId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "ChangeMapMessage(" + "mapId=" + this.mapId + ')';
  }
}
