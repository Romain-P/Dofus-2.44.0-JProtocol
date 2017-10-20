// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat.channel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ChannelEnablingMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 890;
  // i8
  public byte channel;
  // bool
  public boolean enable;

  public ChannelEnablingMessage() {}

  public ChannelEnablingMessage(byte channel, boolean enable) {
    this.channel = channel;
    this.enable = enable;
  }

  @Override
  public int getProtocolId() {
    return 890;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.channel);
    writer.write_bool(this.enable);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.channel = reader.read_i8();
    this.enable = reader.read_bool();
  }

  @Override
  public String toString() {

    return "ChannelEnablingMessage(" + "channel=" + this.channel + ", enable=" + this.enable + ')';
  }
}
