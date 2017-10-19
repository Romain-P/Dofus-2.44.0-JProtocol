// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6452;
  // com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation
  public com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation fight;

  public PrismFightAddedMessage()
  {}

  public PrismFightAddedMessage(
      com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation fight)
  {
    this.fight = fight;
  }

  @Override
  public int getProtocolId()
  {
    return 6452;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.fight.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.fight = new com.ankamagames.dofus.network.types.game.prism.PrismFightersInformation();
    this.fight.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PrismFightAddedMessage(" + "fight=" + this.fight + ')';
  }
}
