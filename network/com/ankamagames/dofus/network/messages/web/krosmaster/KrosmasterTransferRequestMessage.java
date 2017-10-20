// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterTransferRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6349;
  // str
  public java.lang.String uid;

  public KrosmasterTransferRequestMessage() {}

  public KrosmasterTransferRequestMessage(java.lang.String uid) {
    this.uid = uid;
  }

  @Override
  public int getProtocolId() {
    return 6349;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.uid);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.uid = reader.read_str();
  }

  @Override
  public String toString() {

    return "KrosmasterTransferRequestMessage(" + "uid=" + this.uid + ')';
  }
}
