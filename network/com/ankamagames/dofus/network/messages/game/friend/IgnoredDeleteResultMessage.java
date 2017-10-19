// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredDeleteResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5677;
  // flag,_loc2_,0
  public boolean success;
  // flag,_loc2_,1
  public boolean session;
  // str
  public java.lang.String name;

  public IgnoredDeleteResultMessage()
  {}

  public IgnoredDeleteResultMessage(boolean success, boolean session, java.lang.String name)
  {
    this.success = success;
    this.session = session;
    this.name = name;
  }

  @Override
  public int getProtocolId()
  {
    return 5677;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.success, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.session, 1);
    writer.write_i8(_loc2_);
    writer.write_str(this.name);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.success = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.session = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.name = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "IgnoredDeleteResultMessage("
        + "success="
        + this.success
        + ", session="
        + this.session
        + ", name="
        + this.name
        + ')';
  }
}
