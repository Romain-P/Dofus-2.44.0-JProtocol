// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.treasureHunt;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PortalUseRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6492;
  // vi32
  public int portalId;

  public PortalUseRequestMessage() {}

  public PortalUseRequestMessage(int portalId) {
    this.portalId = portalId;
  }

  @Override
  public int getProtocolId() {
    return 6492;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.portalId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.portalId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "PortalUseRequestMessage(" + "portalId=" + this.portalId + ')';
  }
}
