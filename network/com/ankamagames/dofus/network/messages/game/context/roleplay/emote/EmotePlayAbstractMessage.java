// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayAbstractMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5690;
  // ui8
  public short emoteId;
  // f64
  public double emoteStartTime;

  public EmotePlayAbstractMessage() {}

  public EmotePlayAbstractMessage(short emoteId, double emoteStartTime) {
    this.emoteId = emoteId;
    this.emoteStartTime = emoteStartTime;
  }

  @Override
  public int getProtocolId() {
    return 5690;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui8(this.emoteId);
    writer.write_f64(this.emoteStartTime);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.emoteId = reader.read_ui8();
    this.emoteStartTime = reader.read_f64();
  }

  @Override
  public String toString() {

    return "EmotePlayAbstractMessage("
        + "emoteId="
        + this.emoteId
        + ", emoteStartTime="
        + this.emoteStartTime
        + ')';
  }
}
