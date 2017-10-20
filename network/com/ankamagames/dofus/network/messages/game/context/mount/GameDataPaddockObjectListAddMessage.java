// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.mount;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameDataPaddockObjectListAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5992;
  // array,com.ankamagames.dofus.network.types.game.paddock.PaddockItem
  public com.ankamagames.dofus.network.types.game.paddock.PaddockItem[] paddockItemDescription;

  public GameDataPaddockObjectListAddMessage() {}

  public GameDataPaddockObjectListAddMessage(
      com.ankamagames.dofus.network.types.game.paddock.PaddockItem[] paddockItemDescription) {
    this.paddockItemDescription = paddockItemDescription;
  }

  public GameDataPaddockObjectListAddMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.paddock.PaddockItem>
          paddockItemDescription) {
    this.paddockItemDescription =
        paddockItemDescription.toArray(
            com.ankamagames.dofus.network.types.game.paddock.PaddockItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5992;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(paddockItemDescription.length);

    for (int i = 0; i < paddockItemDescription.length; i++) {

      paddockItemDescription[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int paddockItemDescription_length = reader.read_ui16();
    this.paddockItemDescription =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockItem
            [paddockItemDescription_length];

    for (int i = 0; i < paddockItemDescription_length; i++) {

      com.ankamagames.dofus.network.types.game.paddock.PaddockItem paddockItemDescription_it =
          new com.ankamagames.dofus.network.types.game.paddock.PaddockItem();

      paddockItemDescription_it.deserialize(reader);
      this.paddockItemDescription[i] = paddockItemDescription_it;
    }
  }

  @Override
  public String toString() {

    return "GameDataPaddockObjectListAddMessage("
        + "paddockItemDescription="
        + java.util.Arrays.toString(this.paddockItemDescription)
        + ')';
  }
}
