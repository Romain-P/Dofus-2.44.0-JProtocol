// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection.register;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NicknameRefusedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5638;
  // i8
  public byte reason;

  public NicknameRefusedMessage() {}

  public NicknameRefusedMessage(byte reason) {
    this.reason = reason;
  }

  @Override
  public int getProtocolId() {
    return 5638;
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

    return "NicknameRefusedMessage(" + "reason=" + this.reason + ')';
  }
}
