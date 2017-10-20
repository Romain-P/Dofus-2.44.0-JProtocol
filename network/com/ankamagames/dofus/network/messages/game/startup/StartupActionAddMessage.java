// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.startup;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StartupActionAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6538;
  // com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject
  public com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject newAction;

  public StartupActionAddMessage() {}

  public StartupActionAddMessage(
      com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject newAction) {
    this.newAction = newAction;
  }

  @Override
  public int getProtocolId() {
    return 6538;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.newAction.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.newAction = new com.ankamagames.dofus.network.types.game.startup.StartupActionAddObject();
    this.newAction.deserialize(reader);
  }

  @Override
  public String toString() {

    return "StartupActionAddMessage(" + "newAction=" + this.newAction + ')';
  }
}
