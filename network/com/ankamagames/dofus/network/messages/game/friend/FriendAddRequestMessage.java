// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendAddRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 4004;
  // str
  public java.lang.String name;

  public FriendAddRequestMessage() {}

  public FriendAddRequestMessage(java.lang.String name) {
    this.name = name;
  }

  @Override
  public int getProtocolId() {
    return 4004;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.name = reader.read_str();
  }

  @Override
  public String toString() {

    return "FriendAddRequestMessage(" + "name=" + this.name + ')';
  }
}
