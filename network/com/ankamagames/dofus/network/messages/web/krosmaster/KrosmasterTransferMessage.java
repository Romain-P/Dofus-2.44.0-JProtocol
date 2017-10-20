// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterTransferMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6348;
  // str
  public java.lang.String uid;
  // i8
  public byte failure;

  public KrosmasterTransferMessage() {}

  public KrosmasterTransferMessage(java.lang.String uid, byte failure) {
    this.uid = uid;
    this.failure = failure;
  }

  @Override
  public int getProtocolId() {
    return 6348;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.uid);
    writer.write_i8(this.failure);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.uid = reader.read_str();
    this.failure = reader.read_i8();
  }

  @Override
  public String toString() {

    return "KrosmasterTransferMessage(" + "uid=" + this.uid + ", failure=" + this.failure + ')';
  }
}
