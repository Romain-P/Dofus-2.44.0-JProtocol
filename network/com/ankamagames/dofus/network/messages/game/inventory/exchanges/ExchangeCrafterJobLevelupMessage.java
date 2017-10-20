// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeCrafterJobLevelupMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6598;
  // ui8
  public short crafterJobLevel;

  public ExchangeCrafterJobLevelupMessage() {}

  public ExchangeCrafterJobLevelupMessage(short crafterJobLevel) {
    this.crafterJobLevel = crafterJobLevel;
  }

  @Override
  public int getProtocolId() {
    return 6598;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui8(this.crafterJobLevel);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.crafterJobLevel = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "ExchangeCrafterJobLevelupMessage(" + "crafterJobLevel=" + this.crafterJobLevel + ')';
  }
}
