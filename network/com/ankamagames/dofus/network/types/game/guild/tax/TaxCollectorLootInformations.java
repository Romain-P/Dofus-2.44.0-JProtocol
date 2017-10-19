// Created by Heat the 2017-10-19 04:03:16+02:00
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
  // ui64
  public java.math.BigInteger kamas;
  // ui64
  public java.math.BigInteger experience;
  // vi32
  public int pods;
  // ui64
  public java.math.BigInteger itemsValue;

  public TaxCollectorLootInformations()
  {}

  public TaxCollectorLootInformations(
      java.math.BigInteger kamas,
      java.math.BigInteger experience,
      int pods,
      java.math.BigInteger itemsValue)
  {

    super();
    this.kamas = kamas;
    this.experience = experience;
    this.pods = pods;
    this.itemsValue = itemsValue;
  }

  @Override
  public int getProtocolId()
  {
    return 372;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui64(this.kamas);
    writer.write_ui64(this.experience);
    writer.write_vi32(this.pods);
    writer.write_ui64(this.itemsValue);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.kamas = reader.read_ui64();
    this.experience = reader.read_ui64();
    this.pods = reader.read_vi32();
    this.itemsValue = reader.read_ui64();
  }

  @Override
  public String toString()
  {

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
