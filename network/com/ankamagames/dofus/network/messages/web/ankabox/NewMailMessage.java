// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.messages.web.ankabox;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NewMailMessage
    extends com.ankamagames.dofus.network.messages.web.ankabox.MailStatusMessage {
  public static final int PROTOCOL_ID = 6292;
  // array,i32
  public int[] sendersAccountId;

  public NewMailMessage() {}

  public NewMailMessage(short unread, short total, int[] sendersAccountId) {

    super(unread, total);
    this.sendersAccountId = sendersAccountId;
  }

  @Override
  public int getProtocolId() {
    return 6292;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(sendersAccountId.length);
    writer.write_array_i32(this.sendersAccountId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int sendersAccountId_length = reader.read_ui16();
    this.sendersAccountId = reader.read_array_i32(sendersAccountId_length);
  }

  @Override
  public String toString() {

    return "NewMailMessage("
        + "unread="
        + this.unread
        + ", total="
        + this.total
        + ", sendersAccountId="
        + java.util.Arrays.toString(this.sendersAccountId)
        + ')';
  }
}
