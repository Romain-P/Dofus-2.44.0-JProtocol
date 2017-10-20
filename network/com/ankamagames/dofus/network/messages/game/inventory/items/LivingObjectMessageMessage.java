// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.inventory.items;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LivingObjectMessageMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6065;
  // vi16
  public short msgId;
  // i32
  public int timeStamp;
  // str
  public java.lang.String owner;
  // vi16
  public short objectGenericId;

  public LivingObjectMessageMessage() {}

  public LivingObjectMessageMessage(
      short msgId, int timeStamp, java.lang.String owner, short objectGenericId) {
    this.msgId = msgId;
    this.timeStamp = timeStamp;
    this.owner = owner;
    this.objectGenericId = objectGenericId;
  }

  @Override
  public int getProtocolId() {
    return 6065;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.msgId);
    writer.write_i32(this.timeStamp);
    writer.write_str(this.owner);
    writer.write_vi16(this.objectGenericId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.msgId = reader.read_vi16();
    this.timeStamp = reader.read_i32();
    this.owner = reader.read_str();
    this.objectGenericId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "LivingObjectMessageMessage("
        + "msgId="
        + this.msgId
        + ", timeStamp="
        + this.timeStamp
        + ", owner="
        + this.owner
        + ", objectGenericId="
        + this.objectGenericId
        + ')';
  }
}
