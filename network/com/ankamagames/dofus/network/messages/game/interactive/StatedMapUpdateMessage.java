// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.interactive;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatedMapUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5716;
  // array,com.ankamagames.dofus.network.types.game.interactive.StatedElement
  public com.ankamagames.dofus.network.types.game.interactive.StatedElement[] statedElements;

  public StatedMapUpdateMessage() {}

  public StatedMapUpdateMessage(
      com.ankamagames.dofus.network.types.game.interactive.StatedElement[] statedElements) {
    this.statedElements = statedElements;
  }

  public StatedMapUpdateMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.interactive.StatedElement>
          statedElements) {
    this.statedElements =
        statedElements.toArray(
            com.ankamagames.dofus.network.types.game.interactive.StatedElement[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5716;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(statedElements.length);

    for (int i = 0; i < statedElements.length; i++) {

      statedElements[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int statedElements_length = reader.read_ui16();
    this.statedElements =
        new com.ankamagames.dofus.network.types.game.interactive.StatedElement
            [statedElements_length];

    for (int i = 0; i < statedElements_length; i++) {

      com.ankamagames.dofus.network.types.game.interactive.StatedElement statedElements_it =
          new com.ankamagames.dofus.network.types.game.interactive.StatedElement();

      statedElements_it.deserialize(reader);
      this.statedElements[i] = statedElements_it;
    }
  }

  @Override
  public String toString() {

    return "StatedMapUpdateMessage("
        + "statedElements="
        + java.util.Arrays.toString(this.statedElements)
        + ')';
  }
}
