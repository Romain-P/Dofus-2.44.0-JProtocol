// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.lockable;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class LockableStateUpdateAbstractMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5671;
  // bool
  public boolean locked;

  public LockableStateUpdateAbstractMessage()
  {}

  public LockableStateUpdateAbstractMessage(boolean locked)
  {
    this.locked = locked;
  }

  @Override
  public int getProtocolId()
  {
    return 5671;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_bool(this.locked);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.locked = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "LockableStateUpdateAbstractMessage(" + "locked=" + this.locked + ')';
  }
}
