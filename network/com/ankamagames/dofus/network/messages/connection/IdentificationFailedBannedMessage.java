// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationFailedBannedMessage
    extends com.ankamagames.dofus.network.messages.connection.IdentificationFailedMessage {
  public static final int PROTOCOL_ID = 6174;
  // f64
  public double banEndDate;

  public IdentificationFailedBannedMessage()
  {}

  public IdentificationFailedBannedMessage(byte reason, double banEndDate)
  {

    super(reason);
    this.banEndDate = banEndDate;
  }

  @Override
  public int getProtocolId()
  {
    return 6174;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_f64(this.banEndDate);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.banEndDate = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "IdentificationFailedBannedMessage("
        + "reason="
        + this.reason
        + ", banEndDate="
        + this.banEndDate
        + ')';
  }
}
