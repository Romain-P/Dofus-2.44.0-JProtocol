// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceFactsErrorMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6423;
  // vi32
  public int allianceId;

  public AllianceFactsErrorMessage() {}

  public AllianceFactsErrorMessage(int allianceId) {
    this.allianceId = allianceId;
  }

  @Override
  public int getProtocolId() {
    return 6423;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi32(this.allianceId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.allianceId = reader.read_vi32();
  }

  @Override
  public String toString() {

    return "AllianceFactsErrorMessage(" + "allianceId=" + this.allianceId + ')';
  }
}
