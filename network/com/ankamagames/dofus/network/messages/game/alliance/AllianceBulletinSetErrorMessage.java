// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceBulletinSetErrorMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetErrorMessage {
  public static final int PROTOCOL_ID = 6692;

  public AllianceBulletinSetErrorMessage() {}

  public AllianceBulletinSetErrorMessage(byte reason) {

    super(reason);
  }

  @Override
  public int getProtocolId() {
    return 6692;
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

    return "AllianceBulletinSetErrorMessage(" + "reason=" + this.reason + ')';
  }
}
