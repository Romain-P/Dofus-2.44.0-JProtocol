// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.dare;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DareSubscribedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6660;
  // flag,_loc2_,0
  public boolean success;
  // flag,_loc2_,1
  public boolean subscribe;
  // f64
  public double dareId;
  // com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
  public com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations
      dareVersatilesInfos;

  public DareSubscribedMessage()
  {}

  public DareSubscribedMessage(
      boolean success,
      boolean subscribe,
      double dareId,
      com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations dareVersatilesInfos)
  {
    this.success = success;
    this.subscribe = subscribe;
    this.dareId = dareId;
    this.dareVersatilesInfos = dareVersatilesInfos;
  }

  @Override
  public int getProtocolId()
  {
    return 6660;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.success, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.subscribe, 1);
    writer.write_i8(_loc2_);
    writer.write_f64(this.dareId);
    this.dareVersatilesInfos.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.success = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.subscribe = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.dareId = reader.read_f64();
    this.dareVersatilesInfos =
        new com.ankamagames.dofus.network.types.game.dare.DareVersatileInformations();
    this.dareVersatilesInfos.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "DareSubscribedMessage("
        + "success="
        + this.success
        + ", subscribe="
        + this.subscribe
        + ", dareId="
        + this.dareId
        + ", dareVersatilesInfos="
        + this.dareVersatilesInfos
        + ')';
  }
}
