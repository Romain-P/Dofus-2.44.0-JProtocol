// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportHavenBagAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6646;
  // bool
  public boolean accept;

  public TeleportHavenBagAnswerMessage()
  {}

  public TeleportHavenBagAnswerMessage(boolean accept)
  {
    this.accept = accept;
  }

  @Override
  public int getProtocolId()
  {
    return 6646;
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

    return "TeleportHavenBagAnswerMessage(" + "accept=" + this.accept + ')';
  }
}
