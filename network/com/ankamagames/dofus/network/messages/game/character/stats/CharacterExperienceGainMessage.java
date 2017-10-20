// Created by Heat the 2017-10-20 01:53:23+02:00
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
  // vi64
  public long experienceCharacter;
  // vi64
  public long experienceMount;
  // vi64
  public long experienceGuild;
  // vi64
  public long experienceIncarnation;

  public CharacterExperienceGainMessage() {}

  public CharacterExperienceGainMessage(
      long experienceCharacter,
      long experienceMount,
      long experienceGuild,
      long experienceIncarnation) {
    this.experienceCharacter = experienceCharacter;
    this.experienceMount = experienceMount;
    this.experienceGuild = experienceGuild;
    this.experienceIncarnation = experienceIncarnation;
  }

  @Override
  public int getProtocolId() {
    return 6321;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.experienceCharacter);
    writer.write_vi64(this.experienceMount);
    writer.write_vi64(this.experienceGuild);
    writer.write_vi64(this.experienceIncarnation);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.experienceCharacter = reader.read_vi64();
    this.experienceMount = reader.read_vi64();
    this.experienceGuild = reader.read_vi64();
    this.experienceIncarnation = reader.read_vi64();
  }

  @Override
  public String toString() {

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
