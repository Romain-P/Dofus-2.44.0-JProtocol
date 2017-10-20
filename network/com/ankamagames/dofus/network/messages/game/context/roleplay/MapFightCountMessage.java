// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MapFightCountMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 210;
  // vi16
  public short fightCount;

  public MapFightCountMessage() {}

  public MapFightCountMessage(short fightCount) {
    this.fightCount = fightCount;
  }

  @Override
  public int getProtocolId() {
    return 210;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.fightCount);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.fightCount = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "MapFightCountMessage(" + "fightCount=" + this.fightCount + ')';
  }
}
