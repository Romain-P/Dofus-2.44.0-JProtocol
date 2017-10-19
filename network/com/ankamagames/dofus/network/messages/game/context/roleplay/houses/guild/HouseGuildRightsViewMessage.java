// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildRightsViewMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5700;
  // vi32
  public int houseId;
  // i32
  public int instanceId;

  public HouseGuildRightsViewMessage()
  {}

  public HouseGuildRightsViewMessage(int houseId, int instanceId)
  {
    this.houseId = houseId;
    this.instanceId = instanceId;
  }

  @Override
  public int getProtocolId()
  {
    return 5700;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "HouseGuildRightsViewMessage("
        + "houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ')';
  }
}
