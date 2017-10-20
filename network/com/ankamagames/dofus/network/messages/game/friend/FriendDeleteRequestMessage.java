// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendDeleteRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5603;
  // i32
  public int accountId;

  public FriendDeleteRequestMessage() {}

  public FriendDeleteRequestMessage(int accountId) {
    this.accountId = accountId;
  }

  @Override
  public int getProtocolId() {
    return 5603;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.accountId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.accountId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "FriendDeleteRequestMessage(" + "accountId=" + this.accountId + ')';
  }
}
