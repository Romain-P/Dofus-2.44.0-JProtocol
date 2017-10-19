// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportHavenBagRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6647;
  // ui64
  public java.math.BigInteger guestId;

  public TeleportHavenBagRequestMessage()
  {}

  public TeleportHavenBagRequestMessage(java.math.BigInteger guestId)
  {
    this.guestId = guestId;
  }

  @Override
  public int getProtocolId()
  {
    return 6647;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.guestId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.guestId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "TeleportHavenBagRequestMessage(" + "guestId=" + this.guestId + ')';
  }
}
