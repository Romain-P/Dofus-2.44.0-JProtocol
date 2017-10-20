// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildBulletinSetRequestMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetRequestMessage {
  public static final int PROTOCOL_ID = 6694;
  // str
  public java.lang.String content;
  // bool
  public boolean notifyMembers;

  public GuildBulletinSetRequestMessage() {}

  public GuildBulletinSetRequestMessage(java.lang.String content, boolean notifyMembers) {

    super();
    this.content = content;
    this.notifyMembers = notifyMembers;
  }

  @Override
  public int getProtocolId() {
    return 6694;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_str(this.content);
    writer.write_bool(this.notifyMembers);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.content = reader.read_str();
    this.notifyMembers = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GuildBulletinSetRequestMessage("
        + "content="
        + this.content
        + ", notifyMembers="
        + this.notifyMembers
        + ')';
  }
}
