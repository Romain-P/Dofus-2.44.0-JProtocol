// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.emote;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EmotePlayMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.emote
        .EmotePlayAbstractMessage {
  public static final int PROTOCOL_ID = 5683;
  // f64
  public double actorId;
  // i32
  public int accountId;

  public EmotePlayMessage() {}

  public EmotePlayMessage(short emoteId, double emoteStartTime, double actorId, int accountId) {

    super(emoteId, emoteStartTime);
    this.actorId = actorId;
    this.accountId = accountId;
  }

  @Override
  public int getProtocolId() {
    return 5683;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.actorId);
    writer.write_i32(this.accountId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.actorId = reader.read_f64();
    this.accountId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "EmotePlayMessage("
        + "emoteId="
        + this.emoteId
        + ", emoteStartTime="
        + this.emoteStartTime
        + ", actorId="
        + this.actorId
        + ", accountId="
        + this.accountId
        + ')';
  }
}
