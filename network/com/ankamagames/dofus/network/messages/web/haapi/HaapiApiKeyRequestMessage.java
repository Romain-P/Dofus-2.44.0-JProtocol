// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.haapi;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HaapiApiKeyRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6648;
  // i8
  public byte keyType;

  public HaapiApiKeyRequestMessage() {}

  public HaapiApiKeyRequestMessage(byte keyType) {
    this.keyType = keyType;
  }

  @Override
  public int getProtocolId() {
    return 6648;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.keyType);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.keyType = reader.read_i8();
  }

  @Override
  public String toString() {

    return "HaapiApiKeyRequestMessage(" + "keyType=" + this.keyType + ')';
  }
}
