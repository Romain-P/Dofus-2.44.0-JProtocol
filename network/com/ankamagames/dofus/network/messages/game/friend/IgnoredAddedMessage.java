// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredAddedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5678;
  // com.ankamagames.dofus.network.types.game.friend.IgnoredInformations
  public com.ankamagames.dofus.network.types.game.friend.IgnoredInformations ignoreAdded;
  // bool
  public boolean session;

  public IgnoredAddedMessage()
  {}

  public IgnoredAddedMessage(
      com.ankamagames.dofus.network.types.game.friend.IgnoredInformations ignoreAdded,
      boolean session)
  {
    this.ignoreAdded = ignoreAdded;
    this.session = session;
  }

  @Override
  public int getProtocolId()
  {
    return 5678;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.ignoreAdded.getProtocolId());
    this.ignoreAdded.serialize(writer);
    writer.write_bool(this.session);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int ignoreAdded_typeId = reader.read_ui16();
    this.ignoreAdded =
        (com.ankamagames.dofus.network.types.game.friend.IgnoredInformations)
            InternalProtocolTypeManager.get(ignoreAdded_typeId);
    this.ignoreAdded.deserialize(reader);
    this.session = reader.read_bool();
  }

  @Override
  public String toString()
  {

    return "IgnoredAddedMessage("
        + "ignoreAdded="
        + this.ignoreAdded
        + ", session="
        + this.session
        + ')';
  }
}
