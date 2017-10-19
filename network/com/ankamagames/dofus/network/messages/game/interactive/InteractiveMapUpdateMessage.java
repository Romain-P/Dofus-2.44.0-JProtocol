// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class InteractiveMapUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5002;
  // array,com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
  public com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[]
      interactiveElements;

  public InteractiveMapUpdateMessage()
  {}

  public InteractiveMapUpdateMessage(
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[]
          interactiveElements)
  {
    this.interactiveElements = interactiveElements;
  }

  public InteractiveMapUpdateMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.interactive.InteractiveElement>
          interactiveElements)
  {
    this.interactiveElements =
        interactiveElements.toArray(
            com.ankamagames.dofus.network.types.game.interactive.InteractiveElement[]::new);
  }

  @Override
  public int getProtocolId()
  {
    return 5002;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(interactiveElements.length);

    for (int i = 0; i < interactiveElements.length; i++)
  {

      writer.write_ui16(interactiveElements[i].getProtocolId());

      interactiveElements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int interactiveElements_length = reader.read_ui16();
    this.interactiveElements =
        new com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
            [interactiveElements_length];

    for (int i = 0; i < interactiveElements_length; i++)
  {

      int interactiveElements_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.interactive.InteractiveElement
          interactiveElements_it =
              (com.ankamagames.dofus.network.types.game.interactive.InteractiveElement)
                  InternalProtocolTypeManager.get(interactiveElements_it_typeId);

      interactiveElements_it.deserialize(reader);
      this.interactiveElements[i] = interactiveElements_it;
    }
  }

  @Override
  public String toString()
  {

    return "InteractiveMapUpdateMessage("
        + "interactiveElements="
        + java.util.Arrays.toString(this.interactiveElements)
        + ')';
  }
}
