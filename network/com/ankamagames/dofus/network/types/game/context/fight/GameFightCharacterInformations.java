// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightCharacterInformations
    extends com.ankamagames.dofus.network.types.game.context.fight
        .GameFightFighterNamedInformations {
  public static final int PROTOCOL_ID = 46;
  // ui8
  public short level;
  // com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
  public com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
      alignmentInfos;
  // i8
  public byte breed;
  // bool
  public boolean sex;

  public GameFightCharacterInformations() {}

  public GameFightCharacterInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      byte teamId,
      byte wave,
      boolean alive,
      com.ankamagames.dofus.network.types.game.context.fight.GameFightMinimalStats stats,
      short[] previousPositions,
      java.lang.String name,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      short level,
      com.ankamagames.dofus.network.types.game.character.alignment.ActorAlignmentInformations
          alignmentInfos,
      byte breed,
      boolean sex) {

    super(
        contextualId,
        look,
        disposition,
        teamId,
        wave,
        alive,
        stats,
        previousPositions,
        name,
        status);
    this.level = level;
    this.alignmentInfos = alignmentInfos;
    this.breed = breed;
    this.sex = sex;
  }

  @Override
  public int getProtocolId() {
    return 46;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui8(this.level);
    this.alignmentInfos.serialize(writer);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.level = reader.read_ui8();
    this.alignmentInfos =
        new com.ankamagames.dofus.network.types.game.character.alignment
            .ActorAlignmentInformations();
    this.alignmentInfos.deserialize(reader);
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();
  }

  @Override
  public String toString() {

    return "GameFightCharacterInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", teamId="
        + this.teamId
        + ", wave="
        + this.wave
        + ", alive="
        + this.alive
        + ", stats="
        + this.stats
        + ", previousPositions="
        + java.util.Arrays.toString(this.previousPositions)
        + ", name="
        + this.name
        + ", status="
        + this.status
        + ", level="
        + this.level
        + ", alignmentInfos="
        + this.alignmentInfos
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ')';
  }
}
