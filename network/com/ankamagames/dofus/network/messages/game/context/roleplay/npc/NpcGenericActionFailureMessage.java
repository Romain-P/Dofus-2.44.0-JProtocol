// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.npc;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NpcGenericActionFailureMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5900;

  public NpcGenericActionFailureMessage() {}

  public static final NpcGenericActionFailureMessage i = new NpcGenericActionFailureMessage();

  @Override
  public boolean isAlwaysEmpty() {
    return true;
  }

  @Override
  public int getProtocolId() {
    return 5900;
  }

  @Override
  public void serialize(DataWriter writer) {}

  @Override
  public void deserialize(DataReader reader) {}

  @Override
  public String toString() {

    return "NpcGenericActionFailureMessage";
  }
}
