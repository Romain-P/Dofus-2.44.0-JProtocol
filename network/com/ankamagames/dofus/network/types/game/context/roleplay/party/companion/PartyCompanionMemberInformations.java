// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party.companion;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCompanionMemberInformations
    extends com.ankamagames.dofus.network.types.game.context.roleplay.party.companion
        .PartyCompanionBaseInformations {
  public static final int PROTOCOL_ID = 452;
  // vi16
  public short initiative;
  // vi32
  public int lifePoints;
  // vi32
  public int maxLifePoints;
  // vi16
  public short prospecting;
  // ui8
  public short regenRate;

  public PartyCompanionMemberInformations() {}

  public PartyCompanionMemberInformations(
      byte indexId,
      byte companionGenericId,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook,
      short initiative,
      int lifePoints,
      int maxLifePoints,
      short prospecting,
      short regenRate) {

    super(indexId, companionGenericId, entityLook);
    this.initiative = initiative;
    this.lifePoints = lifePoints;
    this.maxLifePoints = maxLifePoints;
    this.prospecting = prospecting;
    this.regenRate = regenRate;
  }

  @Override
  public int getProtocolId() {
    return 452;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.initiative);
    writer.write_vi32(this.lifePoints);
    writer.write_vi32(this.maxLifePoints);
    writer.write_vi16(this.prospecting);
    writer.write_ui8(this.regenRate);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.initiative = reader.read_vi16();
    this.lifePoints = reader.read_vi32();
    this.maxLifePoints = reader.read_vi32();
    this.prospecting = reader.read_vi16();
    this.regenRate = reader.read_ui8();
  }

  @Override
  public String toString() {

    return "PartyCompanionMemberInformations("
        + "indexId="
        + this.indexId
        + ", companionGenericId="
        + this.companionGenericId
        + ", entityLook="
        + this.entityLook
        + ", initiative="
        + this.initiative
        + ", lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", prospecting="
        + this.prospecting
        + ", regenRate="
        + this.regenRate
        + ')';
  }
}
