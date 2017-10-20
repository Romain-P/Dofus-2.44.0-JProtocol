// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.notification;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NotificationResetMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6089;

  public NotificationResetMessage() {}

  public static final NotificationResetMessage i = new NotificationResetMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 6089;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "NotificationResetMessage";
  }
}
