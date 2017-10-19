// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolPartyLostMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6580;
  // vi16
  public short idolId;

  public IdolPartyLostMessage()
  {}

  public IdolPartyLostMessage(short idolId)
  {
    this.idolId = idolId;
  }

  @Override
  public int getProtocolId()
  {
    return 6580;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.idolId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.idolId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "IdolPartyLostMessage(" + "idolId=" + this.idolId + ')';
  }
}