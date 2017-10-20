// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FightExternalInformations extends NetworkType {
  public static final int PROTOCOL_ID = 117;
  // i32
  public int fightId;
  // i8
  public byte fightType;
  // i32
  public int fightStart;
  // bool
  public boolean fightSpectatorLocked;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations,2
  public com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations[]
      fightTeams;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations,2
  public com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]
      fightTeamsOptions;

  public FightExternalInformations() {}

  public FightExternalInformations(
      int fightId,
      byte fightType,
      int fightStart,
      boolean fightSpectatorLocked,
      com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations[]
          fightTeams,
      com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]
          fightTeamsOptions) {
    this.fightId = fightId;
    this.fightType = fightType;
    this.fightStart = fightStart;
    this.fightSpectatorLocked = fightSpectatorLocked;
    this.fightTeams = fightTeams;
    this.fightTeamsOptions = fightTeamsOptions;
  }

  public FightExternalInformations(
      int fightId,
      byte fightType,
      int fightStart,
      boolean fightSpectatorLocked,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations>
          fightTeams,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations>
          fightTeamsOptions) {
    this.fightId = fightId;
    this.fightType = fightType;
    this.fightStart = fightStart;
    this.fightSpectatorLocked = fightSpectatorLocked;
    this.fightTeams =
        fightTeams.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations[]
                ::new);
    this.fightTeamsOptions =
        fightTeamsOptions.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightOptionsInformations[]::new);
  }

  @Override
  public int getProtocolId() {
    return 117;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.fightId);
    writer.write_i8(this.fightType);
    writer.write_i32(this.fightStart);
    writer.write_bool(this.fightSpectatorLocked);

    for (int i = 0; i < 2; i++) {

      fightTeams[i].serialize(writer);
    }

    for (int i = 0; i < 2; i++) {

      fightTeamsOptions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightId = reader.read_i32();
    this.fightType = reader.read_i8();
    this.fightStart = reader.read_i32();
    this.fightSpectatorLocked = reader.read_bool();

    int fightTeams_length = 2;
    this.fightTeams =
        new com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations
            [fightTeams_length];

    for (int i = 0; i < fightTeams_length; i++) {

      com.ankamagames.dofus.network.types.game.context.fight.FightTeamLightInformations
          fightTeams_it =
              new com.ankamagames.dofus.network.types.game.context.fight
                  .FightTeamLightInformations();

      fightTeams_it.deserialize(reader);
      this.fightTeams[i] = fightTeams_it;
    }

    int fightTeamsOptions_length = 2;
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

    return "FightExternalInformations("
        + "fightId="
        + this.fightId
        + ", fightType="
        + this.fightType
        + ", fightStart="
        + this.fightStart
        + ", fightSpectatorLocked="
        + this.fightSpectatorLocked
        + ", fightTeams="
        + java.util.Arrays.toString(this.fightTeams)
        + ", fightTeamsOptions="
        + java.util.Arrays.toString(this.fightTeamsOptions)
        + ')';
  }
}
