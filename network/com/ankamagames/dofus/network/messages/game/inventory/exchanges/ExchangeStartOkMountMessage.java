// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkMountMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeStartOkMountWithOutPaddockMessage {
  public static final int PROTOCOL_ID = 5979;
  // array,com.ankamagames.dofus.network.types.game.mount.MountClientData
  public com.ankamagames.dofus.network.types.game.mount.MountClientData[]
      paddockedMountsDescription;

  public ExchangeStartOkMountMessage() {}

  public ExchangeStartOkMountMessage(
      com.ankamagames.dofus.network.types.game.mount.MountClientData[] stabledMountsDescription,
      com.ankamagames.dofus.network.types.game.mount.MountClientData[] paddockedMountsDescription) {

    super(stabledMountsDescription);
    this.paddockedMountsDescription = paddockedMountsDescription;
  }

  public ExchangeStartOkMountMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.MountClientData>
          stabledMountsDescription,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.MountClientData>
          paddockedMountsDescription) {

    super(stabledMountsDescription);
    this.paddockedMountsDescription =
        paddockedMountsDescription.toArray(
            com.ankamagames.dofus.network.types.game.mount.MountClientData[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5979;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(paddockedMountsDescription.length);

    for (int i = 0; i < paddockedMountsDescription.length; i++) {

      paddockedMountsDescription[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int paddockedMountsDescription_length = reader.read_ui16();
    this.paddockedMountsDescription =
        new com.ankamagames.dofus.network.types.game.mount.MountClientData
            [paddockedMountsDescription_length];

    for (int i = 0; i < paddockedMountsDescription_length; i++) {

      com.ankamagames.dofus.network.types.game.mount.MountClientData paddockedMountsDescription_it =
          new com.ankamagames.dofus.network.types.game.mount.MountClientData();

      paddockedMountsDescription_it.deserialize(reader);
      this.paddockedMountsDescription[i] = paddockedMountsDescription_it;
    }
  }

  @Override
  public String toString() {

    return "ExchangeStartOkMountMessage("
        + "stabledMountsDescription="
        + java.util.Arrays.toString(this.stabledMountsDescription)
        + ", paddockedMountsDescription="
        + java.util.Arrays.toString(this.paddockedMountsDescription)
        + ')';
  }
}
