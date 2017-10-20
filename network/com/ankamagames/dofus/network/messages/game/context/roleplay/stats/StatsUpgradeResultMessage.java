// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.stats;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class StatsUpgradeResultMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5609;
  // i8
  public byte result;
  // vi16
  public short nbCharacBoost;

  public StatsUpgradeResultMessage() {}

  public StatsUpgradeResultMessage(byte result, short nbCharacBoost) {
    this.result = result;
    this.nbCharacBoost = nbCharacBoost;
  }

  @Override
  public int getProtocolId() {
    return 5609;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.result);
    writer.write_vi16(this.nbCharacBoost);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.result = reader.read_i8();
    this.nbCharacBoost = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "StatsUpgradeResultMessage("
        + "result="
        + this.result
        + ", nbCharacBoost="
        + this.nbCharacBoost
        + ')';
  }
}
