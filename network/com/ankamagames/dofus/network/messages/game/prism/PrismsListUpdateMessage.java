// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismsListUpdateMessage
    extends com.ankamagames.dofus.network.messages.game.prism.PrismsListMessage {
  public static final int PROTOCOL_ID = 6438;

  public PrismsListUpdateMessage() {}

  public PrismsListUpdateMessage(
      com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[] prisms) {

    super(prisms);
  }

  public PrismsListUpdateMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo>
          prisms) {

    super(prisms);
  }

  @Override
  public int getProtocolId() {
    return 6438;
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

    return "PrismsListUpdateMessage(" + "prisms=" + java.util.Arrays.toString(this.prisms) + ')';
  }
}
