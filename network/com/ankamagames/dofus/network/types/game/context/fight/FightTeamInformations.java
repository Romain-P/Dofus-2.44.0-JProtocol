// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightTeamInformations
    extends com.ankamagames.dofus.network.types.game.context.fight.AbstractFightTeamInformations {
  public static final int PROTOCOL_ID = 33;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations[]
      teamMembers;

  public FightTeamInformations() {}

  public FightTeamInformations(
      byte teamId,
      double leaderId,
      byte teamSide,
      byte teamTypeId,
      byte nbWaves,
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations[]
          teamMembers) {

    super(teamId, leaderId, teamSide, teamTypeId, nbWaves);
    this.teamMembers = teamMembers;
  }

  public FightTeamInformations(
      byte teamId,
      double leaderId,
      byte teamSide,
      byte teamTypeId,
      byte nbWaves,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations>
          teamMembers) {

    super(teamId, leaderId, teamSide, teamTypeId, nbWaves);
    this.teamMembers =
        teamMembers.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations[]
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 33;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(teamMembers.length);

    for (int i = 0; i < teamMembers.length; i++) {

      writer.write_ui16(teamMembers[i].getProtocolId());

      teamMembers[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int teamMembers_length = reader.read_ui16();
    this.teamMembers =
        new com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations
            [teamMembers_length];

    for (int i = 0; i < teamMembers_length; i++) {

      int teamMembers_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations
          teamMembers_it =
              (com.ankamagames.dofus.network.types.game.context.fight.FightTeamMemberInformations)
                  InternalProtocolTypeManager.get(teamMembers_it_typeId);

      teamMembers_it.deserialize(reader);
      this.teamMembers[i] = teamMembers_it;
    }
  }

  @Override
  public String toString() {

    return "FightTeamInformations("
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
        + ')';
  }
}
