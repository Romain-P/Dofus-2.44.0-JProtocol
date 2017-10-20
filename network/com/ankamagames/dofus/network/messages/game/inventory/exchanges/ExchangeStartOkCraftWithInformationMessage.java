// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkCraftWithInformationMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeStartOkCraftMessage {
  public static final int PROTOCOL_ID = 5941;
  // vi32
  public int skillId;

  public ExchangeStartOkCraftWithInformationMessage() {}

  public ExchangeStartOkCraftWithInformationMessage(int skillId) {

    super();
    this.skillId = skillId;
  }

  @Override
  public int getProtocolId() {
    return 5941;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi32(this.skillId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.skillId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "ExchangeStartOkCraftWithInformationMessage(" + "skillId=" + this.skillId + ')';
  }
}
