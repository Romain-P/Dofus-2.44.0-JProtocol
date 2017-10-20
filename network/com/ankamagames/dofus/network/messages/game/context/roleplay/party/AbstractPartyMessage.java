// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractPartyMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6274;
  // vi32
  public int partyId;

  public AbstractPartyMessage() {}

  public AbstractPartyMessage(int partyId) {
    this.partyId = partyId;
  }

  @Override
  public int getProtocolId() {
    return 6274;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.partyId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.partyId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "AbstractPartyMessage(" + "partyId=" + this.partyId + ')';
  }
}
