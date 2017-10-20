// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.wtf;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ClientYouAreDrunkMessage
    extends com.ankamagames.dofus.network.messages.debug.DebugInClientMessage {
  public static final int PROTOCOL_ID = 6594;

  public ClientYouAreDrunkMessage() {}

  public ClientYouAreDrunkMessage(byte level, java.lang.String message) {

    super(level, message);
  }

  @Override
  public int getProtocolId() {
    return 6594;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ClientYouAreDrunkMessage(" + "level=" + this.level + ", message=" + this.message + ')';
  }
}
