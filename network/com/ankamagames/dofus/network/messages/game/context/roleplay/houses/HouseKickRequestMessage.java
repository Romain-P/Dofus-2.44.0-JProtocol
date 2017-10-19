// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseKickRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5698;
  // ui64
  public java.math.BigInteger id;

  public HouseKickRequestMessage()
  {}

  public HouseKickRequestMessage(java.math.BigInteger id)
  {
    this.id = id;
  }

  @Override
  public int getProtocolId()
  {
    return 5698;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.id);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.id = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "HouseKickRequestMessage(" + "id=" + this.id + ')';
  }
}
