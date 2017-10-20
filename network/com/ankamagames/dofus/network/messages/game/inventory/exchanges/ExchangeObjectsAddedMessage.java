// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeObjectsAddedMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage {
  public static final int PROTOCOL_ID = 6535;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object;

  public ExchangeObjectsAddedMessage() {}

  public ExchangeObjectsAddedMessage(
      boolean remote, com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] object) {

    super(remote);
    this.object = object;
  }

  public ExchangeObjectsAddedMessage(
      boolean remote,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          object) {

    super(remote);
    this.object =
        object.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6535;
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

    return "ExchangeObjectsAddedMessage("
        + "remote="
        + this.remote
        + ", object="
        + java.util.Arrays.toString(this.object)
        + ')';
  }
}
