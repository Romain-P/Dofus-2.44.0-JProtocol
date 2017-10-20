// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredDeleteRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5680;
  // i32
  public int accountId;
  // bool
  public boolean session;

  public IgnoredDeleteRequestMessage() {}

  public IgnoredDeleteRequestMessage(int accountId, boolean session) {
    this.accountId = accountId;
    this.session = session;
  }

  @Override
  public int getProtocolId() {
    return 5680;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.accountId);
    writer.write_bool(this.session);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.accountId = reader.read_i32();
    this.session = reader.read_bool();
  }

  @Override
  public String toString() {

    return "IgnoredDeleteRequestMessage("
        + "accountId="
        + this.accountId
        + ", session="
        + this.session
        + ')';
  }
}
