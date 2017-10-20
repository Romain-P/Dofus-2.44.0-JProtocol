// Created by Heat the 2017-10-20 01:53:27+02:00
package com.ankamagames.dofus.network.types.game.character;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class AbstractCharacterInformation extends NetworkType {
  public static final int PROTOCOL_ID = 400;
  // vi64
  public long id;

  public AbstractCharacterInformation() {}

  public AbstractCharacterInformation(long id) {
    this.id = id;
  }

  @Override
  public int getProtocolId() {
    return 400;
  }

  @Override
  public void serialize(DataWriter writer) {
    writer.write_vi64(this.id);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.id = reader.read_vi64();
  }

  @Override
  public String toString() {

    return "AbstractCharacterInformation(" + "id=" + this.id + ')';
  }
}
