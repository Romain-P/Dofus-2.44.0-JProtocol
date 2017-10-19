// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LifePointsRegenBeginMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5684;
  // ui8
  public short regenRate;

  public LifePointsRegenBeginMessage()
  {}

  public LifePointsRegenBeginMessage(short regenRate)
  {
    this.regenRate = regenRate;
  }

  @Override
  public int getProtocolId()
  {
    return 5684;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.regenRate);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.regenRate = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "LifePointsRegenBeginMessage(" + "regenRate=" + this.regenRate + ')';
  }
}
