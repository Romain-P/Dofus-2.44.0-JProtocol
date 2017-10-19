// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.web.krosmaster;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class KrosmasterFigure extends NetworkType {
  public static final int PROTOCOL_ID = 397;
  // str
  public java.lang.String uid;
  // vi16
  public short figure;
  // vi16
  public short pedestal;
  // bool
  public boolean bound;

  public KrosmasterFigure()
  {}

  public KrosmasterFigure(java.lang.String uid, short figure, short pedestal, boolean bound)
  {
    this.uid = uid;
    this.figure = figure;
    this.pedestal = pedestal;
    this.bound = bound;
  }

  @Override
  public int getProtocolId()
  {
    return 397;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.uid);
    writer.write_vi16(this.figure);
    writer.write_vi16(this.pedestal);
    writer.write_bool(this.bound);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.uid = reader.read_str();
    this.figure = reader.read_vi16();
    this.pedestal = reader.read_vi16();
    this.bound = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "KrosmasterFigure("
        + "uid="
        + this.uid
        + ", figure="
        + this.figure
        + ", pedestal="
        + this.pedestal
        + ", bound="
        + this.bound
        + ')';
  }
}
