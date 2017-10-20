// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network.types.game.look;

import org.heat.dofus.network.NetworkType;
import org.heat.dofus.network.NetworkMessage;
import org.heat.shared.io.DataWriter;
import org.heat.shared.io.DataReader;
import org.heat.shared.io.BooleanByteWrapper;
import com.ankamagames.dofus.network.InternalProtocolTypeManager;

@SuppressWarnings("all")
public class IndexedEntityLook extends NetworkType {
  public static final int PROTOCOL_ID = 405;
  // com.ankamagames.dofus.network.types.game.look.EntityLook
  public com.ankamagames.dofus.network.types.game.look.EntityLook look;
  // i8
  public byte index;

  public IndexedEntityLook() {}

  public IndexedEntityLook(
      com.ankamagames.dofus.network.types.game.look.EntityLook look, byte index) {
    this.look = look;
    this.index = index;
  }

  @Override
  public int getProtocolId() {
    return 405;
  }

  @Override
  public void serialize(DataWriter writer) {
    this.look.serialize(writer);
    writer.write_i8(this.index);
  }

  @Override
  public void deserialize(DataReader reader) {
    this.look = new com.ankamagames.dofus.network.types.game.look.EntityLook();
    this.look.deserialize(reader);
    this.index = reader.read_i8();
  }

  @Override
  public String toString() {

    return "IndexedEntityLook(" + "look=" + this.look + ", index=" + this.index + ')';
  }
}
