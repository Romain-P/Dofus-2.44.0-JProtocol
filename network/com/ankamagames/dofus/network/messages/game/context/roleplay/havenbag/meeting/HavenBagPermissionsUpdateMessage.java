// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagPermissionsUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6713;
  // i32
  public int permissions;

  public HavenBagPermissionsUpdateMessage()
  {}

  public HavenBagPermissionsUpdateMessage(int permissions)
  {
    this.permissions = permissions;
  }

  @Override
  public int getProtocolId()
  {
    return 6713;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.permissions);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.permissions = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "HavenBagPermissionsUpdateMessage(" + "permissions=" + this.permissions + ')';
  }
}
