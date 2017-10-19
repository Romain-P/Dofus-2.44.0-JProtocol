// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayTaxCollectorFightRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5954;
  // f64
  public double taxCollectorId;

  public GameRolePlayTaxCollectorFightRequestMessage()
  {}

  public GameRolePlayTaxCollectorFightRequestMessage(double taxCollectorId)
  {
    this.taxCollectorId = taxCollectorId;
  }

  @Override
  public int getProtocolId()
  {
    return 5954;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.taxCollectorId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.taxCollectorId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayTaxCollectorFightRequestMessage("
        + "taxCollectorId="
        + this.taxCollectorId
        + ')';
  }
}