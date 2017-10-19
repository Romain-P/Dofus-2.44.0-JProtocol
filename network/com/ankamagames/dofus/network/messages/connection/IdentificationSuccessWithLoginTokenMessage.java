// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationSuccessWithLoginTokenMessage
    extends com.ankamagames.dofus.network.messages.connection.IdentificationSuccessMessage {
  public static final int PROTOCOL_ID = 6209;
  // str
  public java.lang.String loginToken;

  public IdentificationSuccessWithLoginTokenMessage()
  {}

  public IdentificationSuccessWithLoginTokenMessage(
      boolean hasRights,
      boolean wasAlreadyConnected,
      java.lang.String login,
      java.lang.String nickname,
      int accountId,
      byte communityId,
      java.lang.String secretQuestion,
      double accountCreation,
      double subscriptionElapsedDuration,
      double subscriptionEndDate,
      short havenbagAvailableRoom,
      java.lang.String loginToken)
  {

    super(
        hasRights,
        wasAlreadyConnected,
        login,
        nickname,
        accountId,
        communityId,
        secretQuestion,
        accountCreation,
        subscriptionElapsedDuration,
        subscriptionEndDate,
        havenbagAvailableRoom);
    this.loginToken = loginToken;
  }

  @Override
  public int getProtocolId()
  {
    return 6209;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);
    writer.write_str(this.loginToken);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);
    this.loginToken = reader.read_str();
  }

  @Override
  public String toString()
  {

    return "IdentificationSuccessWithLoginTokenMessage("
        + "hasRights="
        + this.hasRights
        + ", wasAlreadyConnected="
        + this.wasAlreadyConnected
        + ", login="
        + this.login
        + ", nickname="
        + this.nickname
        + ", accountId="
        + this.accountId
        + ", communityId="
        + this.communityId
        + ", secretQuestion="
        + this.secretQuestion
        + ", accountCreation="
        + this.accountCreation
        + ", subscriptionElapsedDuration="
        + this.subscriptionElapsedDuration
        + ", subscriptionEndDate="
        + this.subscriptionEndDate
        + ", havenbagAvailableRoom="
        + this.havenbagAvailableRoom
        + ", loginToken="
        + this.loginToken
        + ')';
  }
}
