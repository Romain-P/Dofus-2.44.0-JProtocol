// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BulletinMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeMessage {
  public static final int PROTOCOL_ID = 6695;
  // i32
  public int lastNotifiedTimestamp;

  public BulletinMessage()
  {}

  public BulletinMessage(
      java.lang.String content,
      int timestamp,
      java.math.BigInteger memberId,
      java.lang.String memberName,
      int lastNotifiedTimestamp)
  {

    super(content, timestamp, memberId, memberName);
    this.lastNotifiedTimestamp = lastNotifiedTimestamp;
  }

  @Override
  public int getProtocolId()
  {
    return 6695;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i32(this.lastNotifiedTimestamp);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.lastNotifiedTimestamp = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "BulletinMessage("
        + "content="
        + this.content
        + ", timestamp="
        + this.timestamp
        + ", memberId="
        + this.memberId
        + ", memberName="
        + this.memberName
        + ", lastNotifiedTimestamp="
        + this.lastNotifiedTimestamp
        + ')';
  }
}
