// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareInformations extends NetworkType {
  public static final int PROTOCOL_ID = 502;
  // f64
  public double dareId;
  // com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations
      creator;
  // vi64
  public long subscriptionFee;
  // vi64
  public long jackpot;
  // ui16
  public int maxCountWinners;
  // f64
  public double endDate;
  // bool
  public boolean isPrivate;
  // vi32
  public int guildId;
  // vi32
  public int allianceId;
  // array,com.ankamagames.dofus.network.types.game.dare.DareCriteria
  public com.ankamagames.dofus.network.types.game.dare.DareCriteria[] criterions;
  // f64
  public double startDate;

  public DareInformations() {}

  public DareInformations(
      double dareId,
      com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations creator,
      long subscriptionFee,
      long jackpot,
      int maxCountWinners,
      double endDate,
      boolean isPrivate,
      int guildId,
      int allianceId,
      com.ankamagames.dofus.network.types.game.dare.DareCriteria[] criterions,
      double startDate) {
    this.dareId = dareId;
    this.creator = creator;
    this.subscriptionFee = subscriptionFee;
    this.jackpot = jackpot;
    this.maxCountWinners = maxCountWinners;
    this.endDate = endDate;
    this.isPrivate = isPrivate;
    this.guildId = guildId;
    this.allianceId = allianceId;
    this.criterions = criterions;
    this.startDate = startDate;
  }

  public DareInformations(
      double dareId,
      com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations creator,
      long subscriptionFee,
      long jackpot,
      int maxCountWinners,
      double endDate,
      boolean isPrivate,
      int guildId,
      int allianceId,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.dare.DareCriteria>
          criterions,
      double startDate) {
    this.dareId = dareId;
    this.creator = creator;
    this.subscriptionFee = subscriptionFee;
    this.jackpot = jackpot;
    this.maxCountWinners = maxCountWinners;
    this.endDate = endDate;
    this.isPrivate = isPrivate;
    this.guildId = guildId;
    this.allianceId = allianceId;
    this.criterions =
        criterions.toArray(com.ankamagames.dofus.network.types.game.dare.DareCriteria[]::new);
    this.startDate = startDate;
  }

  @Override
  public int getProtocolId() {
    return 502;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_f64(this.dareId);
    this.creator.serialize(writer);
    writer.write_vi64(this.subscriptionFee);
    writer.write_vi64(this.jackpot);
    writer.write_ui16(this.maxCountWinners);
    writer.write_f64(this.endDate);
    writer.write_bool(this.isPrivate);
    writer.write_vi32(this.guildId);
    writer.write_vi32(this.allianceId);
    writer.write_ui16(criterions.length);

    for (int i = 0; i < criterions.length; i++) {

      criterions[i].serialize(writer);
    }
    writer.write_f64(this.startDate);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.dareId = reader.read_f64();
    this.creator =
        new com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations();
    this.creator.deserialize(reader);
    this.subscriptionFee = reader.read_vi64();
    this.jackpot = reader.read_vi64();
    this.maxCountWinners = reader.read_ui16();
    this.endDate = reader.read_f64();
    this.isPrivate = reader.read_bool();
    this.guildId = reader.read_vi32();
    this.allianceId = reader.read_vi32();

    int criterions_length = reader.read_ui16();
    this.criterions =
        new com.ankamagames.dofus.network.types.game.dare.DareCriteria[criterions_length];

    for (int i = 0; i < criterions_length; i++) {

      com.ankamagames.dofus.network.types.game.dare.DareCriteria criterions_it =
          new com.ankamagames.dofus.network.types.game.dare.DareCriteria();

      criterions_it.deserialize(reader);
      this.criterions[i] = criterions_it;
    }
    this.startDate = reader.read_f64();
  }

  @Override
  public String toString() {

    return "DareInformations("
        + "dareId="
        + this.dareId
        + ", creator="
        + this.creator
        + ", subscriptionFee="
        + this.subscriptionFee
        + ", jackpot="
        + this.jackpot
        + ", maxCountWinners="
        + this.maxCountWinners
        + ", endDate="
        + this.endDate
        + ", isPrivate="
        + this.isPrivate
        + ", guildId="
        + this.guildId
        + ", allianceId="
        + this.allianceId
        + ", criterions="
        + java.util.Arrays.toString(this.criterions)
        + ", startDate="
        + this.startDate
        + ')';
  }
}
