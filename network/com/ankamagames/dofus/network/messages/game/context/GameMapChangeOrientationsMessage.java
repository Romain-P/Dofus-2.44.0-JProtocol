// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameMapChangeOrientationsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6155;
  // array,com.ankamagames.dofus.network.types.game.context.ActorOrientation
  public com.ankamagames.dofus.network.types.game.context.ActorOrientation[] orientations;

  public GameMapChangeOrientationsMessage() {}

  public GameMapChangeOrientationsMessage(
      com.ankamagames.dofus.network.types.game.context.ActorOrientation[] orientations) {
    this.orientations = orientations;
  }

  public GameMapChangeOrientationsMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.context.ActorOrientation>
          orientations) {
    this.orientations =
        orientations.toArray(
            com.ankamagames.dofus.network.types.game.context.ActorOrientation[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6155;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(orientations.length);

    for (int i = 0; i < orientations.length; i++) {

      orientations[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int orientations_length = reader.read_ui16();
    this.orientations =
        new com.ankamagames.dofus.network.types.game.context.ActorOrientation[orientations_length];

    for (int i = 0; i < orientations_length; i++) {

      com.ankamagames.dofus.network.types.game.context.ActorOrientation orientations_it =
          new com.ankamagames.dofus.network.types.game.context.ActorOrientation();

      orientations_it.deserialize(reader);
      this.orientations[i] = orientations_it;
    }
  }

  @Override
  public String toString() {

    return "GameMapChangeOrientationsMessage("
        + "orientations="
        + java.util.Arrays.toString(this.orientations)
        + ')';
  }
}
