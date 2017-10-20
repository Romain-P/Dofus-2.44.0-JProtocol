// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterAuthTokenRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6346;

  public KrosmasterAuthTokenRequestMessage() {}

  public static final KrosmasterAuthTokenRequestMessage i = new KrosmasterAuthTokenRequestMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6346;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "KrosmasterAuthTokenRequestMessage";
  }
}
