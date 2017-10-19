// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyMemberInformations
    extends com.ankamagames.dofus.network.types.game.character.choice.CharacterBaseInformations {
  public static final int PROTOCOL_ID = 90;
  // vi32
  public int lifePoints;
  // vi32
  public int maxLifePoints;
  // vi16
  public short prospecting;
  // ui8
  public short regenRate;
  // vi16
  public short initiative;
  // i8
  public byte alignmentSide;
  // i16
  public short worldX;
  // i16
  public short worldY;
  // f64
  public double mapId;
  // vi16
  public short subAreaId;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;
  // array,com.ankamagames.dofus.network.types.game.context.roleplay.party.companion.PartyCompanionMemberInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
          .PartyCompanionMemberInformations[]
      companions;

  public PartyMemberInformations()
  {}

  public PartyMemberInformations(
      java.math.BigInteger id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      byte breed,
      boolean sex,
      int lifePoints,
      int maxLifePoints,
      short prospecting,
      short regenRate,
      short initiative,
      byte alignmentSide,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionMemberInformations
              []
          companions)
  {

    super(id, name, level, entityLook, breed, sex);
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.prospecting = prospecting;
    this.regenRate = regenRate;
    this.initiative = initiative;
    this.alignmentSide = alignmentSide;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.status = status;
    this.companions = companions;
  }

  public PartyMemberInformations(
      java.math.BigInteger id,
      java.lang.String name,
      short level,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      byte breed,
      boolean sex,
      int lifePoints,
      int maxLifePoints,
      short prospecting,
      short regenRate,
      short initiative,
      byte alignmentSide,
      short worldX,
      short worldY,
      double mapId,
      short subAreaId,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionMemberInformations>
          companions)
  {

    super(id, name, level, entityLook, breed, sex);
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.prospecting = prospecting;
    this.regenRate = regenRate;
    this.initiative = initiative;
    this.alignmentSide = alignmentSide;
    this.worldX = worldX;
    this.worldY = worldY;
    this.mapId = mapId;
    this.subAreaId = subAreaId;
    this.status = status;
    this.companions =
        companions.toArray(
            com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                        .PartyCompanionMemberInformations
                    []
                ::new);
  }

  @Override
  public int getProtocolId()
  {
    return 90;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_vi32(this.lifePoints);
    writer.write_vi32(this.maxLifePoints);
    writer.write_vi16(this.prospecting);
    writer.write_ui8(this.regenRate);
    writer.write_vi16(this.initiative);
    writer.write_i8(this.alignmentSide);
    writer.write_i16(this.worldX);
    writer.write_i16(this.worldY);
    writer.write_f64(this.mapId);
    writer.write_vi16(this.subAreaId);
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
    writer.write_ui16(companions.length);

    for (int i = 0; i < companions.length; i++)
  {

      companions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.lifePoints = reader.read_vi32();
    this.maxLifePoints = reader.read_vi32();
    this.prospecting = reader.read_vi16();
    this.regenRate = reader.read_ui8();
    this.initiative = reader.read_vi16();
    this.alignmentSide = reader.read_i8();
    this.worldX = reader.read_i16();
    this.worldY = reader.read_i16();
    this.mapId = reader.read_f64();
    this.subAreaId = reader.read_vi16();

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);

    int companions_length = reader.read_ui16();
    this.companions =
        new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                .PartyCompanionMemberInformations[companions_length];

    for (int i = 0; i < companions_length; i++)
  {

      com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
              .PartyCompanionMemberInformations
          companions_it =
              new com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
                  .PartyCompanionMemberInformations();

      companions_it.deserialize(reader);
      this.companions[i] = companions_it;
    }
  }

  @Override
  public String toString()
  {

    return "PartyMemberInformations("
        + "id="
        + this.id
        + ", name="
        + this.name
        + ", level="
        + this.level
        + ", entityLook="
        + this.entityLook
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ", lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", prospecting="
        + this.prospecting
        + ", regenRate="
        + this.regenRate
        + ", initiative="
        + this.initiative
        + ", alignmentSide="
        + this.alignmentSide
        + ", worldX="
        + this.worldX
        + ", worldY="
        + this.worldY
        + ", mapId="
        + this.mapId
        + ", subAreaId="
        + this.subAreaId
        + ", status="
        + this.status
        + ", companions="
        + java.util.Arrays.toString(this.companions)
        + ')';
  }
}
