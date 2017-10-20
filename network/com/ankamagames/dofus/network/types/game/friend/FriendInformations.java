// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class FriendInformations
    extends com.ankamagames.dofus.network.types.game.friend.AbstractContactInformations {
  public static final int PROTOCOL_ID = 78;
  // i8
  public byte playerState;
  // vi16
  public short lastConnection;
  // i32
  public int achievementPoints;

  public FriendInformations() {}

  public FriendInformations(
      int accountId,
      java.lang.String accountName,
      byte playerState,
      short lastConnection,
      int achievementPoints) {

    super(accountId, accountName);
    this.playerState = playerState;
    this.lastConnection = lastConnection;
    this.achievementPoints = achievementPoints;
  }

  @Override
  public int getProtocolId() {
    return 78;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i8(this.playerState);
    writer.write_vi16(this.lastConnection);
    writer.write_i32(this.achievementPoints);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerState = reader.read_i8();
    this.lastConnection = reader.read_vi16();
    this.achievementPoints = reader.read_i32();
  }

  @Override
  public String toString() {

    return "FriendInformations("
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
        + ')';
  }
}
