// Created by Heat the 2017-10-20 01:53:24+02:00
package com.ankamagames.dofus.network.messages.game.context.roleplay.delay;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameRolePlayDelayedObjectUseMessage
    extends com.ankamagames.dofus.network.messages.game.context.roleplay.delay
        .GameRolePlayDelayedActionMessage {
  public static final int PROTOCOL_ID = 6425;
  // vi16
  public short objectGID;

  public GameRolePlayDelayedObjectUseMessage() {}

  public GameRolePlayDelayedObjectUseMessage(
      double delayedCharacterId, byte delayTypeId, double delayEndTime, short objectGID) {

    super(delayedCharacterId, delayTypeId, delayEndTime);
    this.objectGID = objectGID;
  }

  @Override
  public int getProtocolId() {
    return 6425;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_vi16(this.objectGID);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.objectGID = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GameRolePlayDelayedObjectUseMessage("
        + "delayedCharacterId="
        + this.delayedCharacterId
        + ", delayTypeId="
        + this.delayTypeId
        + ", delayEndTime="
        + this.delayEndTime
        + ", objectGID="
        + this.objectGID
        + ')';
  }
}
