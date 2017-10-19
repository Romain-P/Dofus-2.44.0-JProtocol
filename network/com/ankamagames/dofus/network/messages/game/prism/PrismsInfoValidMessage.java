// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismsInfoValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6451;
  // array,com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation
  public com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation[] fights;

  public PrismsInfoValidMessage()
  {}

  public PrismsInfoValidMessage(
      com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation[] fights)
  {
    this.fights = fights;
  }

  public PrismsInfoValidMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation>
          fights)
  {
    this.fights =
        fights.toArray(
            com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6451;
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
        new com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation[fights_length];

    for (int i = 0; i < fights_length; i++)
  {

      com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation fights_it =
          new com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation();

      fights_it.deserialize(reader);
      this.fights[i] = fights_it;
    }
  }

  @Override
  public String toString()
  {

    return "PrismsInfoValidMessage(" + "fights=" + java.util.Arrays.toString(this.fights) + ')';
  }
}
