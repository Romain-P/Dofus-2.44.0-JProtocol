// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmoteListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5689;
  // array,ui8
  public short[] emoteIds;

  public EmoteListMessage()
  {}

  public EmoteListMessage(short[] emoteIds)
  {
    this.emoteIds = emoteIds;
  }

  @Override
  public int getProtocolId()
  {
    return 5689;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(emoteIds.length);
    writer.write_array_ui8(this.emoteIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int emoteIds_length = reader.read_ui16();
    this.emoteIds = reader.read_array_ui8(emoteIds_length);
  }

  @Override
  public String toString()
  {

    return "EmoteListMessage(" + "emoteIds=" + java.util.Arrays.toString(this.emoteIds) + ')';
  }
}
