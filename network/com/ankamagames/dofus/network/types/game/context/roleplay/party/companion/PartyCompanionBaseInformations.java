// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.context.roleplay.party.companion;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCompanionBaseInformations extends NetworkType {
  public static final int PROTOCOL_ID = 453;
  // i8
  public byte indexId;
  // i8
  public byte companionGenericId;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook entityLook;

  public PartyCompanionBaseInformations()
  {}

  public PartyCompanionBaseInformations(
      byte indexId,
      byte companionGenericId,
      com.ankamagames.dofus.network.types.game.look.EntityLook entityLook)
  {
    this.indexId = indexId;
    this.companionGenericId = companionGenericId;
    this.entityLook = entityLook;
  }

  @Override
  public int getProtocolId()
  {
    return 453;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_i8(this.indexId);
    writer.write_i8(this.companionGenericId);
    this.entityLook.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.indexId = reader.read_i8();
    this.companionGenericId = reader.read_i8();
    this.entityLook = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.entityLook.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "PartyCompanionBaseInformations("
        + "indexId="
        + this.indexId
        + ", companionGenericId="
        + this.companionGenericId
        + ", entityLook="
        + this.entityLook
        + ')';
  }
}
