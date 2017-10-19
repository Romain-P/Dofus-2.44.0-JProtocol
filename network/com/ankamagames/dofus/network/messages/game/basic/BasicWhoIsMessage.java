// Created by Heat the 2017-10-19 04:03:11+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class BasicWhoIsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 180;
  // flag,_loc2_,0
  public boolean self;
  // flag,_loc2_,1
  public boolean verbose;
  // i8
  public byte position;
  // str
  public java.lang.String accountNickname;
  // i32
  public int accountId;
  // str
  public java.lang.String playerName;
  // ui64
  public java.math.BigInteger playerId;
  // i16
  public short areaId;
  // i16
  public short serverId;
  // i16
  public short originServerId;
  // array,com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos
  public com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos[] socialGroups;
  // i8
  public byte playerState;

  public BasicWhoIsMessage()
  {}

  public BasicWhoIsMessage(
      boolean self,
      boolean verbose,
      byte position,
      java.lang.String accountNickname,
      int accountId,
      java.lang.String playerName,
      java.math.BigInteger playerId,
      short areaId,
      short serverId,
      short originServerId,
      com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos[] socialGroups,
      byte playerState)
  {
    this.self = self;
    this.verbose = verbose;
    this.position = position;
    this.accountNickname = accountNickname;
    this.accountId = accountId;
    this.playerName = playerName;
    this.playerId = playerId;
    this.areaId = areaId;
    this.serverId = serverId;
    this.originServerId = originServerId;
    this.socialGroups = socialGroups;
    this.playerState = playerState;
  }

  public BasicWhoIsMessage(
      boolean self,
      boolean verbose,
      byte position,
      java.lang.String accountNickname,
      int accountId,
      java.lang.String playerName,
      java.math.BigInteger playerId,
      short areaId,
      short serverId,
      short originServerId,
      java.util.stream.Stream<
              com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos>
          socialGroups,
      byte playerState)
  {
    this.self = self;
    this.verbose = verbose;
    this.position = position;
    this.accountNickname = accountNickname;
    this.accountId = accountId;
    this.playerName = playerName;
    this.playerId = playerId;
    this.areaId = areaId;
    this.serverId = serverId;
    this.originServerId = originServerId;
    this.socialGroups =
        socialGroups.toArray(
            com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos[]::new);
    this.playerState = playerState;
  }

  @Override
  public int getProtocolId()
  {
    return 180;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.self, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.verbose, 1);
    writer.write_i8(_loc2_);
    writer.write_i8(this.position);
    writer.write_str(this.accountNickname);
    writer.write_i32(this.accountId);
    writer.write_str(this.playerName);
    writer.write_ui64(this.playerId);
    writer.write_i16(this.areaId);
    writer.write_i16(this.serverId);
    writer.write_i16(this.originServerId);
    writer.write_ui16(socialGroups.length);

    for (int i = 0; i < socialGroups.length; i++)
  {

      writer.write_ui16(socialGroups[i].getProtocolId());

      socialGroups[i].serialize(writer);
    }
    writer.write_i8(this.playerState);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    int _loc2_ = reader.read_i8();
    this.self = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.verbose = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.position = reader.read_i8();
    this.accountNickname = reader.read_str();
    this.accountId = reader.read_i32();
    this.playerName = reader.read_str();
    this.playerId = reader.read_ui64();
    this.areaId = reader.read_i16();
    this.serverId = reader.read_i16();
    this.originServerId = reader.read_i16();

    int socialGroups_length = reader.read_ui16();
    this.socialGroups =
        new com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos
            [socialGroups_length];

    for (int i = 0; i < socialGroups_length; i++)
  {

      int socialGroups_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos socialGroups_it =
          (com.ankamagames.dofus.network.types.game.social.AbstractSocialGroupInfos)
              InternalProtocolTypeManager.get(socialGroups_it_typeId);

      socialGroups_it.deserialize(reader);
      this.socialGroups[i] = socialGroups_it;
    }
    this.playerState = reader.read_i8();
  }

  @Override
  public String toString()
  {

    return "BasicWhoIsMessage("
        + "self="
        + this.self
        + ", verbose="
        + this.verbose
        + ", position="
        + this.position
        + ", accountNickname="
        + this.accountNickname
        + ", accountId="
        + this.accountId
        + ", playerName="
        + this.playerName
        + ", playerId="
        + this.playerId
        + ", areaId="
        + this.areaId
        + ", serverId="
        + this.serverId
        + ", originServerId="
        + this.originServerId
        + ", socialGroups="
        + java.util.Arrays.toString(this.socialGroups)
        + ", playerState="
        + this.playerState
        + ')';
  }
}
