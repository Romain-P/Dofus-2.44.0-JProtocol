// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PortalInformation extends NetworkType {
  public static final int PROTOCOL_ID = 466;
  // i32
  public int portalId;
  // i16
  public short areaId;

  public PortalInformation()
  {}

  public PortalInformation(int portalId, short areaId)
  {
    this.portalId = portalId;
    this.areaId = areaId;
  }

  @Override
  public int getProtocolId()
  {
    return 466;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.portalId);
    writer.write_i16(this.areaId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.portalId = reader.read_i32();
    this.areaId = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "PortalInformation(" + "portalId=" + this.portalId + ", areaId=" + this.areaId + ')';
  }
}
