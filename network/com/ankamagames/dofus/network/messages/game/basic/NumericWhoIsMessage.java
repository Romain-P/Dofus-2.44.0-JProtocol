// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.basic;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class NumericWhoIsMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6297;
  // vi64
  public long playerId;
  // i32
  public int accountId;

  public NumericWhoIsMessage() {}

  public NumericWhoIsMessage(long playerId, int accountId) {
    this.playerId = playerId;
    this.accountId = accountId;
  }

  @Override
  public int getProtocolId() {
    return 6297;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.playerId);
    writer.write_i32(this.accountId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.playerId = reader.read_vi64();
    this.accountId = reader.read_i32();
  }

  @Override
  public String toString() {

    return "NumericWhoIsMessage("
        + "playerId="
        + this.playerId
        + ", accountId="
        + this.accountId
        + ')';
  }
}
