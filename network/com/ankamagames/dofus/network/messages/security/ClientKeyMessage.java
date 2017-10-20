// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.security;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ClientKeyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5607;
  // str
  public java.lang.String key;

  public ClientKeyMessage() {}

  public ClientKeyMessage(java.lang.String key) {
    this.key = key;
  }

  @Override
  public int getProtocolId() {
    return 5607;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.key);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.key = reader.read_str();
  }

  @Override
  public String toString() {

    return "ClientKeyMessage(" + "key=" + this.key + ')';
  }
}
