// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveMultipleElementsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 252;
  // array,f64
  public double[] elementsIds;

  public GameContextRemoveMultipleElementsMessage()
  {}

  public GameContextRemoveMultipleElementsMessage(double[] elementsIds)
  {
    this.elementsIds = elementsIds;
  }

  @Override
  public int getProtocolId()
  {
    return 252;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(elementsIds.length);
    writer.write_array_f64(this.elementsIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int elementsIds_length = reader.read_ui16();
    this.elementsIds = reader.read_array_f64(elementsIds_length);
  }

  @Override
  public String toString()
  {

    return "GameContextRemoveMultipleElementsMessage("
        + "elementsIds="
        + java.util.Arrays.toString(this.elementsIds)
        + ')';
  }
}
