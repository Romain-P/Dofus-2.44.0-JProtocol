// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolSelectErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6584;
  // flag,_loc2_,0
  public boolean activate;
  // flag,_loc2_,1
  public boolean party;
  // i8
  public byte reason;
  // vi16
  public short idolId;

  public IdolSelectErrorMessage()
  {}

  public IdolSelectErrorMessage(boolean activate, boolean party, byte reason, short idolId)
  {
    this.activate = activate;
    this.party = party;
    this.reason = reason;
    this.idolId = idolId;
  }

  @Override
  public int getProtocolId()
  {
    return 6584;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.activate, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.party, 1);
    writer.write_i8(_loc2_);
    writer.write_i8(this.reason);
    writer.write_vi16(this.idolId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.activate = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.party = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.reason = reader.read_i8();
    this.idolId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "IdolSelectErrorMessage("
        + "activate="
        + this.activate
        + ", party="
        + this.party
        + ", reason="
        + this.reason
        + ", idolId="
        + this.idolId
        + ')';
  }
}
