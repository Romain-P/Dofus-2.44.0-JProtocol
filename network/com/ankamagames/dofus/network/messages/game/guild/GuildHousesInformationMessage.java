// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildHousesInformationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5919;
  // array,com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild
  public com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild[]
      housesInformations;

  public GuildHousesInformationMessage()
  {}

  public GuildHousesInformationMessage(
      com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild[]
          housesInformations)
  {
    this.housesInformations = housesInformations;
  }

  public GuildHousesInformationMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild>
          housesInformations)
  {
    this.housesInformations =
        housesInformations.toArray(
            com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5919;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(housesInformations.length);

    for (int i = 0; i < housesInformations.length; i++)
  {

      housesInformations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int housesInformations_length = reader.read_ui16();
    this.housesInformations =
        new com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild
            [housesInformations_length];

    for (int i = 0; i < housesInformations_length; i++)
  {

      com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild
          housesInformations_it =
              new com.ankamagames.dofus.network.types.game.house.HouseInformationsForGuild();

      housesInformations_it.deserialize(reader);
      this.housesInformations[i] = housesInformations_it;
    }
  }

  @Override
  public String toString()
  {

    return "GuildHousesInformationMessage("
        + "housesInformations="
        + java.util.Arrays.toString(this.housesInformations)
        + ')';
  }
}
