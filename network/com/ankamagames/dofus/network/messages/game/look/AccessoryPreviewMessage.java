// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.look;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AccessoryPreviewMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6517;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;

  public AccessoryPreviewMessage() {}

  public AccessoryPreviewMessage(com.ankamagames.dofus.network.types.game.look.EntityLook look) {
    this.look = look;
  }

  @Override
  public int getProtocolId() {
    return 6517;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.look.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AccessoryPreviewMessage(" + "look=" + this.look + ')';
  }
}
