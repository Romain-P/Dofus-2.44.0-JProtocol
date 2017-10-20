// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountsPaddockAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6561;
  // array,com.ankamagames.dofus.network.types.game.mount.MountClientData
  public com.ankamagames.dofus.network.types.game.mount.MountClientData[] mountDescription;

  public ExchangeMountsPaddockAddMessage() {}

  public ExchangeMountsPaddockAddMessage(
      com.ankamagames.dofus.network.types.game.mount.MountClientData[] mountDescription) {
    this.mountDescription = mountDescription;
  }

  public ExchangeMountsPaddockAddMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.MountClientData>
          mountDescription) {
    this.mountDescription =
        mountDescription.toArray(
            com.ankamagames.dofus.network.types.game.mount.MountClientData[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6561;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(mountDescription.length);

    for (int i = 0; i < mountDescription.length; i++) {

      mountDescription[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int mountDescription_length = reader.read_ui16();
    this.mountDescription =
        new com.ankamagames.dofus.network.types.game.mount.MountClientData[mountDescription_length];

    for (int i = 0; i < mountDescription_length; i++) {

      com.ankamagames.dofus.network.types.game.mount.MountClientData mountDescription_it =
          new com.ankamagames.dofus.network.types.game.mount.MountClientData();

      mountDescription_it.deserialize(reader);
      this.mountDescription[i] = mountDescription_it;
    }
  }

  @Override
  public String toString() {

    return "ExchangeMountsPaddockAddMessage("
        + "mountDescription="
        + java.util.Arrays.toString(this.mountDescription)
        + ')';
  }
}
