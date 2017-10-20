// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockInformations extends NetworkType {
  public static final int PROTOCOL_ID = 132;
  // vi16
  public short maxOutdoorMount;
  // vi16
  public short maxItems;

  public PaddockInformations() {}

  public PaddockInformations(short maxOutdoorMount, short maxItems) {
    this.maxOutdoorMount = maxOutdoorMount;
    this.maxItems = maxItems;
  }

  @Override
  public int getProtocolId() {
    return 132;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.maxOutdoorMount);
    writer.write_vi16(this.maxItems);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.maxOutdoorMount = reader.read_vi16();
    this.maxItems = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "PaddockInformations("
        + "maxOutdoorMount="
        + this.maxOutdoorMount
        + ", maxItems="
        + this.maxItems
        + ')';
  }
}
