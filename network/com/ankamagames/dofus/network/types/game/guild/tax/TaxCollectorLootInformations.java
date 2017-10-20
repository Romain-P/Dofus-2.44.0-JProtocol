// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorLootInformations
    extends com.ankamagames.dofus.network.types.game.guild.tax
        .TaxCollectorComplementaryInformations {
  public static final int PROTOCOL_ID = 372;
  // vi64
  public long kamas;
  // vi64
  public long experience;
  // vi32
  public int pods;
  // vi64
  public long itemsValue;

  public TaxCollectorLootInformations() {}

  public TaxCollectorLootInformations(long kamas, long experience, int pods, long itemsValue) {

    super();
    this.kamas = kamas;
    this.experience = experience;
    this.pods = pods;
    this.itemsValue = itemsValue;
  }

  @Override
  public int getProtocolId() {
    return 372;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.kamas);
    writer.write_vi64(this.experience);
    writer.write_vi32(this.pods);
    writer.write_vi64(this.itemsValue);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.kamas = reader.read_vi64();
    this.experience = reader.read_vi64();
    this.pods = reader.read_vi32();
    this.itemsValue = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "TaxCollectorLootInformations("
        + "kamas="
        + this.kamas
        + ", experience="
        + this.experience
        + ", pods="
        + this.pods
        + ", itemsValue="
        + this.itemsValue
        + ')';
  }
}
