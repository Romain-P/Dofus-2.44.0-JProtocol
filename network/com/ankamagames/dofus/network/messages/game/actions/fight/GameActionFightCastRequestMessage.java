// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightCastRequestMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 1005;
  // vi16
  public short spellId;
  // i16
  public short cellId;

  public GameActionFightCastRequestMessage() {}

  public GameActionFightCastRequestMessage(short spellId, short cellId) {
    this.spellId = spellId;
    this.cellId = cellId;
  }

  @Override
  public int getProtocolId() {
    return 1005;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.spellId);
    writer.write_i16(this.cellId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.spellId = reader.read_vi16();
    this.cellId = reader.read_i16();
  }

  @Override
  public String toString() {

    return "GameActionFightCastRequestMessage("
        + "spellId="
        + this.spellId
        + ", cellId="
        + this.cellId
        + ')';
  }
}
