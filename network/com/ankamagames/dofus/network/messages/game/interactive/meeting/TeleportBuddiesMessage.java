// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportBuddiesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6289;
  // vi16
  public short dungeonId;

  public TeleportBuddiesMessage()
  {}

  public TeleportBuddiesMessage(short dungeonId)
  {
    this.dungeonId = dungeonId;
  }

  @Override
  public int getProtocolId()
  {
    return 6289;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.dungeonId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dungeonId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "TeleportBuddiesMessage(" + "dungeonId=" + this.dungeonId + ')';
  }
}
