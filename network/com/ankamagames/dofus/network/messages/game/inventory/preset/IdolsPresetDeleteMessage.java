// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.preset;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolsPresetDeleteMessage
    extends com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetDeleteMessage {
  public static final int PROTOCOL_ID = 6602;

  public IdolsPresetDeleteMessage() {}

  public IdolsPresetDeleteMessage(byte presetId) {

    super(presetId);
  }

  @Override
  public int getProtocolId() {
    return 6602;
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

    return "IdolsPresetDeleteMessage(" + "presetId=" + this.presetId + ')';
  }
}
