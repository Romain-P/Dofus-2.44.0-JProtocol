// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangePlayerMultiCraftRequestMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeRequestMessage {
  public static final int PROTOCOL_ID = 5784;
  // vi64
  public long target;
  // vi32
  public int skillId;

  public ExchangePlayerMultiCraftRequestMessage() {}

  public ExchangePlayerMultiCraftRequestMessage(byte exchangeType, long target, int skillId) {

    super(exchangeType);
    this.target = target;
    this.skillId = skillId;
  }

  @Override
  public int getProtocolId() {
    return 5784;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.target);
    writer.write_vi32(this.skillId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.target = reader.read_vi64();
    this.skillId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangePlayerMultiCraftRequestMessage("
        + "exchangeType="
        + this.exchangeType
        + ", target="
        + this.target
        + ", skillId="
        + this.skillId
        + ')';
  }
}
