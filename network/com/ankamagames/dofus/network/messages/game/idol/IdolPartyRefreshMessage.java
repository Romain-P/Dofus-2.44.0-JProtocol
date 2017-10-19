// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolPartyRefreshMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6583;
  // com.ankamagames.dofus.network.types.game.idol.PartyIdol
  public com.ankamagames.dofus.network.types.game.idol.PartyIdol partyIdol;

  public IdolPartyRefreshMessage()
  {}

  public IdolPartyRefreshMessage(
      com.ankamagames.dofus.network.types.game.idol.PartyIdol partyIdol)
  {
    this.partyIdol = partyIdol;
  }

  @Override
  public int getProtocolId()
  {
    return 6583;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.partyIdol.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.partyIdol = new com.ankamagames.dofus.network.types.game.idol.PartyIdol();
    this.partyIdol.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "IdolPartyRefreshMessage(" + "partyIdol=" + this.partyIdol + ')';
  }
}
