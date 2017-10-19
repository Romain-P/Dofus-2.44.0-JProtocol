// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PresetItem extends NetworkType {
  public static final int PROTOCOL_ID = 354;
  // ui8
  public short position;
  // vi16
  public short objGid;
  // vi32
  public int objUid;

  public PresetItem()
  {}

  public PresetItem(short position, short objGid, int objUid)
  {
    this.position = position;
    this.objGid = objGid;
    this.objUid = objUid;
  }

  @Override
  public int getProtocolId()
  {
    return 354;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.position);
    writer.write_vi16(this.objGid);
    writer.write_vi32(this.objUid);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.position = reader.read_ui8();
    this.objGid = reader.read_vi16();
    this.objUid = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "PresetItem("
        + "position="
        + this.position
        + ", objGid="
        + this.objGid
        + ", objUid="
        + this.objUid
        + ')';
  }
}
