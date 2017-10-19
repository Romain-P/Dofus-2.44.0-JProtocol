// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildBulletinMessage
    extends com.ankamagames.dofus.network.messages.game.social.BulletinMessage {
  public static final int PROTOCOL_ID = 6689;

  public GuildBulletinMessage()
  {}

  public GuildBulletinMessage(
      java.lang.String content,
      int timestamp,
      java.math.BigInteger memberId,
      java.lang.String memberName,
      int lastNotifiedTimestamp)
  {

    super(content, timestamp, memberId, memberName, lastNotifiedTimestamp);
  }

  @Override
  public int getProtocolId()
  {
    return 6689;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GuildBulletinMessage("
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