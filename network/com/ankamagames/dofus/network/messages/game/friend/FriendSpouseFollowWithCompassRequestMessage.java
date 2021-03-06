// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendSpouseFollowWithCompassRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5606;
  // bool
  public boolean enable;

  public FriendSpouseFollowWithCompassRequestMessage() {}

  public FriendSpouseFollowWithCompassRequestMessage(boolean enable) {
    this.enable = enable;
  }

  @Override
  public int getProtocolId() {
    return 5606;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.enable);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.enable = reader.read_bool();
  }

  @Override
  public String toString() {

    return "FriendSpouseFollowWithCompassRequestMessage(" + "enable=" + this.enable + ')';
  }
}
