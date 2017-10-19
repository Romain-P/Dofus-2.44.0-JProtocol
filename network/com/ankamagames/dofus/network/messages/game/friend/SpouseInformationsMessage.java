// Created by Heat the 2017-10-19 04:03:14+02:00
package com.ankamagames.dofus.network.messages.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class SpouseInformationsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6356;
  // com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations
  public com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations spouse;

  public SpouseInformationsMessage()
  {}

  public SpouseInformationsMessage(
      com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations spouse)
  {
    this.spouse = spouse;
  }

  @Override
  public int getProtocolId()
  {
    return 6356;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui16(this.spouse.getProtocolId());
    this.spouse.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int spouse_typeId = reader.read_ui16();
    this.spouse =
        (com.ankamagames.dofus.network.types.game.friend.FriendSpouseInformations)
            InternalProtocolTypeManager.get(spouse_typeId);
    this.spouse.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "SpouseInformationsMessage(" + "spouse=" + this.spouse + ')';
  }
}
