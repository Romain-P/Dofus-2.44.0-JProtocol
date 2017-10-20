// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5685;
  // ui8
  public short emoteId;

  public EmotePlayRequestMessage() {}

  public EmotePlayRequestMessage(short emoteId) {
    this.emoteId = emoteId;
  }

  @Override
  public int getProtocolId() {
    return 5685;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui8(this.emoteId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.emoteId = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "EmotePlayRequestMessage(" + "emoteId=" + this.emoteId + ')';
  }
}
