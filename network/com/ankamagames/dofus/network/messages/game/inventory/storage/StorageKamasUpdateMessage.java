// Created by Heat the 2017-10-20 01:53:26+02:00
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
  // vi64
  public long kamasTotal;

  public StorageKamasUpdateMessage() {}

  public StorageKamasUpdateMessage(long kamasTotal) {
    this.kamasTotal = kamasTotal;
  }

  @Override
  public int getProtocolId() {
    return 5645;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.kamasTotal);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.kamasTotal = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "StorageKamasUpdateMessage(" + "kamasTotal=" + this.kamasTotal + ')';
  }
}
