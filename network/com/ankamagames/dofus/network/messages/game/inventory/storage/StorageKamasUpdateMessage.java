// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.storage;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StorageKamasUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5645;
  // ui64
  public java.math.BigInteger kamasTotal;

  public StorageKamasUpdateMessage()
  {}

  public StorageKamasUpdateMessage(java.math.BigInteger kamasTotal)
  {
    this.kamasTotal = kamasTotal;
  }

  @Override
  public int getProtocolId()
  {
    return 5645;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.kamasTotal);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.kamasTotal = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "StorageKamasUpdateMessage(" + "kamasTotal=" + this.kamasTotal + ')';
  }
}
