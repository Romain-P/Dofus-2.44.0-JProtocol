// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseBuyRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5738;
  // vi64
  public long proposedPrice;

  public HouseBuyRequestMessage() {}

  public HouseBuyRequestMessage(long proposedPrice) {
    this.proposedPrice = proposedPrice;
  }

  @Override
  public int getProtocolId() {
    return 5738;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.proposedPrice);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.proposedPrice = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "HouseBuyRequestMessage(" + "proposedPrice=" + this.proposedPrice + ')';
  }
}
