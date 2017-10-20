// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendAddFailureMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5600;
  // i8
  public byte reason;

  public FriendAddFailureMessage() {}

  public FriendAddFailureMessage(byte reason) {
    this.reason = reason;
  }

  @Override
  public int getProtocolId() {
    return 5600;
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

    return "FriendAddFailureMessage(" + "reason=" + this.reason + ')';
  }
}
