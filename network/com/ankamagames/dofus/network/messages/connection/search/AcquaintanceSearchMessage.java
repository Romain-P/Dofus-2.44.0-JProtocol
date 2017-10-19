// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection.search;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AcquaintanceSearchMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6144;
  // str
  public java.lang.String nickname;

  public AcquaintanceSearchMessage()
  {}

  public AcquaintanceSearchMessage(java.lang.String nickname)
  {
    this.nickname = nickname;
  }

  @Override
  public int getProtocolId()
  {
    return 6144;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.nickname);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.nickname = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "AcquaintanceSearchMessage(" + "nickname=" + this.nickname + ')';
  }
}
