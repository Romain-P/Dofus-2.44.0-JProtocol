// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.houses;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HouseLockFromInsideRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
        .LockableChangeCodeMessage {
  public static final int PROTOCOL_ID = 5885;

  public HouseLockFromInsideRequestMessage()
  {}

  public HouseLockFromInsideRequestMessage(java.lang.String code)
  {

    super(code);
  }

  @Override
  public int getProtocolId()
  {
    return 5885;
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

    return "HouseLockFromInsideRequestMessage(" + "code=" + this.code + ')';
  }
}
