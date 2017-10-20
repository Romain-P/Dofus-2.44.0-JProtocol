// Created by Heat the 2017-10-20 01:53:24+02:00
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
  // vi64
  public long amount;
  // bool
  public boolean forSale;

  public HouseSellRequestMessage() {}

  public HouseSellRequestMessage(int instanceId, long amount, boolean forSale) {
    this.instanceId = instanceId;
    this.amount = amount;
    this.forSale = forSale;
  }

  @Override
  public int getProtocolId() {
    return 5697;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.instanceId);
    writer.write_vi64(this.amount);
    writer.write_bool(this.forSale);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.instanceId = reader.read_i32();
    this.amount = reader.read_vi64();
    this.forSale = reader.read_bool();
  }

  @Override
  public String toString() {

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
