// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.status;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PlayerStatusUpdateRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6387;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;

  public PlayerStatusUpdateRequestMessage()
  {}

  public PlayerStatusUpdateRequestMessage(
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status)
  {
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 6387;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PlayerStatusUpdateRequestMessage(" + "status=" + this.status + ')';
  }
}
