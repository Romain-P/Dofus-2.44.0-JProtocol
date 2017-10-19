// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection.search;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AcquaintanceSearchErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6143;
  // i8
  public byte reason;

  public AcquaintanceSearchErrorMessage()
  {}

  public AcquaintanceSearchErrorMessage(byte reason)
  {
    this.reason = reason;
  }

  @Override
  public int getProtocolId()
  {
    return 6143;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.reason);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.reason = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "AcquaintanceSearchErrorMessage(" + "reason=" + this.reason + ')';
  }
}
