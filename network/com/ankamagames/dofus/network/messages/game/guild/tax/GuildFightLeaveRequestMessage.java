// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GuildFightLeaveRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5715;
  // f64
  public double taxCollectorId;
  // ui64
  public java.math.BigInteger characterId;

  public GuildFightLeaveRequestMessage()
  {}

  public GuildFightLeaveRequestMessage(double taxCollectorId, java.math.BigInteger characterId)
  {
    this.taxCollectorId = taxCollectorId;
    this.characterId = characterId;
  }

  @Override
  public int getProtocolId()
  {
    return 5715;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.taxCollectorId);
    writer.write_ui64(this.characterId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.taxCollectorId = reader.read_f64();
    this.characterId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "GuildFightLeaveRequestMessage("
        + "taxCollectorId="
        + this.taxCollectorId
        + ", characterId="
        + this.characterId
        + ')';
  }
}
