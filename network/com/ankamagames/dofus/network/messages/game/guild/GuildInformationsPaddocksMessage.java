// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInformationsPaddocksMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5959;
  // i8
  public byte nbPaddockMax;
  // array,com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations
  public com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations[]
      paddocksInformations;

  public GuildInformationsPaddocksMessage()
  {}

  public GuildInformationsPaddocksMessage(
      byte nbPaddockMax,
      com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations[]
          paddocksInformations)
  {
    this.nbPaddockMax = nbPaddockMax;
    this.paddocksInformations = paddocksInformations;
  }

  public GuildInformationsPaddocksMessage(
      byte nbPaddockMax,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations>
          paddocksInformations)
  {
    this.nbPaddockMax = nbPaddockMax;
    this.paddocksInformations =
        paddocksInformations.toArray(
            com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5959;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.nbPaddockMax);
    writer.write_ui16(paddocksInformations.length);

    for (int i = 0; i < paddocksInformations.length; i++)
  {

      paddocksInformations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.nbPaddockMax = reader.read_i8();

    int paddocksInformations_length = reader.read_ui16();
    this.paddocksInformations =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations
            [paddocksInformations_length];

    for (int i = 0; i < paddocksInformations_length; i++)
  {

      com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations
          paddocksInformations_it =
              new com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations();

      paddocksInformations_it.deserialize(reader);
      this.paddocksInformations[i] = paddocksInformations_it;
    }
  }

  @Override
  public String toString()
  {

    return "GuildInformationsPaddocksMessage("
        + "nbPaddockMax="
        + this.nbPaddockMax
        + ", paddocksInformations="
        + java.util.Arrays.toString(this.paddocksInformations)
        + ')';
  }
}
