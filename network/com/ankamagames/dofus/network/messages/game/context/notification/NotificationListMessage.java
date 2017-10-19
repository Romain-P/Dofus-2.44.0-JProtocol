// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.notification;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NotificationListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6087;
  // array,vi32
  public int[] flags;

  public NotificationListMessage()
  {}

  public NotificationListMessage(int[] flags)
  {
    this.flags = flags;
  }

  @Override
  public int getProtocolId()
  {
    return 6087;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(flags.length);
    writer.write_array_vi32(this.flags);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int flags_length = reader.read_ui16();
    this.flags = reader.read_array_vi32(flags_length);
  }

  @Override
  public String toString()
  {

    return "NotificationListMessage(" + "flags=" + java.util.Arrays.toString(this.flags) + ')';
  }
}
