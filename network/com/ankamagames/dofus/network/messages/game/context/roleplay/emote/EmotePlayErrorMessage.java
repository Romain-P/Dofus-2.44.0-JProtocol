// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5688;
  // ui8
  public short emoteId;

  public EmotePlayErrorMessage()
  {}

  public EmotePlayErrorMessage(short emoteId)
  {
    this.emoteId = emoteId;
  }

  @Override
  public int getProtocolId()
  {
    return 5688;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.emoteId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.emoteId = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "EmotePlayErrorMessage(" + "emoteId=" + this.emoteId + ')';
  }
}
