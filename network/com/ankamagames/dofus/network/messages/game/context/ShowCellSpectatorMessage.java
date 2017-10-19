// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ShowCellSpectatorMessage
    extends com.ankamagames.dofus.network.messages.game.context.ShowCellMessage {
  public static final int PROTOCOL_ID = 6158;
  // str
  public java.lang.String playerName;

  public ShowCellSpectatorMessage()
  {}

  public ShowCellSpectatorMessage(double sourceId, short cellId, java.lang.String playerName)
  {

    super(sourceId, cellId);
    this.playerName = playerName;
  }

  @Override
  public int getProtocolId()
  {
    return 6158;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.playerName);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.playerName = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "ShowCellSpectatorMessage("
        + "sourceId="
        + this.sourceId
        + ", cellId="
        + this.cellId
        + ", playerName="
        + this.playerName
        + ')';
  }
}
