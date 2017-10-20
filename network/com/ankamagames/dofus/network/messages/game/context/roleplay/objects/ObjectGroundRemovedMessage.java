// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.objects;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ObjectGroundRemovedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 3014;
  // vi16
  public short cell;

  public ObjectGroundRemovedMessage() {}

  public ObjectGroundRemovedMessage(short cell) {
    this.cell = cell;
  }

  @Override
  public int getProtocolId() {
    return 3014;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.cell);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.cell = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ObjectGroundRemovedMessage(" + "cell=" + this.cell + ')';
  }
}
