// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionAcknowledgementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 957;
  // bool
  public boolean valid;
  // i8
  public byte actionId;

  public GameActionAcknowledgementMessage()
  {}

  public GameActionAcknowledgementMessage(boolean valid, byte actionId)
  {
    this.valid = valid;
    this.actionId = actionId;
  }

  @Override
  public int getProtocolId()
  {
    return 957;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.valid);
    writer.write_i8(this.actionId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.valid = reader.read_bool();
    this.actionId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameActionAcknowledgementMessage("
        + "valid="
        + this.valid
        + ", actionId="
        + this.actionId
        + ')';
  }
}
