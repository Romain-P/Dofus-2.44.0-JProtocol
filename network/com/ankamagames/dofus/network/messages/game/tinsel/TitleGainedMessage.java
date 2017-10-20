// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.tinsel;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TitleGainedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6364;
  // vi16
  public short titleId;

  public TitleGainedMessage() {}

  public TitleGainedMessage(short titleId) {
    this.titleId = titleId;
  }

  @Override
  public int getProtocolId() {
    return 6364;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.titleId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.titleId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "TitleGainedMessage(" + "titleId=" + this.titleId + ')';
  }
}
