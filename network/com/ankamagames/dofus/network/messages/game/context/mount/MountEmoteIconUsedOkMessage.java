// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountEmoteIconUsedOkMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5978;
  // vi32
  public int mountId;
  // i8
  public byte reactionType;

  public MountEmoteIconUsedOkMessage() {}

  public MountEmoteIconUsedOkMessage(int mountId, byte reactionType) {
    this.mountId = mountId;
    this.reactionType = reactionType;
  }

  @Override
  public int getProtocolId() {
    return 5978;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.mountId);
    writer.write_i8(this.reactionType);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.mountId = reader.read_vi32();
    this.reactionType = reader.read_i8();
  }

  @Override
  public String toString() {

    return "MountEmoteIconUsedOkMessage("
        + "mountId="
        + this.mountId
        + ", reactionType="
        + this.reactionType
        + ')';
  }
}
