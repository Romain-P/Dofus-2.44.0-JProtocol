// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveMultipleElementsWithEventsMessage
    extends com.ankamagames.dofus.network.messages.game.context
        .GameContextRemoveMultipleElementsMessage {
  public static final int PROTOCOL_ID = 6416;
  // array,i8
  public byte[] elementEventIds;

  public GameContextRemoveMultipleElementsWithEventsMessage() {}

  public GameContextRemoveMultipleElementsWithEventsMessage(
      double[] elementsIds, byte[] elementEventIds) {

    super(elementsIds);
    this.elementEventIds = elementEventIds;
  }

  @Override
  public int getProtocolId() {
    return 6416;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(elementEventIds.length);
    writer.write_array_i8(this.elementEventIds);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int elementEventIds_length = reader.read_ui16();
    this.elementEventIds = reader.read_array_i8(elementEventIds_length);
  }

  @Override
  public String toString() {

    return "GameContextRemoveMultipleElementsWithEventsMessage("
        + "elementsIds="
        + java.util.Arrays.toString(this.elementsIds)
        + ", elementEventIds="
        + +this.elementEventIds.length
        + "b"
        + ')';
  }
}
