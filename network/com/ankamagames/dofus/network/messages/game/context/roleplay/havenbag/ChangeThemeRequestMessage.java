// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChangeThemeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6639;
  // i8
  public byte theme;

  public ChangeThemeRequestMessage() {}

  public ChangeThemeRequestMessage(byte theme) {
    this.theme = theme;
  }

  @Override
  public int getProtocolId() {
    return 6639;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.theme);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.theme = reader.read_i8();
  }

  @Override
  public String toString() {

    return "ChangeThemeRequestMessage(" + "theme=" + this.theme + ')';
  }
}
