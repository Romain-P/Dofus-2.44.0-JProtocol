// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party.companion;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyCompanionUpdateLightMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyUpdateLightMessage {
  public static final int PROTOCOL_ID = 6472;
  // i8
  public byte indexId;

  public PartyCompanionUpdateLightMessage()
  {}

  public PartyCompanionUpdateLightMessage(
      int partyId,
      java.math.BigInteger id,
      int lifePoints,
      int maxLifePoints,
      short prospecting,
      short regenRate,
      byte indexId)
  {

    super(partyId, id, lifePoints, maxLifePoints, prospecting, regenRate);
    this.indexId = indexId;
  }

  @Override
  public int getProtocolId()
  {
    return 6472;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.indexId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.indexId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "PartyCompanionUpdateLightMessage("
        + "partyId="
        + this.partyId
        + ", id="
        + this.id
        + ", lifePoints="
        + this.lifePoints
        + ", maxLifePoints="
        + this.maxLifePoints
        + ", prospecting="
        + this.prospecting
        + ", regenRate="
        + this.regenRate
        + ", indexId="
        + this.indexId
        + ')';
  }
}
