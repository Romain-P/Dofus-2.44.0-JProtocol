// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolPartyRegisterRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6582;
  // bool
  public boolean register;

  public IdolPartyRegisterRequestMessage()
  {}

  public IdolPartyRegisterRequestMessage(boolean register)
  {
    this.register = register;
  }

  @Override
  public int getProtocolId()
  {
    return 6582;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.register);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.register = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "IdolPartyRegisterRequestMessage(" + "register=" + this.register + ')';
  }
}
