// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightSpectatorJoinMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight.GameFightJoinMessage {
  public static final int PROTOCOL_ID = 6504;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]
      namedPartyTeams;

  public GameFightSpectatorJoinMessage()
  {}

  public GameFightSpectatorJoinMessage(
      boolean isTeamPhase,
      boolean canBeCancelled,
      boolean canSayReady,
      boolean isFightStarted,
      short timeMaxBeforeFightStart,
      byte fightType,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]
          namedPartyTeams)
  {

    super(
        isTeamPhase,
        canBeCancelled,
        canSayReady,
        isFightStarted,
        timeMaxBeforeFightStart,
        fightType);
    this.namedPartyTeams = namedPartyTeams;
  }

  public GameFightSpectatorJoinMessage(
      boolean isTeamPhase,
      boolean canBeCancelled,
      boolean canSayReady,
      boolean isFightStarted,
      short timeMaxBeforeFightStart,
      byte fightType,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam>
          namedPartyTeams)
  {

    super(
        isTeamPhase,
        canBeCancelled,
        canSayReady,
        isFightStarted,
        timeMaxBeforeFightStart,
        fightType);
    this.namedPartyTeams =
        namedPartyTeams.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6504;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(namedPartyTeams.length);

    for (int i = 0; i < namedPartyTeams.length; i++)
  {

      namedPartyTeams[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int namedPartyTeams_length = reader.read_ui16();
    this.namedPartyTeams =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
            [namedPartyTeams_length];

    for (int i = 0; i < namedPartyTeams_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
          namedPartyTeams_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam();

      namedPartyTeams_it.deserialize(reader);
      this.namedPartyTeams[i] = namedPartyTeams_it;
    }
  }

  @Override
  public String toString()
  {

    return "GameFightSpectatorJoinMessage("
        + "isTeamPhase="
        + this.isTeamPhase
        + ", canBeCancelled="
        + this.canBeCancelled
        + ", canSayReady="
        + this.canSayReady
        + ", isFightStarted="
        + this.isFightStarted
        + ", timeMaxBeforeFightStart="
        + this.timeMaxBeforeFightStart
        + ", fightType="
        + this.fightType
        + ", namedPartyTeams="
        + java.util.Arrays.toString(this.namedPartyTeams)
        + ')';
  }
}
