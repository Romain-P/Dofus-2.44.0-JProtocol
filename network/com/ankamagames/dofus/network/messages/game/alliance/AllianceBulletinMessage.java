// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceBulletinMessage
    extends com.ankamagames.dofus.network.messages.game.social.BulletinMessage {
  public static final int PROTOCOL_ID = 6690;

  public AllianceBulletinMessage() {}

  public AllianceBulletinMessage(
      java.lang.String content,
      int timestamp,
      long memberId,
      java.lang.String memberName,
      int lastNotifiedTimestamp) {

    super(content, timestamp, memberId, memberName, lastNotifiedTimestamp);
  }

  @Override
  public int getProtocolId() {
    return 6690;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
  }

  @Override
  public String toString() {

    return "AllianceBulletinMessage("
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
