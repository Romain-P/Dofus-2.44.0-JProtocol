// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceModificationNameAndTagValidMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6449;
  // str
  public java.lang.String allianceName;
  // str
  public java.lang.String allianceTag;

  public AllianceModificationNameAndTagValidMessage()
  {}

  public AllianceModificationNameAndTagValidMessage(
      java.lang.String allianceName, java.lang.String allianceTag)
  {
    this.allianceName = allianceName;
    this.allianceTag = allianceTag;
  }

  @Override
  public int getProtocolId()
  {
    return 6449;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_str(this.allianceName);
    writer.write_str(this.allianceTag);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.allianceName = reader.read_str();
    this.allianceTag = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "AllianceModificationNameAndTagValidMessage("
        + "allianceName="
        + this.allianceName
        + ", allianceTag="
        + this.allianceTag
        + ')';
  }
}
