// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextRemoveElementWithEventMessage
    extends com.ankamagames.dofus.network.messages.game.context.GameContextRemoveElementMessage {
  public static final int PROTOCOL_ID = 6412;
  // i8
  public byte elementEventId;

  public GameContextRemoveElementWithEventMessage() {}

  public GameContextRemoveElementWithEventMessage(double id, byte elementEventId) {

    super(id);
    this.elementEventId = elementEventId;
  }

  @Override
  public int getProtocolId() {
    return 6412;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.elementEventId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.elementEventId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GameContextRemoveElementWithEventMessage("
        + "id="
        + this.id
        + ", elementEventId="
        + this.elementEventId
        + ')';
  }
}
