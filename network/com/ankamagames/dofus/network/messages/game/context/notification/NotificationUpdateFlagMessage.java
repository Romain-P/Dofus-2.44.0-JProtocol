// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.notification;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NotificationUpdateFlagMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6090;
  // vi16
  public short index;

  public NotificationUpdateFlagMessage()
  {}

  public NotificationUpdateFlagMessage(short index)
  {
    this.index = index;
  }

  @Override
  public int getProtocolId()
  {
    return 6090;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.index);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.index = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "NotificationUpdateFlagMessage(" + "index=" + this.index + ')';
  }
}
