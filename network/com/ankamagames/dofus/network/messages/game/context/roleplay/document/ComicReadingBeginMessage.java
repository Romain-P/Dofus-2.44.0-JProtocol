// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.document;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ComicReadingBeginMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6536;
  // vi16
  public short comicId;

  public ComicReadingBeginMessage() {}

  public ComicReadingBeginMessage(short comicId) {
    this.comicId = comicId;
  }

  @Override
  public int getProtocolId() {
    return 6536;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.comicId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.comicId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "ComicReadingBeginMessage(" + "comicId=" + this.comicId + ')';
  }
}
