// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.paddock;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PaddockPropertiesMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5824;
  // com.ankamagames.dofus.network.types.game.paddock.PaddockInstancesInformations
  public com.ankamagames.dofus.network.types.game.paddock.PaddockInstancesInformations properties;

  public PaddockPropertiesMessage() {}

  public PaddockPropertiesMessage(
      com.ankamagames.dofus.network.types.game.paddock.PaddockInstancesInformations properties) {
    this.properties = properties;
  }

  @Override
  public int getProtocolId() {
    return 5824;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.properties.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.properties =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockInstancesInformations();
    this.properties.deserialize(reader);
  }

  @Override
  public String toString() {

    return "PaddockPropertiesMessage(" + "properties=" + this.properties + ')';
  }
}
