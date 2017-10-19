// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSellRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5697;
  // i32
  public int instanceId;
  // ui64
  public java.math.BigInteger amount;
  // bool
  public boolean forSale;

  public HouseSellRequestMessage()
  {}

  public HouseSellRequestMessage(int instanceId, java.math.BigInteger amount, boolean forSale)
  {
    this.instanceId = instanceId;
    this.amount = amount;
    this.forSale = forSale;
  }

  @Override
  public int getProtocolId()
  {
    return 5697;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.instanceId);
    writer.write_ui64(this.amount);
    writer.write_bool(this.forSale);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.instanceId = reader.read_i32();
    this.amount = reader.read_ui64();
    this.forSale = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "HouseSellRequestMessage("
        + "instanceId="
        + this.instanceId
        + ", amount="
        + this.amount
        + ", forSale="
        + this.forSale
        + ')';
  }
}
