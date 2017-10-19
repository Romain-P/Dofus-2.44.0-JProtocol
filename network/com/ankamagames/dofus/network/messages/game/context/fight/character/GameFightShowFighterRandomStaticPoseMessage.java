// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightShowFighterRandomStaticPoseMessage
    extends com.ankamagames.dofus.network.messages.game.context.fight.character
        .GameFightShowFighterMessage {
  public static final int PROTOCOL_ID = 6218;

  public GameFightShowFighterRandomStaticPoseMessage()
  {}

  public GameFightShowFighterRandomStaticPoseMessage(
      com.ankamagames.dofus.network.types.game.context.fight.GameFightFighterInformations
          informations)
  {

    super(informations);
  }

  @Override
  public int getProtocolId()
  {
    return 6218;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "GameFightShowFighterRandomStaticPoseMessage("
        + "informations="
        + this.informations
        + ')';
  }
}
