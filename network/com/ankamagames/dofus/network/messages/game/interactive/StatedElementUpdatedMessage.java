// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatedElementUpdatedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5709;
  // com.ankamagames.dofus.network.types.game.interactive.StatedElement
  public com.ankamagames.dofus.network.types.game.interactive.StatedElement statedElement;

  public StatedElementUpdatedMessage()
  {}

  public StatedElementUpdatedMessage(
      com.ankamagames.dofus.network.types.game.interactive.StatedElement statedElement)
  {
    this.statedElement = statedElement;
  }

  @Override
  public int getProtocolId()
  {
    return 5709;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.statedElement.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.statedElement = new com.ankamagames.dofus.network.types.game.interactive.StatedElement();
    this.statedElement.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "StatedElementUpdatedMessage(" + "statedElement=" + this.statedElement + ')';
  }
}
