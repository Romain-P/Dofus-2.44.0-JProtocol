// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildChangeMemberParametersMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5549;
  // ui64
  public java.math.BigInteger memberId;
  // vi16
  public short rank;
  // i8
  public byte experienceGivenPercent;
  // vi32
  public int rights;

  public GuildChangeMemberParametersMessage()
  {}

  public GuildChangeMemberParametersMessage(
      java.math.BigInteger memberId, short rank, byte experienceGivenPercent, int rights)
  {
    this.memberId = memberId;
    this.rank = rank;
    this.experienceGivenPercent = experienceGivenPercent;
    this.rights = rights;
  }

  @Override
  public int getProtocolId()
  {
    return 5549;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.memberId);
    writer.write_vi16(this.rank);
    writer.write_i8(this.experienceGivenPercent);
    writer.write_vi32(this.rights);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.memberId = reader.read_ui64();
    this.rank = reader.read_vi16();
    this.experienceGivenPercent = reader.read_i8();
    this.rights = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GuildChangeMemberParametersMessage("
        + "memberId="
        + this.memberId
        + ", rank="
        + this.rank
        + ", experienceGivenPercent="
        + this.experienceGivenPercent
        + ", rights="
        + this.rights
        + ')';
  }
}
