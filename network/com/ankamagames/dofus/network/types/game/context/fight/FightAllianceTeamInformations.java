// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightAllianceTeamInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations {
  public static final int PROTOCOL_ID = 439;
  // i8
  public byte relation;

  public FightAllianceTeamInformations() {}

  public FightAllianceTeamInformations(
      byte teamId,
      double leaderId,
      byte teamSide,
      byte teamTypeId,
      byte nbWaves,
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations[]
          teamMembers,
      byte relation) {

    super(teamId, leaderId, teamSide, teamTypeId, nbWaves, teamMembers);
    this.relation = relation;
  }

  public FightAllianceTeamInformations(
      byte teamId,
      double leaderId,
      byte teamSide,
      byte teamTypeId,
      byte nbWaves,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations>
          teamMembers,
      byte relation) {

    super(teamId, leaderId, teamSide, teamTypeId, nbWaves, teamMembers);
    this.relation = relation;
  }

  @Override
  public int getProtocolId() {
    return 439;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.relation);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.relation = reader.read_i8();
  }

  @Override
  public String toString() {

    return "FightAllianceTeamInformations("
        + "teamId="
        + this.teamId
        + ", leaderId="
        + this.leaderId
        + ", teamSide="
        + this.teamSide
        + ", teamTypeId="
        + this.teamTypeId
        + ", nbWaves="
        + this.nbWaves
        + ", teamMembers="
        + java.util.Arrays.toString(this.teamMembers)
        + ", relation="
        + this.relation
        + ')';
  }
}
