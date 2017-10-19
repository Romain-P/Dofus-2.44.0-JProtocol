// Created by Heat the 2017-10-19 04:03:13+02:00
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
  // ui64
  public java.math.BigInteger proposedPrice;

  public HouseBuyRequestMessage()
  {}

  public HouseBuyRequestMessage(java.math.BigInteger proposedPrice)
  {
    this.proposedPrice = proposedPrice;
  }

  @Override
  public int getProtocolId()
  {
    return 5738;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.proposedPrice);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.proposedPrice = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "HouseBuyRequestMessage(" + "proposedPrice=" + this.proposedPrice + ')';
  }
}
