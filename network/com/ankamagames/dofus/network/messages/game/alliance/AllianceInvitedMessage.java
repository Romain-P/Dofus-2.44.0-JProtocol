// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.alliance;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AllianceInvitedMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6397;
  // ui64
  public java.math.BigInteger recruterId;
  // str
  public java.lang.String recruterName;
  // com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
      allianceInfo;

  public AllianceInvitedMessage()
  {}

  public AllianceInvitedMessage(
      java.math.BigInteger recruterId,
      java.lang.String recruterName,
      com.ankamagames.dofus.network.types.game.context.roleplay.BasicNamedAllianceInformations
          allianceInfo)
  {
    this.recruterId = recruterId;
    this.recruterName = recruterName;
    this.allianceInfo = allianceInfo;
  }

  @Override
  public int getProtocolId()
  {
    return 6397;
  }

  @Override
  public void serialize(DataWriter writer)
  {
    writer.write_ui64(this.recruterId);
    writer.write_str(this.recruterName);
    this.allianceInfo.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {
    this.recruterId = reader.read_ui64();
    this.recruterName = reader.read_str();
    this.allianceInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay
            .BasicNamedAllianceInformations();
    this.allianceInfo.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "AllianceInvitedMessage("
        + "recruterId="
        + this.recruterId
        + ", recruterName="
        + this.recruterName
        + ", allianceInfo="
        + this.allianceInfo
        + ')';
  }
}
