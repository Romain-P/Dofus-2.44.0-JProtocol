// Created by Heat the 2017-10-19 04:03:15+02:00
package com.ankamagames.dofus.network.types.game.character.status;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PlayerStatusExtended
    extends com.ankamagames.dofus.network.types.game.character.status.PlayerStatus {
  public static final int PROTOCOL_ID = 414;
  // str
  public java.lang.String message;

  public PlayerStatusExtended()
  {}

  public PlayerStatusExtended(byte statusId, java.lang.String message)
  {

    super(statusId);
    this.message = message;
  }

  @Override
  public int getProtocolId()
  {
    return 414;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.message);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.message = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "PlayerStatusExtended("
        + "statusId="
        + this.statusId
        + ", message="
        + this.message
        + ')';
  }
}
