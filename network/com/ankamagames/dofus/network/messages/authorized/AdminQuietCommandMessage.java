// Created by Heat the 2017-10-20 01:53:21+02:00
package com.ankamagames.dofus.network.messages.authorized;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AdminQuietCommandMessage
    extends com.ankamagames.dofus.network.messages.authorized.AdminCommandMessage {
  public static final int PROTOCOL_ID = 5662;

  public AdminQuietCommandMessage() {}

  public AdminQuietCommandMessage(java.lang.String content) {

    super(content);
  }

  @Override
  public int getProtocolId() {
    return 5662;
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

    return "AdminQuietCommandMessage(" + "content=" + this.content + ')';
  }
}
