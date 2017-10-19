// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagFurnituresMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6634;
  // array,com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation
  public com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation[]
      furnituresInfos;

  public HavenBagFurnituresMessage()
  {}

  public HavenBagFurnituresMessage(
      com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation[]
          furnituresInfos)
  {
    this.furnituresInfos = furnituresInfos;
  }

  public HavenBagFurnituresMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation>
          furnituresInfos)
  {
    this.furnituresInfos =
        furnituresInfos.toArray(
            com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6634;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(furnituresInfos.length);

    for (int i = 0; i < furnituresInfos.length; i++)
  {

      furnituresInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int furnituresInfos_length = reader.read_ui16();
    this.furnituresInfos =
        new com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation
            [furnituresInfos_length];

    for (int i = 0; i < furnituresInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation
          furnituresInfos_it =
              new com.ankamagames.dofus.network.types.game.guild.HavenBagFurnitureInformation();

      furnituresInfos_it.deserialize(reader);
      this.furnituresInfos[i] = furnituresInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "HavenBagFurnituresMessage("
        + "furnituresInfos="
        + java.util.Arrays.toString(this.furnituresInfos)
        + ')';
  }
}
