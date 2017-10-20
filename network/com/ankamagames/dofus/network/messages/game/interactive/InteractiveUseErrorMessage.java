// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveUseErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6384;
  // vi32
  public int elemId;
  // vi32
  public int skillInstanceUid;

  public InteractiveUseErrorMessage() {}

  public InteractiveUseErrorMessage(int elemId, int skillInstanceUid) {
    this.elemId = elemId;
    this.skillInstanceUid = skillInstanceUid;
  }

  @Override
  public int getProtocolId() {
    return 6384;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.elemId);
    writer.write_vi32(this.skillInstanceUid);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.elemId = reader.read_vi32();
    this.skillInstanceUid = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "InteractiveUseErrorMessage("
        + "elemId="
        + this.elemId
        + ", skillInstanceUid="
        + this.skillInstanceUid
        + ')';
  }
}
