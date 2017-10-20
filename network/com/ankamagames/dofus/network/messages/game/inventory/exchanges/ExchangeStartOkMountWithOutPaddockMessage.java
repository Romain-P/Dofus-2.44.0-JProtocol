// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeStartOkMountWithOutPaddockMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5991;
  // array,com.ankamagames.dofus.network.types.game.mount.MountClientData
  public com.ankamagames.dofus.network.types.game.mount.MountClientData[] stabledMountsDescription;

  public ExchangeStartOkMountWithOutPaddockMessage() {}

  public ExchangeStartOkMountWithOutPaddockMessage(
      com.ankamagames.dofus.network.types.game.mount.MountClientData[] stabledMountsDescription) {
    this.stabledMountsDescription = stabledMountsDescription;
  }

  public ExchangeStartOkMountWithOutPaddockMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.MountClientData>
          stabledMountsDescription) {
    this.stabledMountsDescription =
        stabledMountsDescription.toArray(
            com.ankamagames.dofus.network.types.game.mount.MountClientData[]::new);
  }

  @Override
  public int getProtocolId() {
    return 5991;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(stabledMountsDescription.length);

    for (int i = 0; i < stabledMountsDescription.length; i++) {

      stabledMountsDescription[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int stabledMountsDescription_length = reader.read_ui16();
    this.stabledMountsDescription =
        new com.ankamagames.dofus.network.types.game.mount.MountClientData
            [stabledMountsDescription_length];

    for (int i = 0; i < stabledMountsDescription_length; i++) {

      com.ankamagames.dofus.network.types.game.mount.MountClientData stabledMountsDescription_it =
          new com.ankamagames.dofus.network.types.game.mount.MountClientData();

      stabledMountsDescription_it.deserialize(reader);
      this.stabledMountsDescription[i] = stabledMountsDescription_it;
    }
  }

  @Override
  public String toString() {

    return "ExchangeStartOkMountWithOutPaddockMessage("
        + "stabledMountsDescription="
        + java.util.Arrays.toString(this.stabledMountsDescription)
        + ')';
  }
}
