// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismUseRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6041;
  // i8
  public byte moduleToUse;

  public PrismUseRequestMessage()
  {}

  public PrismUseRequestMessage(byte moduleToUse)
  {
    this.moduleToUse = moduleToUse;
  }

  @Override
  public int getProtocolId()
  {
    return 6041;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.moduleToUse);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.moduleToUse = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "PrismUseRequestMessage(" + "moduleToUse=" + this.moduleToUse + ')';
  }
}
