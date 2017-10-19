// Created by Heat the 2017-10-19 04:03:16+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendOnlineInformations
    extends com.ankamagames.dofus.network.types.game.friend.FriendInformations {
  public static final int PROTOCOL_ID = 92;
  // flag,_loc2_,0
  public boolean sex;
  // flag,_loc2_,1
  public boolean havenBagShared;
  // ui64
  public java.math.BigInteger playerId;
  // str
  public java.lang.String playerName;
  // ui8
  public short level;
  // i8
  public byte alignmentSide;
  // i8
  public byte breed;
  // com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations
  public com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo;
  // vi16
  public short moodSmileyId;
  // com.ankamagames.dofus.network.types.game.character.status.PlayerStatus
  public com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status;

  public FriendOnlineInformations()
  {}

  public FriendOnlineInformations(
      int accountId,
      java.lang.String accountName,
      byte playerState,
      short lastConnection,
      int achievementPoints,
      boolean sex,
      boolean havenBagShared,
      java.math.BigInteger playerId,
      java.lang.String playerName,
      short level,
      byte alignmentSide,
      byte breed,
      com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations guildInfo,
      short moodSmileyId,
      com.ankamagames.dofus.network.types.game.character.status.PlayerStatus status)
  {

    super(accountId, accountName, playerState, lastConnection, achievementPoints);
    this.sex = sex;
    this.havenBagShared = havenBagShared;
    this.playerId = playerId;
    this.playerName = playerName;
    this.level = level;
    this.alignmentSide = alignmentSide;
    this.breed = breed;
    this.guildInfo = guildInfo;
    this.moodSmileyId = moodSmileyId;
    this.status = status;
  }

  @Override
  public int getProtocolId()
  {
    return 92;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.sex, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.havenBagShared, 1);
    writer.write_i8(_loc2_);
    writer.write_ui64(this.playerId);
    writer.write_str(this.playerName);
    writer.write_ui8(this.level);
    writer.write_i8(this.alignmentSide);
    writer.write_i8(this.breed);
    this.guildInfo.serialize(writer);
    writer.write_vi16(this.moodSmileyId);
    writer.write_ui16(this.status.getProtocolId());
    this.status.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.sex = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.havenBagShared = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.playerId = reader.read_ui64();
    this.playerName = reader.read_str();
    this.level = reader.read_ui8();
    this.alignmentSide = reader.read_i8();
    this.breed = reader.read_i8();
    this.guildInfo =
        new com.ankamagames.dofus.network.types.game.context.roleplay.GuildInformations();
    this.guildInfo.deserialize(reader);
    this.moodSmileyId = reader.read_vi16();

    int status_typeId = reader.read_ui16();
    this.status =
        (com.ankamagames.dofus.network.types.game.character.status.PlayerStatus)
            InternalProtocolTypeManager.get(status_typeId);
    this.status.deserialize(reader);
  }

  @Override
  public String toString()
  {

    return "FriendOnlineInformations("
        + "accountId="
        + this.accountId
        + ", accountName="
        + this.accountName
        + ", playerState="
        + this.playerState
        + ", lastConnection="
        + this.lastConnection
        + ", achievementPoints="
        + this.achievementPoints
        + ", sex="
        + this.sex
        + ", havenBagShared="
        + this.havenBagShared
        + ", playerId="
        + this.playerId
        + ", playerName="
        + this.playerName
        + ", level="
        + this.level
        + ", alignmentSide="
        + this.alignmentSide
        + ", breed="
        + this.breed
        + ", guildInfo="
        + this.guildInfo
        + ", moodSmileyId="
        + this.moodSmileyId
        + ", status="
        + this.status
        + ')';
  }
}
