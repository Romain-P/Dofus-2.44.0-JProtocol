// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.interactive.meeting;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TeleportBuddiesRequestedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6302;
  // vi16
  public short dungeonId;
  // ui64
  public java.math.BigInteger inviterId;
  // array,ui64
  public java.math.BigInteger[] invalidBuddiesIds;

  public TeleportBuddiesRequestedMessage()
  {}

  public TeleportBuddiesRequestedMessage(
      short dungeonId, java.math.BigInteger inviterId, java.math.BigInteger[] invalidBuddiesIds)
  {
    this.dungeonId = dungeonId;
    this.inviterId = inviterId;
    this.invalidBuddiesIds = invalidBuddiesIds;
  }

  @Override
  public int getProtocolId()
  {
    return 6302;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi16(this.dungeonId);
    writer.write_ui64(this.inviterId);
    writer.write_ui16(invalidBuddiesIds.length);
    writer.write_array_ui64(this.invalidBuddiesIds);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.dungeonId = reader.read_vi16();
    this.inviterId = reader.read_ui64();

    int invalidBuddiesIds_length = reader.read_ui16();
    this.invalidBuddiesIds = reader.read_array_ui64(invalidBuddiesIds_length);
  }

  @Override
  public String toString()
  {

    return "TeleportBuddiesRequestedMessage("
        + "dungeonId="
        + this.dungeonId
        + ", inviterId="
        + this.inviterId
        + ", invalidBuddiesIds="
        + java.util.Arrays.toString(this.invalidBuddiesIds)
        + ')';
  }
}
