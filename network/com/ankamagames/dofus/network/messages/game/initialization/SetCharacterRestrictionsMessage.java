// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.initialization;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SetCharacterRestrictionsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 170;
  // f64
  public double actorId;
  // com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
  public com.ankamagames.dofus.network.types.game.character.restriction
          .ActorRestrictionsInformations
      restrictions;

  public SetCharacterRestrictionsMessage()
  {}

  public SetCharacterRestrictionsMessage(
      double actorId,
      com.ankamagames.dofus.network.types.game.character.restriction.ActorRestrictionsInformations
          restrictions)
  {
    this.actorId = actorId;
    this.restrictions = restrictions;
  }

  @Override
  public int getProtocolId()
  {
    return 170;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_f64(this.actorId);
    this.restrictions.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.actorId = reader.read_f64();
    this.restrictions =
        new com.ankamagames.dofus.network.types.game.character.restriction
            .ActorRestrictionsInformations();
    this.restrictions.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "SetCharacterRestrictionsMessage("
        + "actorId="
        + this.actorId
        + ", restrictions="
        + this.restrictions
        + ')';
  }
}
