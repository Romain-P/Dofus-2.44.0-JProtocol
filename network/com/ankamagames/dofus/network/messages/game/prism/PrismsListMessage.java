// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6440;
  // array,com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo
  public com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[] prisms;

  public PrismsListMessage() {}

  public PrismsListMessage(
      com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[] prisms) {
    this.prisms = prisms;
  }

  public PrismsListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo>
          prisms) {
    this.prisms =
        prisms.toArray(com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6440;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(prisms.length);

    for (int i = 0; i < prisms.length; i++) {

      writer.write_ui16(prisms[i].getProtocolId());

      prisms[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int prisms_length = reader.read_ui16();
    this.prisms =
        new com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo[prisms_length];

    for (int i = 0; i < prisms_length; i++) {

      int prisms_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo prisms_it =
          (com.ankamagames.dofus.network.types.game.prism.PrismSubareaEmptyInfo)
              InternalProtocolTypeManager.get(prisms_it_typeId);

      prisms_it.deserialize(reader);
      this.prisms[i] = prisms_it;
    }
  }

  @Override
  public String toString() {

    return "PrismsListMessage(" + "prisms=" + java.util.Arrays.toString(this.prisms) + ')';
  }
}
