// Created by Heat the 2017-10-19 04:03:12+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayShowActorWithEventMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay
        .GameRolePlayShowActorMessage {
  public static final int PROTOCOL_ID = 6407;
  // i8
  public byte actorEventId;

  public GameRolePlayShowActorWithEventMessage()
  {}

  public GameRolePlayShowActorWithEventMessage(
      com.ankamagames.dofus.network.types.game.context.roleplay.GameRolePlayActorInformations
          informations,
      byte actorEventId)
  {

    super(informations);
    this.actorEventId = actorEventId;
  }

  @Override
  public int getProtocolId()
  {
    return 6407;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_i8(this.actorEventId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.actorEventId = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "GameRolePlayShowActorWithEventMessage("
        + "informations="
        + this.informations
        + ", actorEventId="
        + this.actorEventId
        + ')';
  }
}
