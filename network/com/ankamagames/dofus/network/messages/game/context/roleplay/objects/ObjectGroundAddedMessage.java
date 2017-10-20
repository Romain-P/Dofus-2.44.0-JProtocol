// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.objects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectGroundAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3017;
  // vi16
  public short cellId;
  // vi16
  public short objectGID;

  public ObjectGroundAddedMessage() {}

  public ObjectGroundAddedMessage(short cellId, short objectGID) {
    this.cellId = cellId;
    this.objectGID = objectGID;
  }

  @Override
  public int getProtocolId() {
    return 3017;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cellId);
    writer.write_vi16(this.objectGID);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cellId = reader.read_vi16();
    this.objectGID = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ObjectGroundAddedMessage("
        + "cellId="
        + this.cellId
        + ", objectGID="
        + this.objectGID
        + ')';
  }
}
