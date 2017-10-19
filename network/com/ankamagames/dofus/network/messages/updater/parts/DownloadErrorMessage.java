// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.updater.parts;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class DownloadErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1513;
  // i8
  public byte errorId;
  // str
  public java.lang.String message;
  // str
  public java.lang.String helpUrl;

  public DownloadErrorMessage()
  {}

  public DownloadErrorMessage(byte errorId, java.lang.String message, java.lang.String helpUrl)
  {
    this.errorId = errorId;
    this.message = message;
    this.helpUrl = helpUrl;
  }

  @Override
  public int getProtocolId()
  {
    return 1513;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.errorId);
    writer.write_str(this.message);
    writer.write_str(this.helpUrl);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.errorId = reader.read_i8();
    this.message = reader.read_str();
    this.helpUrl = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "DownloadErrorMessage("
        + "errorId="
        + this.errorId
        + ", message="
        + this.message
        + ", helpUrl="
        + this.helpUrl
        + ')';
  }
}
