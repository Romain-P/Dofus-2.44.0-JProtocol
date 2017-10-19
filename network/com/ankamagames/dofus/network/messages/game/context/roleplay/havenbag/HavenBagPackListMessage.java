// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagPackListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6620;
  // array,i8
  public byte[] packIds;

  public HavenBagPackListMessage()
  {}

  public HavenBagPackListMessage(byte[] packIds)
  {
    this.packIds = packIds;
  }

  @Override
  public int getProtocolId()
  {
    return 6620;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(packIds.length);
    writer.write_array_i8(this.packIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int packIds_length = reader.read_ui16();
    this.packIds = reader.read_array_i8(packIds_length);
  }

  @Override
  public String toString()
  {

    return "HavenBagPackListMessage(" + "packIds=" + +this.packIds.length + "b" + ')';
  }
}
