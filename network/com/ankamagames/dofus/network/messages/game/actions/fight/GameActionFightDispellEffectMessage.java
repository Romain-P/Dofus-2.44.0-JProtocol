// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightDispellEffectMessage
    extends com.ankamagames.dofus.network.messages.game.actions.fight
        .GameActionFightDispellMessage {
  public static final int PROTOCOL_ID = 6113;
  // i32
  public int boostUID;

  public GameActionFightDispellEffectMessage() {}

  public GameActionFightDispellEffectMessage(
      short actionId, double sourceId, double targetId, int boostUID) {

    super(actionId, sourceId, targetId);
    this.boostUID = boostUID;
  }

  @Override
  public int getProtocolId() {
    return 6113;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_i32(this.boostUID);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.boostUID = reader.read_i32();
  }

  @Override
  public String toString() {

    return "GameActionFightDispellEffectMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", boostUID="
        + this.boostUID
        + ')';
  }
}
