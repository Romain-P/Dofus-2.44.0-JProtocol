// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.handshake;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ProtocolRequired extends NetworkMessage {
  public static final int PROTOCOL_ID = 1;
  // i32
  public int requiredVersion;
  // i32
  public int currentVersion;

  public ProtocolRequired()
  {}

  public ProtocolRequired(int requiredVersion, int currentVersion)
  {
    this.requiredVersion = requiredVersion;
    this.currentVersion = currentVersion;
  }

  @Override
  public int getProtocolId()
  {
    return 1;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.requiredVersion);
    writer.write_i32(this.currentVersion);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.requiredVersion = reader.read_i32();
    this.currentVersion = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "ProtocolRequired("
        + "requiredVersion="
        + this.requiredVersion
        + ", currentVersion="
        + this.currentVersion
        + ')';
  }
}
