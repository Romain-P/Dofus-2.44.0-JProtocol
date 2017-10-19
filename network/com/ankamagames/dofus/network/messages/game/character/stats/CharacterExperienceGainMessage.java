// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.character.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterExperienceGainMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6321;
  // ui64
  public java.math.BigInteger experienceCharacter;
  // ui64
  public java.math.BigInteger experienceMount;
  // ui64
  public java.math.BigInteger experienceGuild;
  // ui64
  public java.math.BigInteger experienceIncarnation;

  public CharacterExperienceGainMessage()
  {}

  public CharacterExperienceGainMessage(
      java.math.BigInteger experienceCharacter,
      java.math.BigInteger experienceMount,
      java.math.BigInteger experienceGuild,
      java.math.BigInteger experienceIncarnation)
  {
    this.experienceCharacter = experienceCharacter;
    this.experienceMount = experienceMount;
    this.experienceGuild = experienceGuild;
    this.experienceIncarnation = experienceIncarnation;
  }

  @Override
  public int getProtocolId()
  {
    return 6321;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.experienceCharacter);
    writer.write_ui64(this.experienceMount);
    writer.write_ui64(this.experienceGuild);
    writer.write_ui64(this.experienceIncarnation);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.experienceCharacter = reader.read_ui64();
    this.experienceMount = reader.read_ui64();
    this.experienceGuild = reader.read_ui64();
    this.experienceIncarnation = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "CharacterExperienceGainMessage("
        + "experienceCharacter="
        + this.experienceCharacter
        + ", experienceMount="
        + this.experienceMount
        + ", experienceGuild="
        + this.experienceGuild
        + ", experienceIncarnation="
        + this.experienceIncarnation
        + ')';
  }
}
