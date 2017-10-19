// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapRunningFightDetailsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5751;
  // i32
  public int fightId;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
      attackers;
  // array,com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
      defenders;

  public MapRunningFightDetailsMessage()
  {}

  public MapRunningFightDetailsMessage(
      int fightId,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
          attackers,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations[]
          defenders)
  {
    this.fightId = fightId;
    this.attackers = attackers;
    this.defenders = defenders;
  }

  public MapRunningFightDetailsMessage(
      int fightId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight
                  .GameFightFighterLightInformations>
          attackers,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight
                  .GameFightFighterLightInformations>
          defenders)
  {
    this.fightId = fightId;
    this.attackers =
        attackers.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
                    []
                ::new);
    this.defenders =
        defenders.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5751;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.fightId);
    writer.write_ui16(attackers.length);

    for (int i = 0; i < attackers.length; i++)
  {

      writer.write_ui16(attackers[i].getProtocolId());

      attackers[i].serialize(writer);
    }
    writer.write_ui16(defenders.length);

    for (int i = 0; i < defenders.length; i++)
  {

      writer.write_ui16(defenders[i].getProtocolId());

      defenders[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fightId = reader.read_i32();

    int attackers_length = reader.read_ui16();
    this.attackers =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
            [attackers_length];

    for (int i = 0; i < attackers_length; i++)
  {

      int attackers_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
          attackers_it =
              (com.ankamagames.dofus.network.types.game.context.fight
                      .GameFightFighterLightInformations)
                  InternalProtocolTypeManager.get(attackers_it_typeId);

      attackers_it.deserialize(reader);
      this.attackers[i] = attackers_it;
    }

    int defenders_length = reader.read_ui16();
    this.defenders =
        new com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
            [defenders_length];

    for (int i = 0; i < defenders_length; i++)
  {

      int defenders_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterLightInformations
          defenders_it =
              (com.ankamagames.dofus.network.types.game.context.fight
                      .GameFightFighterLightInformations)
                  InternalProtocolTypeManager.get(defenders_it_typeId);

      defenders_it.deserialize(reader);
      this.defenders[i] = defenders_it;
    }
  }

  @Override
  public String toString()
  {

    return "MapRunningFightDetailsMessage("
        + "fightId="
        + this.fightId
        + ", attackers="
        + java.util.Arrays.toString(this.attackers)
        + ", defenders="
        + java.util.Arrays.toString(this.defenders)
        + ')';
  }
}
