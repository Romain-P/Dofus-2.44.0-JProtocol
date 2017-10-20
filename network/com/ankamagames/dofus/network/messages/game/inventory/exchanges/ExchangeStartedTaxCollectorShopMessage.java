// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartedTaxCollectorShopMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6664;
  // array,com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects;
  // vi64
  public long kamas;

  public ExchangeStartedTaxCollectorShopMessage() {}

  public ExchangeStartedTaxCollectorShopMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem[] objects, long kamas) {
    this.objects = objects;
    this.kamas = kamas;
  }

  public ExchangeStartedTaxCollectorShopMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.data.items.ObjectItem>
          objects,
      long kamas) {
    this.objects =
        objects.toArray(com.ankamagames.dofus.network.types.game.data.items.ObjectItem[]::new);
    this.kamas = kamas;
  }

  @Override
  public int getProtocolId() {
    return 6664;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(objects.length);

    for (int i = 0; i < objects.length; i++) {

      objects[i].serialize(writer);
    }
    writer.write_vi64(this.kamas);
  }

  @Override
  public void deserialize(DataReader reader) {

    int objects_length = reader.read_ui16();
    this.objects =
        new com.ankamagames.dofus.network.types.game.data.items.ObjectItem[objects_length];

    for (int i = 0; i < objects_length; i++) {

      com.ankamagames.dofus.network.types.game.data.items.ObjectItem objects_it =
          new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();

      objects_it.deserialize(reader);
      this.objects[i] = objects_it;
    }
    this.kamas = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "ExchangeStartedTaxCollectorShopMessage("
        + "objects="
        + java.util.Arrays.toString(this.objects)
        + ", kamas="
        + this.kamas
        + ')';
  }
}
