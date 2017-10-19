// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class WrapperObjectErrorMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items
        .SymbioticObjectErrorMessage {
  public static final int PROTOCOL_ID = 6529;

  public WrapperObjectErrorMessage()
  {}

  public WrapperObjectErrorMessage(byte reason, byte errorCode)
  {

    super(reason, errorCode);
  }

  @Override
  public int getProtocolId()
  {
    return 6529;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "WrapperObjectErrorMessage("
        + "reason="
        + this.reason
        + ", errorCode="
        + this.errorCode
        + ')';
  }
}
