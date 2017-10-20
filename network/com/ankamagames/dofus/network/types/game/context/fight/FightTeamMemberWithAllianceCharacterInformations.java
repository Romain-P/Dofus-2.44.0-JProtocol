// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamMemberWithAllianceCharacterInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .FightTeamMemberCharacterInformations {
  public static final int PROTOCOL_ID = 426;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
      allianceInfos;

  public FightTeamMemberWithAllianceCharacterInformations() {}

  public FightTeamMemberWithAllianceCharacterInformations(
      double id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations
          allianceInfos) {

    super(id, name, level);
    this.allianceInfos = allianceInfos;
  }

  @Override
  public int getProtocolId() {
    return 426;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.allianceInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.allianceInfos =
        new com.ankamagames.dofus.network.types.game.context.roleplay.BasicAllianceInformations();
    this.allianceInfos.deserialize(reader);
  }

  @Override
  public String toString() {

    return "FightTeamMemberWithAllianceCharacterInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", allianceInfos="
        + this.allianceInfos
        + ')';
  }
}
