// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildInvitationAnswerMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5556;
  // bool
  public boolean accept;

  public GuildInvitationAnswerMessage() {}

  public GuildInvitationAnswerMessage(boolean accept) {
    this.accept = accept;
  }

  @Override
  public int getProtocolId() {
    return 5556;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_bool(this.accept);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.accept = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GuildInvitationAnswerMessage(" + "accept=" + this.accept + ')';
  }
}
