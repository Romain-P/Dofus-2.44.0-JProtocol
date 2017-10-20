// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AdditionalTaxCollectorInformations extends NetworkType {
  public static final int PROTOCOL_ID = 165;
  // str
  public java.lang.String collectorCallerName;
  // i32
  public int date;

  public AdditionalTaxCollectorInformations() {}

  public AdditionalTaxCollectorInformations(java.lang.String collectorCallerName, int date) {
    this.collectorCallerName = collectorCallerName;
    this.date = date;
  }

  @Override
  public int getProtocolId() {
    return 165;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.collectorCallerName);
    writer.write_i32(this.date);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.collectorCallerName = reader.read_str();
    this.date = reader.read_i32();
  }

  @Override
  public String toString() {

    return "AdditionalTaxCollectorInformations("
        + "collectorCallerName="
        + this.collectorCallerName
        + ", date="
        + this.date
        + ')';
  }
}
