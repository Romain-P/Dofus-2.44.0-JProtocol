// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FocusedExchangeReadyMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeReadyMessage {
  public static final int PROTOCOL_ID = 6701;
  // vi32
  public int focusActionId;

  public FocusedExchangeReadyMessage()
  {}

  public FocusedExchangeReadyMessage(boolean ready, short step, int focusActionId)
  {

    super(ready, step);
    this.focusActionId = focusActionId;
  }

  @Override
  public int getProtocolId()
  {
    return 6701;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.focusActionId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.focusActionId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "FocusedExchangeReadyMessage("
        + "ready="
        + this.ready
        + ", step="
        + this.step
        + ", focusActionId="
        + this.focusActionId
        + ')';
  }
}
