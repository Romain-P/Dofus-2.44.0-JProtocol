// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportBuddiesAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6294;
  // bool
  public boolean accept;

  public TeleportBuddiesAnswerMessage()
  {}

  public TeleportBuddiesAnswerMessage(boolean accept)
  {
    this.accept = accept;
  }

  @Override
  public int getProtocolId()
  {
    return 6294;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.accept = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "TeleportBuddiesAnswerMessage(" + "accept=" + this.accept + ')';
  }
}
