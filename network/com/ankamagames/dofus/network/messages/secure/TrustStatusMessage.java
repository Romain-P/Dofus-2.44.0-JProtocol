// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.secure;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TrustStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6267;
  // flag,_loc2_,0
  public boolean trusted;
  // flag,_loc2_,1
  public boolean certified;

  public TrustStatusMessage() {}

  public TrustStatusMessage(boolean trusted, boolean certified) {
    this.trusted = trusted;
    this.certified = certified;
  }

  @Override
  public int getProtocolId() {
    return 6267;
  }

  @Override
  public void serialize(DataWriter writer) {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.trusted, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.certified, 1);
    writer.write_i8(_loc2_);
  }

  @Override
  public void deserialize(DataReader reader) {

    int _loc2_ = reader.read_i8();
    this.trusted = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.certified = BooleanByteWrapper.getFlag(_loc2_, 1);
  }

  @Override
  public String toString() {

    return "TrustStatusMessage("
        + "trusted="
        + this.trusted
        + ", certified="
        + this.certified
        + ')';
  }
}
