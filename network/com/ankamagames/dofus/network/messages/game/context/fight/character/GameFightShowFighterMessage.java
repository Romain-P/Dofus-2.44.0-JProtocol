// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightShowFighterMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5864;
  // com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
  public com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
      informations;

  public GameFightShowFighterMessage()
  {}

  public GameFightShowFighterMessage(
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
          informations)
  {
    this.informations = informations;
  }

  @Override
  public int getProtocolId()
  {
    return 5864;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.informations.getProtocolId());
    this.informations.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int informations_typeId = reader.read_ui16();
    this.informations =
        (com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations)
            InternalProtocolTypeManager.get(informations_typeId);
    this.informations.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameFightShowFighterMessage(" + "informations=" + this.informations + ')';
  }
}
