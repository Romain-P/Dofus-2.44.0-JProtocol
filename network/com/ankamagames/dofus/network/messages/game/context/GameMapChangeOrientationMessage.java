// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapChangeOrientationMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 946;
  // com.ankamagames.dofus.network.types.game.context.ActorOrientation
  public com.ankamagames.dofus.network.types.game.context.ActorOrientation orientation;

  public GameMapChangeOrientationMessage() {}

  public GameMapChangeOrientationMessage(
      com.ankamagames.dofus.network.types.game.context.ActorOrientation orientation) {
    this.orientation = orientation;
  }

  @Override
  public int getProtocolId() {
    return 946;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.orientation.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.orientation = new com.ankamagames.dofus.network.types.game.context.ActorOrientation();
    this.orientation.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameMapChangeOrientationMessage(" + "orientation=" + this.orientation + ')';
  }
}
