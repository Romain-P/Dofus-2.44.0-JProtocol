// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TreasureHuntMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6486;
  // i8
  public byte questType;
  // f64
  public double startMapId;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep
  public com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep[]
      knownStepsList;
  // i8
  public byte totalStepCount;
  // vi32
  public int checkPointCurrent;
  // vi32
  public int checkPointTotal;
  // i32
  public int availableRetryCount;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag
  public com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag[]
      flags;

  public TreasureHuntMessage() {}

  public TreasureHuntMessage(
      byte questType,
      double startMapId,
      com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep[]
          knownStepsList,
      byte totalStepCount,
      int checkPointCurrent,
      int checkPointTotal,
      int availableRetryCount,
      com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag[]
          flags) {
    this.questType = questType;
    this.startMapId = startMapId;
    this.knownStepsList = knownStepsList;
    this.totalStepCount = totalStepCount;
    this.checkPointCurrent = checkPointCurrent;
    this.checkPointTotal = checkPointTotal;
    this.availableRetryCount = availableRetryCount;
    this.flags = flags;
  }

  public TreasureHuntMessage(
      byte questType,
      double startMapId,
      java.util.stream.Stream<
              com.ankamagames
                  .dofus
                  .network
                  .types
                  .game
                  .context
                  .roleplay
                  .treasureHunt
                  .TreasureHuntStep>
          knownStepsList,
      byte totalStepCount,
      int checkPointCurrent,
      int checkPointTotal,
      int availableRetryCount,
      java.util.stream.Stream<
              com.ankamagames
                  .dofus
                  .network
                  .types
                  .game
                  .context
                  .roleplay
                  .treasureHunt
                  .TreasureHuntFlag>
          flags) {
    this.questType = questType;
    this.startMapId = startMapId;
    this.knownStepsList =
        knownStepsList.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep
                    []
                ::new);
    this.totalStepCount = totalStepCount;
    this.checkPointCurrent = checkPointCurrent;
    this.checkPointTotal = checkPointTotal;
    this.availableRetryCount = availableRetryCount;
    this.flags =
        flags.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag
                    []
                ::new);
  }

  @Override
  public int getProtocolId() {
    return 6486;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.questType);
    writer.write_f64(this.startMapId);
    writer.write_ui16(knownStepsList.length);

    for (int i = 0; i < knownStepsList.length; i++) {

      writer.write_ui16(knownStepsList[i].getProtocolId());

      knownStepsList[i].serialize(writer);
    }
    writer.write_i8(this.totalStepCount);
    writer.write_vi32(this.checkPointCurrent);
    writer.write_vi32(this.checkPointTotal);
    writer.write_i32(this.availableRetryCount);
    writer.write_ui16(flags.length);

    for (int i = 0; i < flags.length; i++) {

      flags[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.questType = reader.read_i8();
    this.startMapId = reader.read_f64();

    int knownStepsList_length = reader.read_ui16();
    this.knownStepsList =
        new com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep
            [knownStepsList_length];

    for (int i = 0; i < knownStepsList_length; i++) {

      int knownStepsList_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntStep
          knownStepsList_it =
              (com.ankamagames
                      .dofus
                      .network
                      .types
                      .game
                      .context
                      .roleplay
                      .treasureHunt
                      .TreasureHuntStep)
                  InternalProtocolTypeManager.get(knownStepsList_it_typeId);

      knownStepsList_it.deserialize(reader);
      this.knownStepsList[i] = knownStepsList_it;
    }
    this.totalStepCount = reader.read_i8();
    this.checkPointCurrent = reader.read_vi32();
    this.checkPointTotal = reader.read_vi32();
    this.availableRetryCount = reader.read_i32();

    int flags_length = reader.read_ui16();
    this.flags =
        new com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag
            [flags_length];

    for (int i = 0; i < flags_length; i++) {

      com.ankamagames.dofus.network.types.game.context.roleplay.treasureHunt.TreasureHuntFlag
          flags_it =
              new com.ankamagames
                  .dofus
                  .network
                  .types
                  .game
                  .context
                  .roleplay
                  .treasureHunt
                  .TreasureHuntFlag();

      flags_it.deserialize(reader);
      this.flags[i] = flags_it;
    }
  }

  @Override
  public String toString() {

    return "TreasureHuntMessage("
        + "questType="
        + this.questType
        + ", startMapId="
        + this.startMapId
        + ", knownStepsList="
        + java.util.Arrays.toString(this.knownStepsList)
        + ", totalStepCount="
        + this.totalStepCount
        + ", checkPointCurrent="
        + this.checkPointCurrent
        + ", checkPointTotal="
        + this.checkPointTotal
        + ", availableRetryCount="
        + this.availableRetryCount
        + ", flags="
        + java.util.Arrays.toString(this.flags)
        + ')';
  }
}
