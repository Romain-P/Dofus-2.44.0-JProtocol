// Created by Heat the 2017-10-20 01:53:24+02:00
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
  // vi64
  public long id;

  public HouseKickRequestMessage() {}

  public HouseKickRequestMessage(long id) {
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 5698;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "HouseKickRequestMessage(" + "id=" + this.id + ')';
  }
}
