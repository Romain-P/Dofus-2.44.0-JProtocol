// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareInformationsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6656;
  // com.ankamagames.dofus.network.types.game.dare.DareInformations
  public com.ankamagames.dofus.network.types.game.dare.DareInformations dareFixedInfos;
  // com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
  public com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
      dareVersatilesInfos;

  public DareInformationsMessage()
  {}

  public DareInformationsMessage(
      com.ankamagames.dofus.network.types.game.dare.DareInformations dareFixedInfos,
      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations dareVersatilesInfos)
  {
    this.dareFixedInfos = dareFixedInfos;
    this.dareVersatilesInfos = dareVersatilesInfos;
  }

  @Override
  public int getProtocolId()
  {
    return 6656;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.dareFixedInfos.serialize(writer);
    this.dareVersatilesInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dareFixedInfos = new com.ankamagames.dofus.network.types.game.dare.DareInformations();
    this.dareFixedInfos.deserialize(reader);
    this.dareVersatilesInfos =
        new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations();
    this.dareVersatilesInfos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "DareInformationsMessage("
        + "dareFixedInfos="
        + this.dareFixedInfos
        + ", dareVersatilesInfos="
        + this.dareVersatilesInfos
        + ')';
  }
}
