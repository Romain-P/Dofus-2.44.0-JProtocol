// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SequenceNumberRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6316;

  public SequenceNumberRequestMessage() {}

  public static final SequenceNumberRequestMessage i = new SequenceNumberRequestMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6316;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "SequenceNumberRequestMessage";
  }
}
