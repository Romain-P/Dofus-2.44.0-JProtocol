// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorDialogQuestionExtendedMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.npc
        .TaxCollectorDialogQuestionBasicMessage {
  public static final int PROTOCOL_ID = 5615;
  // vi16
  public short maxPods;
  // vi16
  public short prospecting;
  // vi16
  public short wisdom;
  // i8
  public byte taxCollectorsCount;
  // i32
  public int taxCollectorAttack;
  // vi64
  public long kamas;
  // vi64
  public long experience;
  // vi32
  public int pods;
  // vi64
  public long itemsValue;

  public TaxCollectorDialogQuestionExtendedMessage() {}

  public TaxCollectorDialogQuestionExtendedMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo,
      short maxPods,
      short prospecting,
      short wisdom,
      byte taxCollectorsCount,
      int taxCollectorAttack,
      long kamas,
      long experience,
      int pods,
      long itemsValue) {

    super(guildInfo);
    this.maxPods = maxPods;
    this.prospecting = prospecting;
    this.wisdom = wisdom;
    this.taxCollectorsCount = taxCollectorsCount;
    this.taxCollectorAttack = taxCollectorAttack;
    this.kamas = kamas;
    this.experience = experience;
    this.pods = pods;
    this.itemsValue = itemsValue;
  }

  @Override
  public int getProtocolId() {
    return 5615;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.maxPods);
    writer.write_vi16(this.prospecting);
    writer.write_vi16(this.wisdom);
    writer.write_i8(this.taxCollectorsCount);
    writer.write_i32(this.taxCollectorAttack);
    writer.write_vi64(this.kamas);
    writer.write_vi64(this.experience);
    writer.write_vi32(this.pods);
    writer.write_vi64(this.itemsValue);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.maxPods = reader.read_vi16();
    this.prospecting = reader.read_vi16();
    this.wisdom = reader.read_vi16();
    this.taxCollectorsCount = reader.read_i8();
    this.taxCollectorAttack = reader.read_i32();
    this.kamas = reader.read_vi64();
    this.experience = reader.read_vi64();
    this.pods = reader.read_vi32();
    this.itemsValue = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "TaxCollectorDialogQuestionExtendedMessage("
        + "guildInfo="
        + this.guildInfo
        + ", maxPods="
        + this.maxPods
        + ", prospecting="
        + this.prospecting
        + ", wisdom="
        + this.wisdom
        + ", taxCollectorsCount="
        + this.taxCollectorsCount
        + ", taxCollectorAttack="
        + this.taxCollectorAttack
        + ", kamas="
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
