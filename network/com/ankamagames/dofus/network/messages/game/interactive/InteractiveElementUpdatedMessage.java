// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveElementUpdatedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5708;
  // com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
  public com.ankamagames.dofus.network.types.game.interactive.InteractiveElement interactiveElement;

  public InteractiveElementUpdatedMessage()
  {}

  public InteractiveElementUpdatedMessage(
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElement interactiveElement)
  {
    this.interactiveElement = interactiveElement;
  }

  @Override
  public int getProtocolId()
  {
    return 5708;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.interactiveElement.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.interactiveElement =
        new com.ankamagames.dofus.network.types.game.interactive.InteractiveElement();
    this.interactiveElement.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "InteractiveElementUpdatedMessage("
        + "interactiveElement="
        + this.interactiveElement
        + ')';
  }
}
