// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1502;
  // array,com.ankamagames.dofus.network.types.updater.ContentPart
  public com.ankamagames.dofus.network.types.updater.ContentPart[] parts;

  public PartsListMessage() {}

  public PartsListMessage(com.ankamagames.dofus.network.types.updater.ContentPart[] parts) {
    this.parts = parts;
  }

  public PartsListMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.updater.ContentPart> parts) {
    this.parts = parts.toArray(com.ankamagames.dofus.network.types.updater.ContentPart[]::new);
  }

  @Override
  public int getProtocolId() {
    return 1502;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(parts.length);

    for (int i = 0; i < parts.length; i++) {

      parts[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int parts_length = reader.read_ui16();
    this.parts = new com.ankamagames.dofus.network.types.updater.ContentPart[parts_length];

    for (int i = 0; i < parts_length; i++) {

      com.ankamagames.dofus.network.types.updater.ContentPart parts_it =
          new com.ankamagames.dofus.network.types.updater.ContentPart();

      parts_it.deserialize(reader);
      this.parts[i] = parts_it;
    }
  }

  @Override
  public String toString() {

    return "PartsListMessage(" + "parts=" + java.util.Arrays.toString(this.parts) + ')';
  }
}
