// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendDeleteResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5601;
  // bool
  public boolean success;
  // str
  public java.lang.String name;

  public FriendDeleteResultMessage() {}

  public FriendDeleteResultMessage(boolean success, java.lang.String name) {
    this.success = success;
    this.name = name;
  }

  @Override
  public int getProtocolId() {
    return 5601;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.success);
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.success = reader.read_bool();
    this.name = reader.read_str();
  }

  @Override
  public String toString() {

    return "FriendDeleteResultMessage(" + "success=" + this.success + ", name=" + this.name + ')';
  }
}
