// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyInvitationDungeonRequestMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .PartyInvitationRequestMessage {
  public static final int PROTOCOL_ID = 6245;
  // vi16
  public short dungeonId;

  public PartyInvitationDungeonRequestMessage() {}

  public PartyInvitationDungeonRequestMessage(java.lang.String name, short dungeonId) {

    super(name);
    this.dungeonId = dungeonId;
  }

  @Override
  public int getProtocolId() {
    return 6245;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.dungeonId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.dungeonId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "PartyInvitationDungeonRequestMessage("
        + "name="
        + this.name
        + ", dungeonId="
        + this.dungeonId
        + ')';
  }
}
