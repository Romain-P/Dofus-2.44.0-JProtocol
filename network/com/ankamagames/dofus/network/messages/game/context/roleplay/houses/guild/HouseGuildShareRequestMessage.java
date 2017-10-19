// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseGuildShareRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5704;
  // vi32
  public int houseId;
  // i32
  public int instanceId;
  // bool
  public boolean enable;
  // vi32
  public int rights;

  public HouseGuildShareRequestMessage()
  {}

  public HouseGuildShareRequestMessage(int houseId, int instanceId, boolean enable, int rights)
  {
    this.houseId = houseId;
    this.instanceId = instanceId;
    this.enable = enable;
    this.rights = rights;
  }

  @Override
  public int getProtocolId()
  {
    return 5704;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.houseId);
    writer.write_i32(this.instanceId);
    writer.write_bool(this.enable);
    writer.write_vi32(this.rights);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.houseId = reader.read_vi32();
    this.instanceId = reader.read_i32();
    this.enable = reader.read_bool();
    this.rights = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "HouseGuildShareRequestMessage("
        + "houseId="
        + this.houseId
        + ", instanceId="
        + this.instanceId
        + ", enable="
        + this.enable
        + ", rights="
        + this.rights
        + ')';
  }
}
