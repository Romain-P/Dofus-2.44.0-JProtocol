// Created by Heat the 2017-10-20 01:53:26+02:00
package com.ankamagames.dofus.network.messages.game.prism;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class PrismFightAttackerAddMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 5893;
  // vi16
  public short subAreaId;
  // vi16
  public short fightId;
  // com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
  public com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
      attacker;

  public PrismFightAttackerAddMessage() {}

  public PrismFightAttackerAddMessage(
      short subAreaId,
      short fightId,
      com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations
          attacker) {
    this.subAreaId = subAreaId;
    this.fightId = fightId;
    this.attacker = attacker;
  }

  @Override
  public int getProtocolId() {
    return 5893;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi16(this.subAreaId);
    writer.write_vi16(this.fightId);
    writer.write_ui16(this.attacker.getProtocolId());
    this.attacker.serialize(writer);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.subAreaId = reader.read_vi16();
    this.fightId = reader.read_vi16();

    int attacker_typeId = reader.read_ui16();
    this.attacker =
        (com.ankamagames.dofus.network.types.game.character.CharacterMinimalPlusLookInformations)
            InternalProtocolTypeManager.get(attacker_typeId);
    this.attacker.deserialize(reader);
  }

  @Override
  public String toString() {

    return "PrismFightAttackerAddMessage("
        + "subAreaId="
        + this.subAreaId
        + ", fightId="
        + this.fightId
        + ", attacker="
        + this.attacker
        + ')';
  }
}
