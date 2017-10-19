// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightResumeWithSlavesMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight.GameFightResumeMessage {
  public static final int PROTOCOL_ID = 6215;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo[]
      slavesInfo;

  public GameFightResumeWithSlavesMessage()
  {}

  public GameFightResumeWithSlavesMessage(
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
      byte bombCount,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo[]
          slavesInfo)
  {

    super(effects, marks, gameTurn, fightStart, idols, spellCooldowns, summonCount, bombCount);
    this.slavesInfo = slavesInfo;
  }

  public GameFightResumeWithSlavesMessage(
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
      byte bombCount,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo>
          slavesInfo)
  {

    super(effects, marks, gameTurn, fightStart, idols, spellCooldowns, summonCount, bombCount);
    this.slavesInfo =
        slavesInfo.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6215;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_ui16(slavesInfo.length);

    for (int i = 0; i < slavesInfo.length; i++)
  {

      slavesInfo[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int slavesInfo_length = reader.read_ui16();
    this.slavesInfo =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo
            [slavesInfo_length];

    for (int i = 0; i < slavesInfo_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo
          slavesInfo_it =
              new com.ankamagames.dofus.network.types.game.context.fight.GameFightResumeSlaveInfo();

      slavesInfo_it.deserialize(reader);
      this.slavesInfo[i] = slavesInfo_it;
    }
  }

  @Override
  public String toString()
  {

    return "GameFightResumeWithSlavesMessage("
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
        + ", slavesInfo="
        + java.util.Arrays.toString(this.slavesInfo)
        + ')';
  }
}
