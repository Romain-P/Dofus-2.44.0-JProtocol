// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.character.choice;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class CharacterFirstSelectionMessage
    extends com.ankamagames.dofus.network.messages.game.character.choice.CharacterSelectionMessage {
  public static final int PROTOCOL_ID = 6084;
  // bool
  public boolean doTutorial;

  public CharacterFirstSelectionMessage() {}

  public CharacterFirstSelectionMessage(long id, boolean doTutorial) {

    super(id);
    this.doTutorial = doTutorial;
  }

  @Override
  public int getProtocolId() {
    return 6084;
  }

  @Override
  public void serialize(DataWriter writer) {

    super.serialize(writer);
    writer.write_bool(this.doTutorial);
  }

  @Override
  public void deserialize(DataReader reader) {

    super.deserialize(reader);
    this.doTutorial = reader.read_bool();
  }

  @Override
  public String toString() {

    return "CharacterFirstSelectionMessage("
        + "id="
        + this.id
        + ", doTutorial="
        + this.doTutorial
        + ')';
  }
}
