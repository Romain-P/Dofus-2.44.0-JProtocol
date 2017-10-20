// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildPaddockBoughtMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5952;
  // com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations
  public com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations paddockInfo;

  public GuildPaddockBoughtMessage() {}

  public GuildPaddockBoughtMessage(
      com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations paddockInfo) {
    this.paddockInfo = paddockInfo;
  }

  @Override
  public int getProtocolId() {
    return 5952;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.paddockInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.paddockInfo =
        new com.ankamagames.dofus.network.types.game.paddock.PaddockContentInformations();
    this.paddockInfo.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GuildPaddockBoughtMessage(" + "paddockInfo=" + this.paddockInfo + ')';
  }
}
