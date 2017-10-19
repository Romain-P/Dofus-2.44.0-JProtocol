// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareVersatileListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6657;
  // array,com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
  public com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[] dares;

  public DareVersatileListMessage()
  {}

  public DareVersatileListMessage(
      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[] dares)
  {
    this.dares = dares;
  }

  public DareVersatileListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations>
          dares)
  {
    this.dares =
        dares.toArray(
            com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6657;
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
    this.dares =
        new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[dares_length];

    for (int i = 0; i < dares_length; i++)
  {

      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations dares_it =
          new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations();

      dares_it.deserialize(reader);
      this.dares[i] = dares_it;
    }
  }

  @Override
  public String toString()
  {

    return "DareVersatileListMessage(" + "dares=" + java.util.Arrays.toString(this.dares) + ')';
  }
}
