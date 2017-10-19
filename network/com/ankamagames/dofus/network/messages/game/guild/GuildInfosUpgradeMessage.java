// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInfosUpgradeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5636;
  // i8
  public byte maxTaxCollectorsCount;
  // i8
  public byte taxCollectorsCount;
  // vi16
  public short taxCollectorLifePoints;
  // vi16
  public short taxCollectorDamagesBonuses;
  // vi16
  public short taxCollectorPods;
  // vi16
  public short taxCollectorProspecting;
  // vi16
  public short taxCollectorWisdom;
  // vi16
  public short boostPoints;
  // array,vi16
  public short[] spellId;
  // array,i16
  public short[] spellLevel;

  public GuildInfosUpgradeMessage()
  {}

  public GuildInfosUpgradeMessage(
      byte maxTaxCollectorsCount,
      byte taxCollectorsCount,
      short taxCollectorLifePoints,
      short taxCollectorDamagesBonuses,
      short taxCollectorPods,
      short taxCollectorProspecting,
      short taxCollectorWisdom,
      short boostPoints,
      short[] spellId,
      short[] spellLevel)
  {
    this.maxTaxCollectorsCount = maxTaxCollectorsCount;
    this.taxCollectorsCount = taxCollectorsCount;
    this.taxCollectorLifePoints = taxCollectorLifePoints;
    this.taxCollectorDamagesBonuses = taxCollectorDamagesBonuses;
    this.taxCollectorPods = taxCollectorPods;
    this.taxCollectorProspecting = taxCollectorProspecting;
    this.taxCollectorWisdom = taxCollectorWisdom;
    this.boostPoints = boostPoints;
    this.spellId = spellId;
    this.spellLevel = spellLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 5636;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.maxTaxCollectorsCount);
    writer.write_i8(this.taxCollectorsCount);
    writer.write_vi16(this.taxCollectorLifePoints);
    writer.write_vi16(this.taxCollectorDamagesBonuses);
    writer.write_vi16(this.taxCollectorPods);
    writer.write_vi16(this.taxCollectorProspecting);
    writer.write_vi16(this.taxCollectorWisdom);
    writer.write_vi16(this.boostPoints);
    writer.write_ui16(spellId.length);
    writer.write_array_vi16(this.spellId);
    writer.write_ui16(spellLevel.length);
    writer.write_array_i16(this.spellLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.maxTaxCollectorsCount = reader.read_i8();
    this.taxCollectorsCount = reader.read_i8();
    this.taxCollectorLifePoints = reader.read_vi16();
    this.taxCollectorDamagesBonuses = reader.read_vi16();
    this.taxCollectorPods = reader.read_vi16();
    this.taxCollectorProspecting = reader.read_vi16();
    this.taxCollectorWisdom = reader.read_vi16();
    this.boostPoints = reader.read_vi16();

    int spellId_length = reader.read_ui16();
    this.spellId = reader.read_array_vi16(spellId_length);

    int spellLevel_length = reader.read_ui16();
    this.spellLevel = reader.read_array_i16(spellLevel_length);
  }

  @Override
  public String toString()
  {

    return "GuildInfosUpgradeMessage("
        + "maxTaxCollectorsCount="
        + this.maxTaxCollectorsCount
        + ", taxCollectorsCount="
        + this.taxCollectorsCount
        + ", taxCollectorLifePoints="
        + this.taxCollectorLifePoints
        + ", taxCollectorDamagesBonuses="
        + this.taxCollectorDamagesBonuses
        + ", taxCollectorPods="
        + this.taxCollectorPods
        + ", taxCollectorProspecting="
        + this.taxCollectorProspecting
        + ", taxCollectorWisdom="
        + this.taxCollectorWisdom
        + ", boostPoints="
        + this.boostPoints
        + ", spellId="
        + java.util.Arrays.toString(this.spellId)
        + ", spellLevel="
        + java.util.Arrays.toString(this.spellLevel)
        + ')';
  }
}
