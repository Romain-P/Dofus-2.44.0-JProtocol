// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseSellFromInsideRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.houses
        .HouseSellRequestMessage {
  public static final int PROTOCOL_ID = 5884;

  public HouseSellFromInsideRequestMessage() {}

  public HouseSellFromInsideRequestMessage(int instanceId, long amount, boolean forSale) {

    super(instanceId, amount, forSale);
  }

  @Override
  public int getProtocolId() {
    return 5884;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "HouseSellFromInsideRequestMessage("
        + "instanceId="
        + this.instanceId
        + ", amount="
        + this.amount
        + ", forSale="
        + this.forSale
        + ')';
  }
}
