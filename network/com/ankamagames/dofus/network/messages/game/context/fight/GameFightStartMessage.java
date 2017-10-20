// Created by Heat the 2017-10-20 01:53:23+02:00
package com.ankamagames.dofus.network.messages.game.context.fight;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class GameFightStartMessage extends NetworkMessage {
  public static final int PROTOCOL_ID = 712;
  // array,com.ankamagames.dofus.network.types.game.idol.Idol
  public com.ankamagames.dofus.network.types.game.idol.Idol[] idols;

  public GameFightStartMessage() {}

  public GameFightStartMessage(com.ankamagames.dofus.network.types.game.idol.Idol[] idols) {
    this.idols = idols;
  }

  public GameFightStartMessage(
      java.util.stream.Stream<com.ankamagames.dofus.network.types.game.idol.Idol> idols) {
    this.idols = idols.toArray(com.ankamagames.dofus.network.types.game.idol.Idol[]::new);
  }

  @Override
  public int getProtocolId() {
    return 712;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_ui16(idols.length);

    for (int i = 0; i < idols.length; i++) {

      idols[i].serialize(writer);
    }
  }

  @Override
  public void deserialize(DataReader reader) {

    int idols_length = reader.read_ui16();
    this.idols = new com.ankamagames.dofus.network.types.game.idol.Idol[idols_length];

    for (int i = 0; i < idols_length; i++) {

      com.ankamagames.dofus.network.types.game.idol.Idol idols_it =
          new com.ankamagames.dofus.network.types.game.idol.Idol();

      idols_it.deserialize(reader);
      this.idols[i] = idols_it;
    }
  }

  @Override
  public String toString() {

    return "GameFightStartMessage(" + "idols=" + java.util.Arrays.toString(this.idols) + ')';
  }
}
