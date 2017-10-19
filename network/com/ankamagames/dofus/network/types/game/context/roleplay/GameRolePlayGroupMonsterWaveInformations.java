// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayGroupMonsterWaveInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay
        .GameRolePlayGroupMonsterInformations {
  public static final int PROTOCOL_ID = 464;
  // i8
  public byte nbWaves;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations[]
      alternatives;

  public GameRolePlayGroupMonsterWaveInformations()
  {}

  public GameRolePlayGroupMonsterWaveInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      boolean keyRingBonus,
      boolean hasHardcoreDrop,
      boolean hasAVARewardToken,
      com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
          staticInfos,
      double creationTime,
      int ageBonusRate,
      byte lootShare,
      byte alignmentSide,
      byte nbWaves,
      com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations[]
          alternatives)
  {

    super(
        contextualId,
        look,
        disposition,
        keyRingBonus,
        hasHardcoreDrop,
        hasAVARewardToken,
        staticInfos,
        creationTime,
        ageBonusRate,
        lootShare,
        alignmentSide);
    this.nbWaves = nbWaves;
    this.alternatives = alternatives;
  }

  public GameRolePlayGroupMonsterWaveInformations(
      double contextualId,
      com.ankamagames.dofus.network.types.game.look.EntityLook look,
      com.ankamagames.dofus.network.types.game.context.EntityDispositionInformations disposition,
      boolean keyRingBonus,
      boolean hasHardcoreDrop,
      boolean hasAVARewardToken,
      com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
          staticInfos,
      double creationTime,
      int ageBonusRate,
      byte lootShare,
      byte alignmentSide,
      byte nbWaves,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay
                  .GroupMonsterStaticInformations>
          alternatives)
  {

    super(
        contextualId,
        look,
        disposition,
        keyRingBonus,
        hasHardcoreDrop,
        hasAVARewardToken,
        staticInfos,
        creationTime,
        ageBonusRate,
        lootShare,
        alignmentSide);
    this.nbWaves = nbWaves;
    this.alternatives =
        alternatives.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 464;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.nbWaves);
    writer.write_ui16(alternatives.length);

    for (int i = 0; i < alternatives.length; i++)
  {

      writer.write_ui16(alternatives[i].getProtocolId());

      alternatives[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.nbWaves = reader.read_i8();

    int alternatives_length = reader.read_ui16();
    this.alternatives =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
            [alternatives_length];

    for (int i = 0; i < alternatives_length; i++)
  {

      int alternatives_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.context.roleplay.GroupMonsterStaticInformations
          alternatives_it =
              (com.ankamagames.dofus.network.types.game.context.roleplay
                      .GroupMonsterStaticInformations)
                  InternalProtocolTypeManager.get(alternatives_it_typeId);

      alternatives_it.deserialize(reader);
      this.alternatives[i] = alternatives_it;
    }
  }

  @Override
  public String toString()
  {

    return "GameRolePlayGroupMonsterWaveInformations("
        + "contextualId="
        + this.contextualId
        + ", look="
        + this.look
        + ", disposition="
        + this.disposition
        + ", keyRingBonus="
        + this.keyRingBonus
        + ", hasHardcoreDrop="
        + this.hasHardcoreDrop
        + ", hasAVARewardToken="
        + this.hasAVARewardToken
        + ", staticInfos="
        + this.staticInfos
        + ", creationTime="
        + this.creationTime
        + ", ageBonusRate="
        + this.ageBonusRate
        + ", lootShare="
        + this.lootShare
        + ", alignmentSide="
        + this.alignmentSide
        + ", nbWaves="
        + this.nbWaves
        + ", alternatives="
        + java.util.Arrays.toString(this.alternatives)
        + ')';
  }
}
