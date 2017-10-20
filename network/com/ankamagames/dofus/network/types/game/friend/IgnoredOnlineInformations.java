// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.friend;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IgnoredOnlineInformations
    extends com.ankamagames.dofus.network.types.game.friend.IgnoredInformations {
  public static final int PROTOCOL_ID = 105;
  // vi64
  public long playerId;
  // str
  public java.lang.String playerName;
  // i8
  public byte breed;
  // bool
  public boolean sex;

  public IgnoredOnlineInformations() {}

  public IgnoredOnlineInformations(
      int accountId,
      java.lang.String accountName,
      long playerId,
      java.lang.String playerName,
      byte breed,
      boolean sex) {

    super(accountId, accountName);
    this.playerId = playerId;
    this.playerName = playerName;
    this.breed = breed;
    this.sex = sex;
  }

  @Override
  public int getProtocolId() {
    return 105;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi64(this.playerId);
    writer.write_str(this.playerName);
    writer.write_i8(this.breed);
    writer.write_bool(this.sex);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.playerId = reader.read_vi64();
    this.playerName = reader.read_str();
    this.breed = reader.read_i8();
    this.sex = reader.read_bool();
  }

  @Override
  public String toString() {

    return "IgnoredOnlineInformations("
        + "accountId="
        + this.accountId
        + ", accountName="
        + this.accountName
        + ", playerId="
        + this.playerId
        + ", playerName="
        + this.playerName
        + ", breed="
        + this.breed
        + ", sex="
        + this.sex
        + ')';
  }
}
