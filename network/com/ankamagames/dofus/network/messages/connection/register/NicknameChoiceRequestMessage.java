// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.connection.register;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NicknameChoiceRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5639;
  // str
  public java.lang.String nickname;

  public NicknameChoiceRequestMessage() {}

  public NicknameChoiceRequestMessage(java.lang.String nickname) {
    this.nickname = nickname;
  }

  @Override
  public int getProtocolId() {
    return 5639;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_str(this.nickname);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.nickname = reader.read_str();
  }

  @Override
  public String toString() {

    return "NicknameChoiceRequestMessage(" + "nickname=" + this.nickname + ')';
  }
}
