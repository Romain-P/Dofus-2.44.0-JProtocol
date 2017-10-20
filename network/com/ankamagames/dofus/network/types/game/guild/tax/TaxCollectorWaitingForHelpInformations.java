// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorWaitingForHelpInformations
    extends com.ankamagames.dofus.network.types.game.guild.tax
        .TaxCollectorComplementaryInformations {
  public static final int PROTOCOL_ID = 447;
  // com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
  public com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
      waitingForHelpInfo;

  public TaxCollectorWaitingForHelpInformations() {}

  public TaxCollectorWaitingForHelpInformations(
      com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo
          waitingForHelpInfo) {

    super();
    this.waitingForHelpInfo = waitingForHelpInfo;
  }

  @Override
  public int getProtocolId() {
    return 447;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.waitingForHelpInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.waitingForHelpInfo =
        new com.ankamagames.dofus.network.types.game.fight.ProtectedEntityWaitingForHelpInfo();
    this.waitingForHelpInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "TaxCollectorWaitingForHelpInformations("
        + "waitingForHelpInfo="
        + this.waitingForHelpInfo
        + ')';
  }
}
