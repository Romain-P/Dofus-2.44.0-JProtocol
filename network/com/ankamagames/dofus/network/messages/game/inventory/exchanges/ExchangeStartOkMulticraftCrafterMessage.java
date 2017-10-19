// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkMulticraftCrafterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5818;
  // vi32
  public int skillId;

  public ExchangeStartOkMulticraftCrafterMessage()
  {}

  public ExchangeStartOkMulticraftCrafterMessage(int skillId)
  {
    this.skillId = skillId;
  }

  @Override
  public int getProtocolId()
  {
    return 5818;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.skillId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.skillId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "ExchangeStartOkMulticraftCrafterMessage(" + "skillId=" + this.skillId + ')';
  }
}
