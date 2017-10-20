// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.script;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class URLOpenMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6266;
  // i8
  public byte urlId;

  public URLOpenMessage() {}

  public URLOpenMessage(byte urlId) {
    this.urlId = urlId;
  }

  @Override
  public int getProtocolId() {
    return 6266;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.urlId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.urlId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "URLOpenMessage(" + "urlId=" + this.urlId + ')';
  }
}
