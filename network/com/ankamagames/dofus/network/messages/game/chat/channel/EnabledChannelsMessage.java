// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.chat.channel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class EnabledChannelsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 892;
  // array,i8
  public byte[] channels;
  // array,i8
  public byte[] disallowed;

  public EnabledChannelsMessage() {}

  public EnabledChannelsMessage(byte[] channels, byte[] disallowed) {
    this.channels = channels;
    this.disallowed = disallowed;
  }

  @Override
  public int getProtocolId() {
    return 892;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(channels.length);
    writer.write_array_i8(this.channels);
    writer.write_ui16(disallowed.length);
    writer.write_array_i8(this.disallowed);
  }

  @Override
  public void deserialize(DataReader reader) {

    int channels_length = reader.read_ui16();
    this.channels = reader.read_array_i8(channels_length);

    int disallowed_length = reader.read_ui16();
    this.disallowed = reader.read_array_i8(disallowed_length);
  }

  @Override
  public String toString() {

    return "EnabledChannelsMessage("
        + "channels="
        + +this.channels.length
        + "b"
        + ", disallowed="
        + +this.disallowed.length
        + "b"
        + ')';
  }
}
