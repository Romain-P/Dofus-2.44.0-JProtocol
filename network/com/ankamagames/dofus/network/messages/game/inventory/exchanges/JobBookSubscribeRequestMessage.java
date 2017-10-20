// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class JobBookSubscribeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6592;
  // array,i8
  public byte[] jobIds;

  public JobBookSubscribeRequestMessage() {}

  public JobBookSubscribeRequestMessage(byte[] jobIds) {
    this.jobIds = jobIds;
  }

  @Override
  public int getProtocolId() {
    return 6592;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(jobIds.length);
    writer.write_array_i8(this.jobIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    int jobIds_length = reader.read_ui16();
    this.jobIds = reader.read_array_i8(jobIds_length);
  }

  @Override
  public String toString() {

    return "JobBookSubscribeRequestMessage(" + "jobIds=" + +this.jobIds.length + "b" + ')';
  }
}
