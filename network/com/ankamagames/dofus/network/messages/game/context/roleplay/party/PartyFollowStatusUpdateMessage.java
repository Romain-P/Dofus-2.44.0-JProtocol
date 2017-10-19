// Created by Heat the 2017-10-19 04:03:13+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.party;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PartyFollowStatusUpdateMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.party
        .AbstractPartyMessage {
  public static final int PROTOCOL_ID = 5581;
  // flag,_loc2_,0
  public boolean success;
  // flag,_loc2_,1
  public boolean isFollowed;
  // ui64
  public java.math.BigInteger followedId;

  public PartyFollowStatusUpdateMessage()
  {}

  public PartyFollowStatusUpdateMessage(
      int partyId, boolean success, boolean isFollowed, java.math.BigInteger followedId)
  {

    super(partyId);
    this.success = success;
    this.isFollowed = isFollowed;
    this.followedId = followedId;
  }

  @Override
  public int getProtocolId()
  {
    return 5581;
  }

  @Override
  public void serialize(DataWriter writer)
  {

    super.serialize(writer);

    int _loc2_ = 0;
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.success, 0);
    _loc2_ = BooleanByteWrapper.setFlag(_loc2_, this.isFollowed, 1);
    writer.write_i8(_loc2_);
    writer.write_ui64(this.followedId);
  }

  @Override
  public void deserialize(DataReader reader)
  {

    super.deserialize(reader);

    int _loc2_ = reader.read_i8();
    this.success = BooleanByteWrapper.getFlag(_loc2_, 0);
    this.isFollowed = BooleanByteWrapper.getFlag(_loc2_, 1);
    this.followedId = reader.read_ui64();
  }

  @Override
  public String toString()
  {

    return "PartyFollowStatusUpdateMessage("
        + "partyId="
        + this.partyId
        + ", success="
        + this.success
        + ", isFollowed="
        + this.isFollowed
        + ", followedId="
        + this.followedId
        + ')';
  }
}
