// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameEntityDispositionMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5693;
  // com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
  public com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
      disposition;

  public GameEntityDispositionMessage()
  {}

  public GameEntityDispositionMessage(
      com.ankamagames.dofus.network.types.game.context.IdentifiedEntityDispositionInformations
          disposition)
  {
    this.disposition = disposition;
  }

  @Override
  public int getProtocolId()
  {
    return 5693;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.disposition.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.disposition =
        new com.ankamagames.dofus.network.types.game.context
            .IdentifiedEntityDispositionInformations();
    this.disposition.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameEntityDispositionMessage(" + "disposition=" + this.disposition + ')';
  }
}
