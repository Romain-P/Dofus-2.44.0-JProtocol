// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class HavenBagDailyLoteryMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6644;
  // i8
  public byte returnType;
  // str
  public java.lang.String tokenId;

  public HavenBagDailyLoteryMessage()
  {}

  public HavenBagDailyLoteryMessage(byte returnType, java.lang.String tokenId)
  {
    this.returnType = returnType;
    this.tokenId = tokenId;
  }

  @Override
  public int getProtocolId()
  {
    return 6644;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.returnType);
    writer.write_str(this.tokenId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.returnType = reader.read_i8();
    this.tokenId = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "HavenBagDailyLoteryMessage("
        + "returnType="
        + this.returnType
        + ", tokenId="
        + this.tokenId
        + ')';
  }
}
