// Created by Heat the 2017-10-19 04:03:10+02:00
package com.ankamagames.dofus.network.messages.connection;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdentificationSuccessMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 22;
  // flag,_loc2_,0
  public boolean hasRights;
  // flag,_loc2_,1
  public boolean wasAlreadyConnected;
  // str
  public java.lang.String login;
  // str
  public java.lang.String nickname;
  // i32
  public int accountId;
  // i8
  public byte communityId;
  // str
  public java.lang.String secretQuestion;
  // f64
  public double accountCreation;
  // f64
  public double subscriptionElapsedDuration;
  // f64
  public double subscriptionEndDate;
  // ui8
  public short havenbagAvailableRoom;

  public IdentificationSuccessMessage()
  {}

  public IdentificationSuccessMessage(
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
      short havenbagAvailableRoom)
  {
    this.hasRights = hasRights;
    this.wasAlreadyConnected = wasAlreadyConnected;
    this.login = login;
    this.nickname = nickname;
    this.accountId = accountId;
    this.communityId = communityId;
    this.secretQuestion = secretQuestion;
    this.accountCreation = accountCreation;
    this.subscriptionElapsedDuration = subscriptionElapsedDuration;
    this.subscriptionEndDate = subscriptionEndDate;
    this.havenbagAvailableRoom = havenbagAvailableRoom;
  }

  @Override
  public int getProtocolId()
  {
    return 22;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.hasRights, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.wasAlreadyConnected, 1);
    writer.write_i8(_loc2_);
    writer.write_str(this.login);
    writer.write_str(this.nickname);
    writer.write_i32(this.accountId);
    writer.write_i8(this.communityId);
    writer.write_str(this.secretQuestion);
    writer.write_f64(this.accountCreation);
    writer.write_f64(this.subscriptionElapsedDuration);
    writer.write_f64(this.subscriptionEndDate);
    writer.write_ui8(this.havenbagAvailableRoom);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.hasRights = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.wasAlreadyConnected = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.login = reader.read_str();
    this.nickname = reader.read_str();
    this.accountId = reader.read_i32();
    this.communityId = reader.read_i8();
    this.secretQuestion = reader.read_str();
    this.accountCreation = reader.read_f64();
    this.subscriptionElapsedDuration = reader.read_f64();
    this.subscriptionEndDate = reader.read_f64();
    this.havenbagAvailableRoom = reader.read_ui8();
  }

  @Override
  public String toString()
  {

    return "IdentificationSuccessMessage("
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
        + ')';
  }
}
