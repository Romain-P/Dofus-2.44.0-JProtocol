// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MountInformationsForPaddock extends NetworkType {
  public static final int PROTOCOL_ID = 184;
  // vi16
  public short modelId;
  // str
  public java.lang.String name;
  // str
  public java.lang.String ownerName;

  public MountInformationsForPaddock() {}

  public MountInformationsForPaddock(
      short modelId, java.lang.String name, java.lang.String ownerName) {
    this.modelId = modelId;
    this.name = name;
    this.ownerName = ownerName;
  }

  @Override
  public int getProtocolId() {
    return 184;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.modelId);
    writer.write_str(this.name);
    writer.write_str(this.ownerName);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.modelId = reader.read_vi16();
    this.name = reader.read_str();
    this.ownerName = reader.read_str();
  }

  @Override
  public String toString() {

    return "MountInformationsForPaddock("
        + "modelId="
        + this.modelId
        + ", name="
        + this.name
        + ", ownerName="
        + this.ownerName
        + ')';
  }
}
