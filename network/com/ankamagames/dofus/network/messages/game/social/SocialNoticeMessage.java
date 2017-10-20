// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SocialNoticeMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6688;
  // str
  public java.lang.String content;
  // i32
  public int timestamp;
  // vi64
  public long memberId;
  // str
  public java.lang.String memberName;

  public SocialNoticeMessage() {}

  public SocialNoticeMessage(
      java.lang.String content, int timestamp, long memberId, java.lang.String memberName) {
    this.content = content;
    this.timestamp = timestamp;
    this.memberId = memberId;
    this.memberName = memberName;
  }

  @Override
  public int getProtocolId() {
    return 6688;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.content);
    writer.write_i32(this.timestamp);
    writer.write_vi64(this.memberId);
    writer.write_str(this.memberName);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.content = reader.read_str();
    this.timestamp = reader.read_i32();
    this.memberId = reader.read_vi64();
    this.memberName = reader.read_str();
  }

  @Override
  public String toString() {

    return "SocialNoticeMessage("
        + "content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", memberId="
        + this.memberId
        + ", memberName="
        + this.memberName
        + ')';
  }
}
