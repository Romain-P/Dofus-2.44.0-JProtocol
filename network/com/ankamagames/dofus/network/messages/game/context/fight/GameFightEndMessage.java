// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightEndMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 720;
  // i32
  public int duration;
  // i16
  public short ageBonus;
  // i16
  public short lootShareLimitMalus;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry
  public com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry[] results;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeamWithOutcome
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeamWithOutcome[]
      namedPartyTeamsOutcomes;

  public GameFightEndMessage() {}

  public GameFightEndMessage(
      int duration,
      short ageBonus,
      short lootShareLimitMalus,
      com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry[] results,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeamWithOutcome[]
          namedPartyTeamsOutcomes) {
    this.duration = duration;
    this.ageBonus = ageBonus;
    this.lootShareLimitMalus = lootShareLimitMalus;
    this.results = results;
    this.namedPartyTeamsOutcomes = namedPartyTeamsOutcomes;
  }

  public GameFightEndMessage(
      int duration,
      short ageBonus,
      short lootShareLimitMalus,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry>
          results,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .NamedPartyTeamWithOutcome>
          namedPartyTeamsOutcomes) {
    this.duration = duration;
    this.ageBonus = ageBonus;
    this.lootShareLimitMalus = lootShareLimitMalus;
    this.results =
        results.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry[]::new);
    this.namedPartyTeamsOutcomes =
        namedPartyTeamsOutcomes.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party
                        .NamedPartyTeamWithOutcome
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 720;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i32(this.duration);
    writer.write_i16(this.ageBonus);
    writer.write_i16(this.lootShareLimitMalus);
    writer.write_ui16(results.length);

    for (int i = 0; i < results.length; i++) {

      writer.write_ui16(results[i].getProtocolId());

      results[i].serialize(writer);
    }
    writer.write_ui16(namedPartyTeamsOutcomes.length);

    for (int i = 0; i < namedPartyTeamsOutcomes.length; i++) {

      namedPartyTeamsOutcomes[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.duration = reader.read_i32();
    this.ageBonus = reader.read_i16();
    this.lootShareLimitMalus = reader.read_i16();

    int results_length = reader.read_ui16();
    this.results =
        new com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry
            [results_length];

    for (int i = 0; i < results_length; i++) {

      int results_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry results_it =
          (com.ankamagames.dofus.network.types.game.context.fight.FightResultListEntry)
              InternalProtocolTypeManager.get(results_it_typeId);

      results_it.deserialize(reader);
      this.results[i] = results_it;
    }

    int namedPartyTeamsOutcomes_length = reader.read_ui16();
    this.namedPartyTeamsOutcomes =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party
                .NamedPartyTeamWithOutcome[namedPartyTeamsOutcomes_length];

    for (int i = 0; i < namedPartyTeamsOutcomes_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.NamedPartyTeamWithOutcome
          namedPartyTeamsOutcomes_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party
                  .NamedPartyTeamWithOutcome();

      namedPartyTeamsOutcomes_it.deserialize(reader);
      this.namedPartyTeamsOutcomes[i] = namedPartyTeamsOutcomes_it;
    }
  }

  @Override
  public String toString() {

    return "GameFightEndMessage("
        + "duration="
        + this.duration
        + ", ageBonus="
        + this.ageBonus
        + ", lootShareLimitMalus="
        + this.lootShareLimitMalus
        + ", results="
        + java.util.Arrays.toString(this.results)
        + ", namedPartyTeamsOutcomes="
        + java.util.Arrays.toString(this.namedPartyTeamsOutcomes)
        + ')';
  }
}
