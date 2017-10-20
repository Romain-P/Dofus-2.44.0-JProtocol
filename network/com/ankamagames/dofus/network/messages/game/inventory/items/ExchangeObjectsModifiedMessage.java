// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectsModifiedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 6533;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object;

  public ExchangeObjectsModifiedMessage() {}

  public ExchangeObjectsModifiedMessage(
      boolean remote, com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object) {

    super(remote);
    this.object = object;
  }

  public ExchangeObjectsModifiedMessage(
      boolean remote,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          object) {

    super(remote);
    this.object =
        object.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6533;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(object.length);

    for (int i = 0; i < object.length; i++) {

      object[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int object_length = reader.read_ui16();
    this.object = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[object_length];

    for (int i = 0; i < object_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem object_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      object_it.deserialize(reader);
      this.object[i] = object_it;
    }
  }

  @Override
  public String toString() {

    return "ExchangeObjectsModifiedMessage("
        + "remote="
        + this.remote
        + ", object="
        + java.util.Arrays.toString(this.object)
        + ')';
  }
}
