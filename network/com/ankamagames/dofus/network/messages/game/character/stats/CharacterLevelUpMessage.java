// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterLevelUpMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5670;
  // ui8
  public short newLevel;

  public CharacterLevelUpMessage()
  {}

  public CharacterLevelUpMessage(short newLevel)
  {
    this.newLevel = newLevel;
  }

  @Override
  public int getProtocolId()
  {
    return 5670;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui8(this.newLevel);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.newLevel = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "CharacterLevelUpMessage(" + "newLevel=" + this.newLevel + ')';
  }
}
