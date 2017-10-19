// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.guild.tax;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class TaxCollectorMovementRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5915;
  // f64
  public double collectorId;

  public TaxCollectorMovementRemoveMessage()
  {}

  public TaxCollectorMovementRemoveMessage(double collectorId)
  {
    this.collectorId = collectorId;
  }

  @Override
  public int getProtocolId()
  {
    return 5915;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.collectorId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.collectorId = reader.read_f64();
  }

  @Override
  public String toString()
  {

    return "TaxCollectorMovementRemoveMessage(" + "collectorId=" + this.collectorId + ')';
  }
}
