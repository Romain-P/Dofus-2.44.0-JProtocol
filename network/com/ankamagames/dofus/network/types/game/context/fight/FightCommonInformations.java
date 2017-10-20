// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightCommonInformations extends NetworkType {
  public static final int PROTOCOL_ID = 43;
  // i32
  public int fightId;
  // i8
  public byte fightType;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations[] fightTeams;
  // array,vi16
  public short[] fightTeamsPositions;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]
      fightTeamsOptions;

  public FightCommonInformations() {}

  public FightCommonInformations(
      int fightId,
      byte fightType,
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations[] fightTeams,
      short[] fightTeamsPositions,
      com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]
          fightTeamsOptions) {
    this.fightId = fightId;
    this.fightType = fightType;
    this.fightTeams = fightTeams;
    this.fightTeamsPositions = fightTeamsPositions;
    this.fightTeamsOptions = fightTeamsOptions;
  }

  public FightCommonInformations(
      int fightId,
      byte fightType,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations>
          fightTeams,
      short[] fightTeamsPositions,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations>
          fightTeamsOptions) {
    this.fightId = fightId;
    this.fightType = fightType;
    this.fightTeams =
        fightTeams.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations[]::new);
    this.fightTeamsPositions = fightTeamsPositions;
    this.fightTeamsOptions =
        fightTeamsOptions.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 43;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
    writer.write_i8(this.fightType);
    writer.write_ui16(fightTeams.length);

    for (int i = 0; i < fightTeams.length; i++) {

      writer.write_ui16(fightTeams[i].getProtocolId());

      fightTeams[i].serialize(writer);
    }
    writer.write_ui16(fightTeamsPositions.length);
    writer.write_array_vi16(this.fightTeamsPositions);
    writer.write_ui16(fightTeamsOptions.length);

    for (int i = 0; i < fightTeamsOptions.length; i++) {

      fightTeamsOptions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
    this.fightType = reader.read_i8();

    int fightTeams_length = reader.read_ui16();
    this.fightTeams =
        new com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations
            [fightTeams_length];

    for (int i = 0; i < fightTeams_length; i++) {

      int fightTeams_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations fightTeams_it =
          (com.ankamagames.dofus.network.types.game.context.fight.FightTeamInformations)
              InternalProtocolTypeManager.get(fightTeams_it_typeId);

      fightTeams_it.deserialize(reader);
      this.fightTeams[i] = fightTeams_it;
    }

    int fightTeamsPositions_length = reader.read_ui16();
    this.fightTeamsPositions = reader.read_array_vi16(fightTeamsPositions_length);

    int fightTeamsOptions_length = reader.read_ui16();
    this.fightTeamsOptions =
        new com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations
            [fightTeamsOptions_length];

    for (int i = 0; i < fightTeamsOptions_length; i++) {

      com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations
          fightTeamsOptions_it =
              new com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations();

      fightTeamsOptions_it.deserialize(reader);
      this.fightTeamsOptions[i] = fightTeamsOptions_it;
    }
  }

  @Override
  public String toString() {

    return "FightCommonInformations("
        + "fightId="
        + this.fightId
        + ", fightType="
        + this.fightType
        + ", fightTeams="
        + java.util.Arrays.toString(this.fightTeams)
        + ", fightTeamsPositions="
        + java.util.Arrays.toString(this.fightTeamsPositions)
        + ", fightTeamsOptions="
        + java.util.Arrays.toString(this.fightTeamsOptions)
        + ')';
  }
}
