// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveUseEndedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6112;
  // vi32
  public int elemId;
  // vi16
  public short skillId;

  public InteractiveUseEndedMessage() {}

  public InteractiveUseEndedMessage(int elemId, short skillId) {
    this.elemId = elemId;
    this.skillId = skillId;
  }

  @Override
  public int getProtocolId() {
    return 6112;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.elemId);
    writer.write_vi16(this.skillId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.elemId = reader.read_vi32();
    this.skillId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "InteractiveUseEndedMessage("
        + "elemId="
        + this.elemId
        + ", skillId="
        + this.skillId
        + ')';
  }
}
