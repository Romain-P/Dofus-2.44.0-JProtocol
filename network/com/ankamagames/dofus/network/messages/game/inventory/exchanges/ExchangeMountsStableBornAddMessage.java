// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.exchanges;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ExchangeMountsStableBornAddMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.exchanges
        .ExchangeMountsStableAddMessage {
  public static final int PROTOCOL_ID = 6557;

  public ExchangeMountsStableBornAddMessage() {}

  public ExchangeMountsStableBornAddMessage(
      com.ankamagames.dofus.network.types.game.mount.MountClientData[] mountDescription) {

    super(mountDescription);
  }

  public ExchangeMountsStableBornAddMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.mount.MountClientData>
          mountDescription) {

    super(mountDescription);
  }

  @Override
  public int getProtocolId() {
    return 6557;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "ExchangeMountsStableBornAddMessage("
        + "mountDescription="
        + java.util.Arrays.toString(this.mountDescription)
        + ')';
  }
}
