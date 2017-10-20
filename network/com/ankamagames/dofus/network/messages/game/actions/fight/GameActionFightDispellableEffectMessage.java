// Created by Heat the 2017-10-20 01:53:22+02:00
package com.ankamagames.dofus.network.messages.game.actions.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameActionFightDispellableEffectMessage
    extends com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage {
  public static final int PROTOCOL_ID = 6070;
  // com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect
  public com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect
      effect;

  public GameActionFightDispellableEffectMessage() {}

  public GameActionFightDispellableEffectMessage(
      short actionId,
      double sourceId,
      com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect
          effect) {

    super(actionId, sourceId);
    this.effect = effect;
  }

  @Override
  public int getProtocolId() {
    return 6070;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_ui16(this.effect.getProtocolId());
    this.effect.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);

    int effect_typeId = reader.read_ui16();
    this.effect =
        (com.ankamagames.dofus.network.types.game.actions.fight.AbstractFightDispellableEffect)
            InternalProtocolTypeManager.get(effect_typeId);
    this.effect.deserialize(reader);
  }

  @Override
  public String toString() {

    return "GameActionFightDispellableEffectMessage("
        + "actionId="
        + this.actionId
        + ", sourceId="
        + this.sourceId
        + ", effect="
        + this.effect
        + ')';
  }
}
