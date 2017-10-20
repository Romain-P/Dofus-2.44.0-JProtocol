// Created by Heat the 2017-10-20 01:53:21+02:00
package com.ankamagames.dofus.network.messages.authorized;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ConsoleCommandsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6127;
  // array,str
  public java.lang.String[] aliases;
  // array,str
  public java.lang.String[] args;
  // array,str
  public java.lang.String[] descriptions;

  public ConsoleCommandsListMessage() {}

  public ConsoleCommandsListMessage(
      java.lang.String[] aliases, java.lang.String[] args, java.lang.String[] descriptions) {
    this.aliases = aliases;
    this.args = args;
    this.descriptions = descriptions;
  }

  @Override
  public int getProtocolId() {
    return 6127;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(aliases.length);
    writer.write_array_str(this.aliases);
    writer.write_ui16(args.length);
    writer.write_array_str(this.args);
    writer.write_ui16(descriptions.length);
    writer.write_array_str(this.descriptions);
  }

  @Override
  public void deserialize(DataReader reader) {

    int aliases_length = reader.read_ui16();
    this.aliases = reader.read_array_str(aliases_length);

    int args_length = reader.read_ui16();
    this.args = reader.read_array_str(args_length);

    int descriptions_length = reader.read_ui16();
    this.descriptions = reader.read_array_str(descriptions_length);
  }

  @Override
  public String toString() {

    return "ConsoleCommandsListMessage("
        + "aliases="
        + java.util.Arrays.toString(this.aliases)
        + ", args="
        + java.util.Arrays.toString(this.args)
        + ", descriptions="
        + java.util.Arrays.toString(this.descriptions)
        + ')';
  }
}
