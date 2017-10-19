// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMotdMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeMessage {
  public static final int PROTOCOL_ID = 6590;

  public GuildMotdMessage()
  {}

  public GuildMotdMessage(
      java.lang.String content,
      int timestamp,
      java.math.BigInteger memberId,
      java.lang.String memberName)
  {

    super(content, timestamp, memberId, memberName);
  }

  @Override
  public int getProtocolId()
  {
    return 6590;
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

    return "GuildMotdMessage("
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
