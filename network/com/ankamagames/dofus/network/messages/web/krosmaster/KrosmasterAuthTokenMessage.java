// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterAuthTokenMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6351;
  // str
  public java.lang.String token;

  public KrosmasterAuthTokenMessage() {}

  public KrosmasterAuthTokenMessage(java.lang.String token) {
    this.token = token;
  }

  @Override
  public int getProtocolId() {
    return 6351;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.token);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.token = reader.read_str();
  }

  @Override
  public String toString() {

    return "KrosmasterAuthTokenMessage(" + "token=" + this.token + ')';
  }
}
