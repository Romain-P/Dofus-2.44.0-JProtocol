// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterSelectionWithRemodelMessage
    extends com.ankamagames.dofus.network.messages.game.character.choice.CharacterSelectionMessage {
  public static final int PROTOCOL_ID = 6549;
  // com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation
  public com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation remodel;

  public CharacterSelectionWithRemodelMessage() {}

  public CharacterSelectionWithRemodelMessage(
      long id,
      com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation remodel) {

    super(id);
    this.remodel = remodel;
  }

  @Override
  public int getProtocolId() {
    return 6549;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    this.remodel.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.remodel =
        new com.ankamagames.dofus.network.types.game.character.choice.RemodelingInformation();
    this.remodel.deserialize(reader);
  }

  @Override
  public String toString() {

    return "CharacterSelectionWithRemodelMessage("
        + "id="
        + this.id
        + ", remodel="
        + this.remodel
        + ')';
  }
}
