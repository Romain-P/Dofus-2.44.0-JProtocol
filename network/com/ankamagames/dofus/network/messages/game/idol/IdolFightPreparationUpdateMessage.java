// Created by Heat the 2017-10-20 01:53:25+02:00
package com.ankamagames.dofus.network.messages.game.idol;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IdolFightPreparationUpdateMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 6586;
  // i8
  public byte idolSource;
  // array,com.ankamagames.dofus.network.types.game.idol.Idol
  public com.ankamagames.dofus.network.types.game.idol.Idol[] idols;

  public IdolFightPreparationUpdateMessage() {}

  public IdolFightPreparationUpdateMessage(
      byte idolSource, com.ankamagames.dofus.network.types.game.idol.Idol[] idols) {
    this.idolSource = idolSource;
    this.idols = idols;
  }

  public IdolFightPreparationUpdateMessage(
      byte idolSource,
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.idol.Idol> idols) {
    this.idolSource = idolSource;
    this.idols = idols.toArray(com.ankamagames.dofus.network.types.game.idol.Idol[]::new);
  }

  @Override
  public int getProtocolId() {
    return 6586;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_i8(this.idolSource);
    writer.write_ui16(idols.length);

    for (int i = 0; i < idols.length; i++) {

      writer.write_ui16(idols[i].getProtocolId());

      idols[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {
    this.idolSource = reader.read_i8();

    int idols_length = reader.read_ui16();
    this.idols = new com.ankamagames.dofus.network.types.game.idol.Idol[idols_length];

    for (int i = 0; i < idols_length; i++) {

      int idols_it_typeId = reader.read_ui16();
      com.ankamagames.dofus.network.types.game.idol.Idol idols_it =
          (com.ankamagames.dofus.network.types.game.idol.Idol)
              InternalProtocolTypeManager.get(idols_it_typeId);

      idols_it.deserialize(reader);
      this.idols[i] = idols_it;
    }
  }

  @Override
  public String toString() {

    return "IdolFightPreparationUpdateMessage("
        + "idolSource="
        + this.idolSource
        + ", idols="
        + java.util.Arrays.toString(this.idols)
        + ')';
  }
}
