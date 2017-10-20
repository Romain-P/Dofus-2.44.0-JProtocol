// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagPermissionsUpdateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6714;
  // i32
  public int permissions;

  public HavenBagPermissionsUpdateRequestMessage() {}

  public HavenBagPermissionsUpdateRequestMessage(int permissions) {
    this.permissions = permissions;
  }

  @Override
  public int getProtocolId() {
    return 6714;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.permissions);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.permissions = reader.read_i32();
  }

  @Override
  public String toString() {

    return "HavenBagPermissionsUpdateRequestMessage(" + "permissions=" + this.permissions + ')';
  }
}
