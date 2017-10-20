// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.shortcut;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class Shortcut extends NetworkType {
  public static final int PROTOCOL_ID = 369;
  // i8
  public byte slot;

  public Shortcut() {}

  public Shortcut(byte slot) {
    this.slot = slot;
  }

  @Override
  public int getProtocolId() {
    return 369;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.slot);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.slot = reader.read_i8();
  }

  @Override
  public String toString() {

    return "Shortcut(" + "slot=" + this.slot + ')';
  }
}
