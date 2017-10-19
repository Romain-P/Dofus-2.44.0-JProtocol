// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceMotdSetErrorMessage
    extends com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetErrorMessage {
  public static final int PROTOCOL_ID = 6683;

  public AllianceMotdSetErrorMessage()
  {}

  public AllianceMotdSetErrorMessage(byte reason)
  {

    super(reason);
  }

  @Override
  public int getProtocolId()
  {
    return 6683;
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

    return "AllianceMotdSetErrorMessage(" + "reason=" + this.reason + ')';
  }
}
