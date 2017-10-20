// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightSpellImmunityMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6221;
  // f64
  public double targetId;
  // vi16
  public short spellId;

  public GameActionFightSpellImmunityMessage() {}

  public GameActionFightSpellImmunityMessage(
      short actionId, double sourceId, double targetId, short spellId) {

    super(actionId, sourceId);
    this.targetId = targetId;
    this.spellId = spellId;
  }

  @Override
  public int getProtocolId() {
    return 6221;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_f64(this.targetId);
    writer.write_vi16(this.spellId);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.targetId = reader.read_f64();
    this.spellId = reader.read_vi16();
  }

  @Override
  public String toString() {

    return "GameActionFightSpellImmunityMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", targetId="
        + this.targetId
        + ", spellId="
        + this.spellId
        + ')';
  }
}
