// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectJobAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6014;
  // i8
  public byte jobId;

  public ObjectJobAddedMessage()
  {}

  public ObjectJobAddedMessage(byte jobId)
  {
    this.jobId = jobId;
  }

  @Override
  public int getProtocolId()
  {
    return 6014;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.jobId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.jobId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "ObjectJobAddedMessage(" + "jobId=" + this.jobId + ')';
  }
}
