// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection.register;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccountLinkRequiredMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6607;

  public AccountLinkRequiredMessage()
  {}

  public static final AccountLinkRequiredMessage i = new AccountLinkRequiredMessage();

  @Override
  public boolean isAlwaysEmpty()
  {
    return true;
  }

  @Override
  public int getProtocolId()
  {
    return 6607;
  }

  @Override
  public void serialize(DataWriter writer)
  {}

  @Override
  public void deserialize(DataReader reader)
  {}

  @Override
  public String toString()
  {

    return "AccountLinkRequiredMessage";
  }
}