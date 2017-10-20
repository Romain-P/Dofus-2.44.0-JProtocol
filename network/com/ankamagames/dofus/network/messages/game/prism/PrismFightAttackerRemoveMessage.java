// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightAttackerRemoveMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5897;
  // vi16
  public short subAreaId;
  // vi16
  public short fightId;
  // vi64
  public long fighterToRemoveId;

  public PrismFightAttackerRemoveMessage() {}

  public PrismFightAttackerRemoveMessage(short subAreaId, short fightId, long fighterToRemoveId) {
    this.subAreaId = subAreaId;
    this.fightId = fightId;
    this.fighterToRemoveId = fighterToRemoveId;
  }

  @Override
  public int getProtocolId() {
    return 5897;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.subAreaId);
    writer.write_vi16(this.fightId);
    writer.write_vi64(this.fighterToRemoveId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.subAreaId = reader.read_vi16();
    this.fightId = reader.read_vi16();
    this.fighterToRemoveId = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "PrismFightAttackerRemoveMessage("
        + "subAreaId="
        + this.subAreaId
        + ", fightId="
        + this.fightId
        + ", fighterToRemoveId="
        + this.fighterToRemoveId
        + ')';
  }
}
