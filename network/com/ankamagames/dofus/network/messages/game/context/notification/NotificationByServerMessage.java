// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.notification;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NotificationByServerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6103;
  // vi16
  public short id;
  // array,str
  public java.lang.String[] parameters;
  // bool
  public boolean forceOpen;

  public NotificationByServerMessage() {}

  public NotificationByServerMessage(short id, java.lang.String[] parameters, boolean forceOpen) {
    this.id = id;
    this.parameters = parameters;
    this.forceOpen = forceOpen;
  }

  @Override
  public int getProtocolId() {
    return 6103;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.id);
    writer.write_ui16(parameters.length);
    writer.write_array_str(this.parameters);
    writer.write_bool(this.forceOpen);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_vi16();

    int parameters_length = reader.read_ui16();
    this.parameters = reader.read_array_str(parameters_length);
    this.forceOpen = reader.read_bool();
  }

  @Override
  public String toString() {

    return "NotificationByServerMessage("
        + "id="
        + this.id
        + ", parameters="
        + java.util.Arrays.toString(this.parameters)
        + ", forceOpen="
        + this.forceOpen
        + ')';
  }
}
