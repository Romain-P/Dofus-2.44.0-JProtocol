// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MimicryObjectPreviewMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6458;
  // com.ankamagames.dofus.network.types.game.data.items.ObjectItem
  public com.ankamagames.dofus.network.types.game.data.items.ObjectItem result;

  public MimicryObjectPreviewMessage() {}

  public MimicryObjectPreviewMessage(
      com.ankamagames.dofus.network.types.game.data.items.ObjectItem result) {
    this.result = result;
  }

  @Override
  public int getProtocolId() {
    return 6458;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.result.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.result = new com.ankamagames.dofus.network.types.game.data.items.ObjectItem();
    this.result.deserialize(reader);
  }

  @Override
  public String toString() {

    return "MimicryObjectPreviewMessage(" + "result=" + this.result + ')';
  }
}
