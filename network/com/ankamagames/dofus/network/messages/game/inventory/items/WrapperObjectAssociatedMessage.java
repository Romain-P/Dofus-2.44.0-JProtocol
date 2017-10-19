// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class WrapperObjectAssociatedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.items
        .SymbioticObjectAssociatedMessage {
  public static final int PROTOCOL_ID = 6523;

  public WrapperObjectAssociatedMessage()
  {}

  public WrapperObjectAssociatedMessage(int hostUID)
  {

    super(hostUID);
  }

  @Override
  public int getProtocolId()
  {
    return 6523;
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

    return "WrapperObjectAssociatedMessage(" + "hostUID=" + this.hostUID + ')';
  }
}
