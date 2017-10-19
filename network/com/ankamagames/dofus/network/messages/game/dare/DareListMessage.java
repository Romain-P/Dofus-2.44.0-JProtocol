// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6661;
  // array,com.ankamagames.dofus.network.types.game.dare.DareInformations
  public com.ankamagames.dofus.network.types.game.dare.DareInformations[] dares;

  public DareListMessage()
  {}

  public DareListMessage(com.ankamagames.dofus.network.types.game.dare.DareInformations[] dares)
  {
    this.dares = dares;
  }

  public DareListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.dare.DareInformations>
          dares)
  {
    this.dares =
        dares.toArray(com.ankamagames.dofus.network.types.game.dare.DareInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6661;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(dares.length);

    for (int i = 0; i < dares.length; i++)
  {

      dares[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int dares_length = reader.read_ui16();
    this.dares = new com.ankamagames.dofus.network.types.game.dare.DareInformations[dares_length];

    for (int i = 0; i < dares_length; i++)
  {

      com.ankamagames.dofus.network.types.game.dare.DareInformations dares_it =
          new com.ankamagames.dofus.network.types.game.dare.DareInformations();

      dares_it.deserialize(reader);
      this.dares[i] = dares_it;
    }
  }

  @Override
  public String toString()
  {

    return "DareListMessage(" + "dares=" + java.util.Arrays.toString(this.dares) + ')';
  }
}
