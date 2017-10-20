// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildCharacsUpgradeRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5706;
  // i8
  public byte charaTypeTarget;

  public GuildCharacsUpgradeRequestMessage() {}

  public GuildCharacsUpgradeRequestMessage(byte charaTypeTarget) {
    this.charaTypeTarget = charaTypeTarget;
  }

  @Override
  public int getProtocolId() {
    return 5706;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.charaTypeTarget);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.charaTypeTarget = reader.read_i8();
  }

  @Override
  public String toString() {

    return "GuildCharacsUpgradeRequestMessage(" + "charaTypeTarget=" + this.charaTypeTarget + ')';
  }
}
