// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameContextMoveElementMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 253;
  // com.ankamagames.dofus.network.types.game.context.EntityMovementInformations
  public com.ankamagames.dofus.network.types.game.context.EntityMovementInformations movement;

  public GameContextMoveElementMessage() {}

  public GameContextMoveElementMessage(
      com.ankamagames.dofus.network.types.game.context.EntityMovementInformations movement) {
    this.movement = movement;
  }

  @Override
  public int getProtocolId() {
    return 253;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.movement.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.movement =
        new com.ankamagames.dofus.network.types.game.context.EntityMovementInformations();
    this.movement.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameContextMoveElementMessage(" + "movement=" + this.movement + ')';
  }
}
