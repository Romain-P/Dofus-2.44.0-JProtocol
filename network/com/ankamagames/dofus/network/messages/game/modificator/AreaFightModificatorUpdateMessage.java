// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.modificator;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AreaFightModificatorUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6493;
  // i32
  public int spellPairId;

  public AreaFightModificatorUpdateMessage()
  {}

  public AreaFightModificatorUpdateMessage(int spellPairId)
  {
    this.spellPairId = spellPairId;
  }

  @Override
  public int getProtocolId()
  {
    return 6493;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i32(this.spellPairId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.spellPairId = reader.read_i32();
  }

  @Override
  public String toString()
  {

    return "AreaFightModificatorUpdateMessage(" + "spellPairId=" + this.spellPairId + ')';
  }
}
