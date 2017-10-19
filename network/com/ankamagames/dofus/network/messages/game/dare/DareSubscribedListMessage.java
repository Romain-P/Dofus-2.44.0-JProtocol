// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareSubscribedListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6658;
  // array,com.ankamagames.dofus.network.types.game.dare.DareInformations
  public com.ankamagames.dofus.network.types.game.dare.DareInformations[] daresFixedInfos;
  // array,com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
  public com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[]
      daresVersatilesInfos;

  public DareSubscribedListMessage()
  {}

  public DareSubscribedListMessage(
      com.ankamagames.dofus.network.types.game.dare.DareInformations[] daresFixedInfos,
      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[]
          daresVersatilesInfos)
  {
    this.daresFixedInfos = daresFixedInfos;
    this.daresVersatilesInfos = daresVersatilesInfos;
  }

  public DareSubscribedListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.dare.DareInformations>
          daresFixedInfos,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations>
          daresVersatilesInfos)
  {
    this.daresFixedInfos =
        daresFixedInfos.toArray(
            com.ankamagames.dofus.network.types.game.dare.DareInformations[]::new);
    this.daresVersatilesInfos =
        daresVersatilesInfos.toArray(
            com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 6658;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(daresFixedInfos.length);

    for (int i = 0; i < daresFixedInfos.length; i++)
  {

      daresFixedInfos[i].serialize(writer);
    }
    writer.write_ui16(daresVersatilesInfos.length);

    for (int i = 0; i < daresVersatilesInfos.length; i++)
  {

      daresVersatilesInfos[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int daresFixedInfos_length = reader.read_ui16();
    this.daresFixedInfos =
        new com.ankamagames.dofus.network.types.game.dare.DareInformations[daresFixedInfos_length];

    for (int i = 0; i < daresFixedInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.dare.DareInformations daresFixedInfos_it =
          new com.ankamagames.dofus.network.types.game.dare.DareInformations();

      daresFixedInfos_it.deserialize(reader);
      this.daresFixedInfos[i] = daresFixedInfos_it;
    }

    int daresVersatilesInfos_length = reader.read_ui16();
    this.daresVersatilesInfos =
        new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
            [daresVersatilesInfos_length];

    for (int i = 0; i < daresVersatilesInfos_length; i++)
  {

      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
          daresVersatilesInfos_it =
              new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations();

      daresVersatilesInfos_it.deserialize(reader);
      this.daresVersatilesInfos[i] = daresVersatilesInfos_it;
    }
  }

  @Override
  public String toString()
  {

    return "DareSubscribedListMessage("
        + "daresFixedInfos="
        + java.util.Arrays.toString(this.daresFixedInfos)
        + ", daresVersatilesInfos="
        + java.util.Arrays.toString(this.daresVersatilesInfos)
        + ')';
  }
}
