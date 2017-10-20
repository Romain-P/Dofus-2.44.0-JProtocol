// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MigratedServerListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6731;
  // array,vi16
  public short[] migratedServerIds;

  public MigratedServerListMessage() {}

  public MigratedServerListMessage(short[] migratedServerIds) {
    this.migratedServerIds = migratedServerIds;
  }

  @Override
  public int getProtocolId() {
    return 6731;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(migratedServerIds.length);
    writer.write_array_vi16(this.migratedServerIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    int migratedServerIds_length = reader.read_ui16();
    this.migratedServerIds = reader.read_array_vi16(migratedServerIds_length);
  }

  @Override
  public String toString() {

    return "MigratedServerListMessage("
        + "migratedServerIds="
        + java.util.Arrays.toString(this.migratedServerIds)
        + ')';
  }
}
