// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectItemInRolePlay extends NetworkType {
  public static final int PROTOCOL_ID = 198;
  // vi16
  public short cellId;
  // vi16
  public short objectGID;

  public ObjectItemInRolePlay() {}

  public ObjectItemInRolePlay(short cellId, short objectGID) {
    this.cellId = cellId;
    this.objectGID = objectGID;
  }

  @Override
  public int getProtocolId() {
    return 198;
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

    return "ObjectItemInRolePlay("
        + "cellId="
        + this.cellId
        + ", objectGID="
        + this.objectGID
        + ')';
  }
}
