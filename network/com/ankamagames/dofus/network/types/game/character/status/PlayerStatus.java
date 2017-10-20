// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character.status;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PlayerStatus extends NetworkType {
  public static final int PROTOCOL_ID = 415;
  // i8
  public byte statusId;

  public PlayerStatus() {}

  public PlayerStatus(byte statusId) {
    this.statusId = statusId;
  }

  @Override
  public int getProtocolId() {
    return 415;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.statusId);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.statusId = reader.read_i8();
  }

  @Override
  public String toString() {

    return "PlayerStatus(" + "statusId=" + this.statusId + ')';
  }
}
