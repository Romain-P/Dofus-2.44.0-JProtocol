// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.fight.arena;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class ArenaFighterLeaveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6700;
  // com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations
      leaver;

  public ArenaFighterLeaveMessage()
  {}

  public ArenaFighterLeaveMessage(
      com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations leaver)
  {
    this.leaver = leaver;
  }

  @Override
  public int getProtocolId()
  {
    return 6700;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    this.leaver.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.leaver =
        new com.ankamagames.dofus.network.types.game.character.CharacterBasicMinimalInformations();
    this.leaver.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "ArenaFighterLeaveMessage(" + "leaver=" + this.leaver + ')';
  }
}
