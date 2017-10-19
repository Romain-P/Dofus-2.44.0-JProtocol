// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapRunningFightListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5743;
  // array,com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations
  public com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations[] fights;

  public MapRunningFightListMessage()
  {}

  public MapRunningFightListMessage(
      com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations[] fights)
  {
    this.fights = fights;
  }

  public MapRunningFightListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations>
          fights)
  {
    this.fights =
        fights.toArray(
            com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations[]
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5743;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(fights.length);

    for (int i = 0; i < fights.length; i++)
  {

      fights[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int fights_length = reader.read_ui16();
    this.fights =
        new com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations
            [fights_length];

    for (int i = 0; i < fights_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations fights_it =
          new com.ankamagames.dofus.network.types.game.context.fight.FightExternalInformations();

      fights_it.deserialize(reader);
      this.fights[i] = fights_it;
    }
  }

  @Override
  public String toString()
  {

    return "MapRunningFightListMessage(" + "fights=" + java.util.Arrays.toString(this.fights) + ')';
  }
}
