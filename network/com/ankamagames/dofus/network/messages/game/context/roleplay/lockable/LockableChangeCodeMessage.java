// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableChangeCodeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5666;
  // str
  public java.lang.String code;

  public LockableChangeCodeMessage() {}

  public LockableChangeCodeMessage(java.lang.String code) {
    this.code = code;
  }

  @Override
  public int getProtocolId() {
    return 5666;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.code);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.code = reader.read_str();
  }

  @Override
  public String toString() {

    return "LockableChangeCodeMessage(" + "code=" + this.code + ')';
  }
}
