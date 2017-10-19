// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.chat.smiley;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class MoodSmileyUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6388;
  // i32
  public int accountId;
  // ui64
  public java.math.BigInteger playerId;
  // vi16
  public short smileyId;

  public MoodSmileyUpdateMessage()
  {}

  public MoodSmileyUpdateMessage(int accountId, java.math.BigInteger playerId, short smileyId)
  {
    this.accountId = accountId;
    this.playerId = playerId;
    this.smileyId = smileyId;
  }

  @Override
  public int getProtocolId()
  {
    return 6388;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.accountId);
    writer.write_ui64(this.playerId);
    writer.write_vi16(this.smileyId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.accountId = reader.read_i32();
    this.playerId = reader.read_ui64();
    this.smileyId = reader.read_vi16();
  }

  @Override
  public String toString()
  {

    return "MoodSmileyUpdateMessage("
        + "accountId="
        + this.accountId
        + ", playerId="
        + this.playerId
        + ", smileyId="
        + this.smileyId
        + ')';
  }
}
