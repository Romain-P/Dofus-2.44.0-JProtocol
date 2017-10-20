// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolListMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6585;
  // array,vi16
  public short[] chosenIdols;
  // array,vi16
  public short[] partyChosenIdols;
  // array,com.ankamagames.dofus.network.types.game.idol.PartyIdol
  public com.ankamagames.dofus.network.types.game.idol.PartyIdol[] partyIdols;

  public IdolListMessage() {}

  public IdolListMessage(
      short[] chosenIdols,
      short[] partyChosenIdols,
      com.ankamagames.dofus.network.types.game.idol.PartyIdol[] partyIdols) {
    this.chosenIdols = chosenIdols;
    this.partyChosenIdols = partyChosenIdols;
    this.partyIdols = partyIdols;
  }

  public IdolListMessage(
      short[] chosenIdols,
      short[] partyChosenIdols,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.idol.PartyIdol> partyIdols) {
    this.chosenIdols = chosenIdols;
    this.partyChosenIdols = partyChosenIdols;
    this.partyIdols =
        partyIdols.toArray(com.ankamagames.dofus.network.types.game.idol.PartyIdol[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6585;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(chosenIdols.length);
    writer.write_array_vi16(this.chosenIdols);
    writer.write_ui16(partyChosenIdols.length);
    writer.write_array_vi16(this.partyChosenIdols);
    writer.write_ui16(partyIdols.length);

    for (int i = 0; i < partyIdols.length; i++) {

      writer.write_ui16(partyIdols[i].getProtocolId());

      partyIdols[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int chosenIdols_length = reader.read_ui16();
    this.chosenIdols = reader.read_array_vi16(chosenIdols_length);

    int partyChosenIdols_length = reader.read_ui16();
    this.partyChosenIdols = reader.read_array_vi16(partyChosenIdols_length);

    int partyIdols_length = reader.read_ui16();
    this.partyIdols =
        new com.ankamagames.dofus.network.types.game.idol.PartyIdol[partyIdols_length];

    for (int i = 0; i < partyIdols_length; i++) {

      int partyIdols_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.idol.PartyIdol partyIdols_it =
          (com.ankamagames.dofus.network.types.game.idol.PartyIdol)
              InternalProtocolTypeManager.get(partyIdols_it_typeId);

      partyIdols_it.deserialize(reader);
      this.partyIdols[i] = partyIdols_it;
    }
  }

  @Override
  public String toString() {

    return "IdolListMessage("
        + "chosenIdols="
        + java.util.Arrays.toString(this.chosenIdols)
        + ", partyChosenIdols="
        + java.util.Arrays.toString(this.partyChosenIdols)
        + ", partyIdols="
        + java.util.Arrays.toString(this.partyIdols)
        + ')';
  }
}
