// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkMulticraftCustomerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5817;
  // vi32
  public int skillId;
  // ui8
  public short crafterJobLevel;

  public ExchangeStartOkMulticraftCustomerMessage()
  {}

  public ExchangeStartOkMulticraftCustomerMessage(int skillId, short crafterJobLevel)
  {
    this.skillId = skillId;
    this.crafterJobLevel = crafterJobLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 5817;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.skillId);
    writer.write_ui8(this.crafterJobLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.skillId = reader.read_vi32();
    this.crafterJobLevel = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "ExchangeStartOkMulticraftCustomerMessage("
        + "skillId="
        + this.skillId
        + ", crafterJobLevel="
        + this.crafterJobLevel
        + ')';
  }
}
