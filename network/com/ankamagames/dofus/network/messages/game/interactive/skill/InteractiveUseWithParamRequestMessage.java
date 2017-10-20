// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.interactive.skill;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveUseWithParamRequestMessage
    extends com.ankamagames.dofus.network.messages.game.interactive.InteractiveUseRequestMessage {
  public static final int PROTOCOL_ID = 6715;
  // i32
  public int id;

  public InteractiveUseWithParamRequestMessage() {}

  public InteractiveUseWithParamRequestMessage(int elemId, int skillInstanceUid, int id) {

    super(elemId, skillInstanceUid);
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 6715;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.id = reader.read_i32();
  }

  @Override
  public String toString() {

    return "InteractiveUseWithParamRequestMessage("
        + "elemId="
        + this.elemId
        + ", skillInstanceUid="
        + this.skillInstanceUid
        + ", id="
        + this.id
        + ')';
  }
}
