// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class OrnamentSelectErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6370;
  // i8
  public byte reason;

  public OrnamentSelectErrorMessage() {}

  public OrnamentSelectErrorMessage(byte reason) {
    this.reason = reason;
  }

  @Override
  public int getProtocolId() {
    return 6370;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.reason = reader.read_i8();
  }

  @Override
  public String toString() {

    return "OrnamentSelectErrorMessage(" + "reason=" + this.reason + ')';
  }
}
