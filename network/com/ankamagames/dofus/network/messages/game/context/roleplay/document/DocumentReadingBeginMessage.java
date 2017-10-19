// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.document;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DocumentReadingBeginMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5675;
  // vi16
  public short documentId;

  public DocumentReadingBeginMessage()
  {}

  public DocumentReadingBeginMessage(short documentId)
  {
    this.documentId = documentId;
  }

  @Override
  public int getProtocolId()
  {
    return 5675;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.documentId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.documentId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "DocumentReadingBeginMessage(" + "documentId=" + this.documentId + ')';
  }
}
