// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionsListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1301;
  // array,com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject
  public com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject[] actions;

  public StartupActionsListMessage() {}

  public StartupActionsListMessage(
      com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject[] actions) {
    this.actions = actions;
  }

  public StartupActionsListMessage(
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject>
          actions) {
    this.actions =
        actions.toArray(
            com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject[]::new);
  }

  @Override
  public int getProtocolId() {
    return 1301;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(actions.length);

    for (int i = 0; i < actions.length; i++) {

      actions[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int actions_length = reader.read_ui16();
    this.actions =
        new com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject[actions_length];

    for (int i = 0; i < actions_length; i++) {

      com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject actions_it =
          new com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject();

      actions_it.deserialize(reader);
      this.actions[i] = actions_it;
    }
  }

  @Override
  public String toString() {

    return "StartupActionsListMessage("
        + "actions="
        + java.util.Arrays.toString(this.actions)
        + ')';
  }
}
