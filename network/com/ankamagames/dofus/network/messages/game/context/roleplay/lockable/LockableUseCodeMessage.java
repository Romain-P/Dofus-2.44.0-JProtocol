// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableUseCodeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5667;
  // str
  public java.lang.String code;

  public LockableUseCodeMessage()
  {}

  public LockableUseCodeMessage(java.lang.String code)
  {
    this.code = code;
  }

  @Override
  public int getProtocolId()
  {
    return 5667;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.code);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.code = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "LockableUseCodeMessage(" + "code=" + this.code + ')';
  }
}
