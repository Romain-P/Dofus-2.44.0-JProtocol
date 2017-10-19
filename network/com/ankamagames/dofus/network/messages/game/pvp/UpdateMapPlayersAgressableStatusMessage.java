// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.pvp;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class UpdateMapPlayersAgressableStatusMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6454;
  // array,ui64
  public java.math.BigInteger[] playerIds;
  // array,i8
  public byte[] enable;

  public UpdateMapPlayersAgressableStatusMessage()
  {}

  public UpdateMapPlayersAgressableStatusMessage(java.math.BigInteger[] playerIds, byte[] enable)
  {
    this.playerIds = playerIds;
    this.enable = enable;
  }

  @Override
  public int getProtocolId()
  {
    return 6454;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(playerIds.length);
    writer.write_array_ui64(this.playerIds);
    writer.write_ui16(enable.length);
    writer.write_array_i8(this.enable);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int playerIds_length = reader.read_ui16();
    this.playerIds = reader.read_array_ui64(playerIds_length);

    int enable_length = reader.read_ui16();
    this.enable = reader.read_array_i8(enable_length);
  }

  @Override
  public String toString()
  {

    return "UpdateMapPlayersAgressableStatusMessage("
        + "playerIds="
        + java.util.Arrays.toString(this.playerIds)
        + ", enable="
        + +this.enable.length
        + "b"
        + ')';
  }
}
