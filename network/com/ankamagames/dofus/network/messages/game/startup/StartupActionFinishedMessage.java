// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionFinishedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1304;
  // flag,_loc2_,0
  public boolean success;
  // flag,_loc2_,1
  public boolean automaticAction;
  // i32
  public int actionId;

  public StartupActionFinishedMessage()
  {}

  public StartupActionFinishedMessage(boolean success, boolean automaticAction, int actionId)
  {
    this.success = success;
    this.automaticAction = automaticAction;
    this.actionId = actionId;
  }

  @Override
  public int getProtocolId()
  {
    return 1304;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.success, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.automaticAction, 1);
    writer.write_i8(_loc2_);
    writer.write_i32(this.actionId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.success = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.automaticAction = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.actionId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "StartupActionFinishedMessage("
        + "success="
        + this.success
        + ", automaticAction="
        + this.automaticAction
        + ", actionId="
        + this.actionId
        + ')';
  }
}
