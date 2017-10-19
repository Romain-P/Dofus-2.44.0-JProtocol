// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.game.actions;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractGameActionWithAckMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 1001;
  // i16
  public short waitAckId;

  public AbstractGameActionWithAckMessage()
  {}

  public AbstractGameActionWithAckMessage(short actionId, double sourceId, short waitAckId)
  {

    super(actionId, sourceId);
    this.waitAckId = waitAckId;
  }

  @Override
  public int getProtocolId()
  {
    return 1001;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i16(this.waitAckId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.waitAckId = reader.read_i16();
  }

  @Override
  public String toString()
  {

    return "AbstractGameActionWithAckMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", waitAckId="
        + this.waitAckId
        + ')';
  }
}
