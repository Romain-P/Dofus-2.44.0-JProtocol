// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.moderation;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PopupWarningMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6134;
  // ui8
  public short lockDuration;
  // str
  public java.lang.String author;
  // str
  public java.lang.String content;

  public PopupWarningMessage()
  {}

  public PopupWarningMessage(
      short lockDuration, java.lang.String author, java.lang.String content)
  {
    this.lockDuration = lockDuration;
    this.author = author;
    this.content = content;
  }

  @Override
  public int getProtocolId()
  {
    return 6134;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.lockDuration);
    writer.write_str(this.author);
    writer.write_str(this.content);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.lockDuration = reader.read_ui8();
    this.author = reader.read_str();
    this.content = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "PopupWarningMessage("
        + "lockDuration="
        + this.lockDuration
        + ", author="
        + this.author
        + ", content="
        + this.content
        + ')';
  }
}
