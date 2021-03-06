// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceMotdSetRequestMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetRequestMessage {
  public static final int PROTOCOL_ID = 6687;
  // str
  public java.lang.String content;

  public AllianceMotdSetRequestMessage() {}

  public AllianceMotdSetRequestMessage(java.lang.String content) {

    super();
    this.content = content;
  }

  @Override
  public int getProtocolId() {
    return 6687;
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

    return "AllianceMotdSetRequestMessage(" + "content=" + this.content + ')';
  }
}
