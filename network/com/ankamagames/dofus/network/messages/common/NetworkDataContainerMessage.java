// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.common;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NetworkDataContainerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 2;

  public NetworkDataContainerMessage() {}

  public static final NetworkDataContainerMessage i = new NetworkDataContainerMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 2;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "NetworkDataContainerMessage";
  }
}
