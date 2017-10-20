// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildMotdSetRequestMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetRequestMessage {
  public static final int PROTOCOL_ID = 6588;
  // str
  public java.lang.String content;

  public GuildMotdSetRequestMessage() {}

  public GuildMotdSetRequestMessage(java.lang.String content) {

    super();
    this.content = content;
  }

  @Override
  public int getProtocolId() {
    return 6588;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.content);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.content = reader.read_str();
  }

  @Override
  public String toString() {

    return "GuildMotdSetRequestMessage(" + "content=" + this.content + ')';
  }
}
