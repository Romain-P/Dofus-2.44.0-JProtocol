// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightNoSpellCastMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6132;
  // vi32
  public int spellLevelId;

  public GameActionFightNoSpellCastMessage()
  {}

  public GameActionFightNoSpellCastMessage(int spellLevelId)
  {
    this.spellLevelId = spellLevelId;
  }

  @Override
  public int getProtocolId()
  {
    return 6132;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_vi32(this.spellLevelId);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.spellLevelId = reader.read_vi32();
  }

  @Override
  public String toString()
  {

    return "GameActionFightNoSpellCastMessage(" + "spellLevelId=" + this.spellLevelId + ')';
  }
}
