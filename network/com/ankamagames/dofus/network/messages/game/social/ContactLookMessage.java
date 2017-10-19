// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.social;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ContactLookMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5934;
  // vi32
  public int requestId;
  // str
  public java.lang.String playerName;
  // ui64
  public java.math.BigInteger playerId;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;

  public ContactLookMessage()
  {}

  public ContactLookMessage(
      int requestId,
      java.lang.String playerName,
      java.math.BigInteger playerId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look)
  {
    this.requestId = requestId;
    this.playerName = playerName;
    this.playerId = playerId;
    this.look = look;
  }

  @Override
  public int getProtocolId()
  {
    return 5934;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.requestId);
    writer.write_str(this.playerName);
    writer.write_ui64(this.playerId);
    this.look.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.requestId = reader.read_vi32();
    this.playerName = reader.read_str();
    this.playerId = reader.read_ui64();
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ContactLookMessage("
        + "requestId="
        + this.requestId
        + ", playerName="
        + this.playerName
        + ", playerId="
        + this.playerId
        + ", look="
        + this.look
        + ')';
  }
}
