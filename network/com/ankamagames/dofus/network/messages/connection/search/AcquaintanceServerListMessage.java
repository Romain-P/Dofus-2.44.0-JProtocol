// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection.search;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AcquaintanceServerListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6142;
  // array,vi16
  public short[] servers;

  public AcquaintanceServerListMessage() {}

  public AcquaintanceServerListMessage(short[] servers) {
    this.servers = servers;
  }

  @Override
  public int getProtocolId() {
    return 6142;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(servers.length);
    writer.write_array_vi16(this.servers);
  }

  @Override
  public void deserialize(DataReader reader) {

    int servers_length = reader.read_ui16();
    this.servers = reader.read_array_vi16(servers_length);
  }

  @Override
  public String toString() {

    return "AcquaintanceServerListMessage("
        + "servers="
        + java.util.Arrays.toString(this.servers)
        + ')';
  }
}
