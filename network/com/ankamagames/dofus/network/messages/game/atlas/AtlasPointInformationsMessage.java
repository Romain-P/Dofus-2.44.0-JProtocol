// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.atlas;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AtlasPointInformationsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5956;
  // com.ankamagames.dofus.network.types.game.context.roleplay.AtlasPointsInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.AtlasPointsInformations type;

  public AtlasPointInformationsMessage() {}

  public AtlasPointInformationsMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.AtlasPointsInformations type) {
    this.type = type;
  }

  @Override
  public int getProtocolId() {
    return 5956;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.type.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.type =
        new com.ankamagames.dofus.network.types.game.context.roleplay.AtlasPointsInformations();
    this.type.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AtlasPointInformationsMessage(" + "type=" + this.type + ')';
  }
}
