// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightResumeMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight.GameFightSpectateMessage {
  public static final int PROTOCOL_ID = 6067;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]
      spellCooldowns;
  // i8
  public byte summonCount;
  // i8
  public byte bombCount;

  public GameFightResumeMessage()
  {}

  public GameFightResumeMessage(
      com.ankamagames.dofus.network.types.game.action.fight
                  .FightDispellableEffectExtendedInformations
              []
          effects,
      com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark[] marks,
      short gameTurn,
      int fightStart,
      com.ankamagames.dofus.network.types.game.idol.Idol[] idols,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]
          spellCooldowns,
      byte summonCount,
      byte bombCount)
  {

    super(effects, marks, gameTurn, fightStart, idols);
    this.spellCooldowns = spellCooldowns;
    this.summonCount = summonCount;
    this.bombCount = bombCount;
  }

  public GameFightResumeMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.action.fight
                  .FightDispellableEffectExtendedInformations>
          effects,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.actions.fight.GameActionMark>
          marks,
      short gameTurn,
      int fightStart,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.idol.Idol> idols,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown>
          spellCooldowns,
      byte summonCount,
      byte bombCount)
  {

    super(effects, marks, gameTurn, fightStart, idols);
    this.spellCooldowns =
        spellCooldowns.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown[]::new);
    this.summonCount = summonCount;
    this.bombCount = bombCount;
  }

  @Override
  public int getProtocolId()
  {
    return 6067;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(spellCooldowns.length);

    for (int i = 0; i < spellCooldowns.length; i++)
  {

      spellCooldowns[i].serialize(writer);
    }
    writer.write_i8(this.summonCount);
    writer.write_i8(this.bombCount);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int spellCooldowns_length = reader.read_ui16();
    this.spellCooldowns =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
            [spellCooldowns_length];

    for (int i = 0; i < spellCooldowns_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown
          spellCooldowns_it =
              new com.ankamagames.dofus.network.types.game.context.fight.GameFightSpellCooldown();

      spellCooldowns_it.deserialize(reader);
      this.spellCooldowns[i] = spellCooldowns_it;
    }
    this.summonCount = reader.read_i8();
    this.bombCount = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameFightResumeMessage("
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
        + ", spellCooldowns="
        + java.util.Arrays.toString(this.spellCooldowns)
        + ", summonCount="
        + this.summonCount
        + ", bombCount="
        + this.bombCount
        + ')';
  }
}
