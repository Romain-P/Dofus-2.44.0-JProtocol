// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AlliancePrismInformation
    extends com.ankamagames.dofus.network.types.game.prism.PrismInformation {
  public static final int PROTOCOL_ID = 427;
  // com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations alliance;

  public AlliancePrismInformation() {}

  public AlliancePrismInformation(
      byte typeId,
      byte state,
      int nextVulnerabilityDate,
      int placementDate,
      int rewardTokenCount,
      com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations alliance) {

    super(typeId, state, nextVulnerabilityDate, placementDate, rewardTokenCount);
    this.alliance = alliance;
  }

  @Override
  public int getProtocolId() {
    return 427;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.alliance.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.alliance =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AllianceInformations();
    this.alliance.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AlliancePrismInformation("
        + "typeId="
        + this.typeId
        + ", state="
        + this.state
        + ", nextVulnerabilityDate="
        + this.nextVulnerabilityDate
        + ", placementDate="
        + this.placementDate
        + ", rewardTokenCount="
        + this.rewardTokenCount
        + ", alliance="
        + this.alliance
        + ')';
  }
}
