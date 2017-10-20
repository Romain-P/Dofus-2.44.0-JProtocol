// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightSpectateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6069;
  // array,com.ankamagames.dofus.network.types.game.action.fight.FightDispellableEffectExtendedInformations
  public com.ankamagames.dofus.network.types.game.action.fight
          .FightDispellableEffectExtendedInformations[]
      effects;
  // array,com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark
  public com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark[] marks;
  // vi16
  public short gameTurn;
  // i32
  public int fightStart;
  // array,com.ankamagames.dofus.network.types.game.idol.Idol
  public com.ankamagames.dofus.network.types.game.idol.Idol[] idols;

  public GameFightSpectateMessage() {}

  public GameFightSpectateMessage(
      com.ankamagames.dofus.network.types.game.action.fight
                  .FightDispellableEffectExtendedInformations
              []
          effects,
      com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark[] marks,
      short gameTurn,
      int fightStart,
      com.ankamagames.dofus.network.types.game.idol.Idol[] idols) {
    this.effects = effects;
    this.marks = marks;
    this.gameTurn = gameTurn;
    this.fightStart = fightStart;
    this.idols = idols;
  }

  public GameFightSpectateMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.action.fight
                  .FightDispellableEffectExtendedInformations>
          effects,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark>
          marks,
      short gameTurn,
      int fightStart,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.idol.Idol> idols) {
    this.effects =
        effects.toArray(
            com.ankamagames.dofus.network.types.game.action.fight
                        .FightDispellableEffectExtendedInformations
                    []
                ::new);
    this.marks =
        marks.toArray(com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark[]::new);
    this.gameTurn = gameTurn;
    this.fightStart = fightStart;
    this.idols = idols.toArray(com.ankamagames.dofus.network.types.game.idol.Idol[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6069;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(effects.length);

    for (int i = 0; i < effects.length; i++) {

      effects[i].serialize(writer);
    }
    writer.write_ui16(marks.length);

    for (int i = 0; i < marks.length; i++) {

      marks[i].serialize(writer);
    }
    writer.write_vi16(this.gameTurn);
    writer.write_i32(this.fightStart);
    writer.write_ui16(idols.length);

    for (int i = 0; i < idols.length; i++) {

      idols[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int effects_length = reader.read_ui16();
    this.effects =
        new com.ankamagames.dofus.network.types.game.action.fight
                .FightDispellableEffectExtendedInformations[effects_length];

    for (int i = 0; i < effects_length; i++) {

      com.ankamagames.dofus.network.types.game.action.fight
              .FightDispellableEffectExtendedInformations
          effects_it =
              new com.ankamagames.dofus.network.types.game.action.fight
                  .FightDispellableEffectExtendedInformations();

      effects_it.deserialize(reader);
      this.effects[i] = effects_it;
    }

    int marks_length = reader.read_ui16();
    this.marks =
        new com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark[marks_length];

    for (int i = 0; i < marks_length; i++) {

      com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark marks_it =
          new com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark();

      marks_it.deserialize(reader);
      this.marks[i] = marks_it;
    }
    this.gameTurn = reader.read_vi16();
    this.fightStart = reader.read_i32();

    int idols_length = reader.read_ui16();
    this.idols = new com.ankamagames.dofus.network.types.game.idol.Idol[idols_length];

    for (int i = 0; i < idols_length; i++) {

      com.ankamagames.dofus.network.types.game.idol.Idol idols_it =
          new com.ankamagames.dofus.network.types.game.idol.Idol();

      idols_it.deserialize(reader);
      this.idols[i] = idols_it;
    }
  }

  @Override
  public String toString() {

    return "GameFightSpectateMessage("
        + "effects="
        + java.util.Arrays.toString(this.effects)
        + ", marks="
        + java.util.Arrays.toString(this.marks)
        + ", gameTurn="
        + this.gameTurn
        + ", fightStart="
        + this.fightStart
        + ", idols="
        + java.util.Arrays.toString(this.idols)
        + ')';
  }
}
