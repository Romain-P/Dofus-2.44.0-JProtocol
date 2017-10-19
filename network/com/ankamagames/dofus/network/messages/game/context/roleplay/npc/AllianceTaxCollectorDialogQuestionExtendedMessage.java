// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceTaxCollectorDialogQuestionExtendedMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.npc
        .TaxCollectorDialogQuestionExtendedMessage {
  public static final int PROTOCOL_ID = 6445;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
      alliance;

  public AllianceTaxCollectorDialogQuestionExtendedMessage()
  {}

  public AllianceTaxCollectorDialogQuestionExtendedMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicGuildInformations guildInfo,
      short maxPods,
      short prospecting,
      short wisdom,
      byte taxCollectorsCount,
      int taxCollectorAttack,
      java.math.BigInteger kamas,
      java.math.BigInteger experience,
      int pods,
      java.math.BigInteger itemsValue,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
          alliance)
  {

    super(
        guildInfo,
        maxPods,
        prospecting,
        wisdom,
        taxCollectorsCount,
        taxCollectorAttack,
        kamas,
        experience,
        pods,
        itemsValue);
    this.alliance = alliance;
  }

  @Override
  public int getProtocolId()
  {
    return 6445;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    this.alliance.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.alliance =
        new com.ankamagames.dofus.network.types.game.context.roleplay
            .BasicNamedAllianceInformations();
    this.alliance.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "AllianceTaxCollectorDialogQuestionExtendedMessage("
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
        + ", alliance="
        + this.alliance
        + ')';
  }
}
