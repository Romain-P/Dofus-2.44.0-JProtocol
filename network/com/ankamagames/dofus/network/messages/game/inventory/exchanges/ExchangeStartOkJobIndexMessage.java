// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkJobIndexMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5819;
  // array,vi32
  public int[] jobs;

  public ExchangeStartOkJobIndexMessage()
  {}

  public ExchangeStartOkJobIndexMessage(int[] jobs)
  {
    this.jobs = jobs;
  }

  @Override
  public int getProtocolId()
  {
    return 5819;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(jobs.length);
    writer.write_array_vi32(this.jobs);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int jobs_length = reader.read_ui16();
    this.jobs = reader.read_array_vi32(jobs_length);
  }

  @Override
  public String toString()
  {

    return "ExchangeStartOkJobIndexMessage(" + "jobs=" + java.util.Arrays.toString(this.jobs) + ')';
  }
}
