// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObtainedItemWithBonusMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items.ObtainedItemMessage {
  public static final int PROTOCOL_ID = 6520;
  // vi32
  public int bonusQuantity;

  public ObtainedItemWithBonusMessage() {}

  public ObtainedItemWithBonusMessage(short genericId, int baseQuantity, int bonusQuantity) {

    super(genericId, baseQuantity);
    this.bonusQuantity = bonusQuantity;
  }

  @Override
  public int getProtocolId() {
    return 6520;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.bonusQuantity);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.bonusQuantity = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ObtainedItemWithBonusMessage("
        + "genericId="
        + this.genericId
        + ", baseQuantity="
        + this.baseQuantity
        + ", bonusQuantity="
        + this.bonusQuantity
        + ')';
  }
}
