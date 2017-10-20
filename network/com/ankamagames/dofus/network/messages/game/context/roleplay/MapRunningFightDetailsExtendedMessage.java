// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapRunningFightDetailsExtendedMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay
        .MapRunningFightDetailsMessage {
  public static final int PROTOCOL_ID = 6500;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]
      namedPartyTeams;

  public MapRunningFightDetailsExtendedMessage() {}

  public MapRunningFightDetailsExtendedMessage(
      int fightId,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
          attackers,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
          defenders,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]
          namedPartyTeams) {

    super(fightId, attackers, defenders);
    this.namedPartyTeams = namedPartyTeams;
  }

  public MapRunningFightDetailsExtendedMessage(
      int fightId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight
                  .GameFightFighterLightInformations>
          attackers,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight
                  .GameFightFighterLightInformations>
          defenders,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam>
          namedPartyTeams) {

    super(fightId, attackers, defenders);
    this.namedPartyTeams =
        namedPartyTeams.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6500;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(namedPartyTeams.length);

    for (int i = 0; i < namedPartyTeams.length; i++) {

      namedPartyTeams[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int namedPartyTeams_length = reader.read_ui16();
    this.namedPartyTeams =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
            [namedPartyTeams_length];

    for (int i = 0; i < namedPartyTeams_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam
          namedPartyTeams_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeam();

      namedPartyTeams_it.deserialize(reader);
      this.namedPartyTeams[i] = namedPartyTeams_it;
    }
  }

  @Override
  public String toString() {

    return "MapRunningFightDetailsExtendedMessage("
        + "fightId="
        + this.fightId
        + ", attackers="
        + java.util.Arrays.toString(this.attackers)
        + ", defenders="
        + java.util.Arrays.toString(this.defenders)
        + ", namedPartyTeams="
        + java.util.Arrays.toString(this.namedPartyTeams)
        + ')';
  }
}
